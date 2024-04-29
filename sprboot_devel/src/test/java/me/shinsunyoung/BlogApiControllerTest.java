package me.shinsunyoung;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;

import me.shinsunyoung.domain.Article;
import me.shinsunyoung.dto.ArticleForm;
import me.shinsunyoung.repository.BlogMapperImpl;
import me.shinsunyoung.repository.BlogRepository;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
class BlogApiControllerTest {
	
	@Autowired
	protected MockMvc mockMvc;
	
	@Autowired
	protected ObjectMapper objectMapper; // 직렬화, 역직렬화를 위한 클래스
	
	@Autowired
	private WebApplicationContext context;
	
	@Autowired
	BlogRepository blogRepository;

	
	// 테스트에 작성한 코드가 실제 db에 적용이 된다.!!!!
	@BeforeEach
	public void mockMvcSetUp() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
		blogRepository.deleteAll();
	}
	
	
	@DisplayName("addArticle: 블로그 글 추가에 성공한다.")
	@Test
	@Transactional
	public void addArticle() throws Exception{
		// given
		final String url = "/api/articles";
		final String title = "title";
		final String content = "content";
		final ArticleForm articleForm = new ArticleForm(title, content);
		
		// 객체 JSON으로 직렬화
		final String requestBody = objectMapper.writeValueAsString(articleForm);
		
		// when
		ResultActions result = mockMvc.perform(get(url).contentType(MediaType.APPLICATION_JSON_VALUE).content(requestBody));
		
		// then
		result.andExpect(status().isCreated());
		
		List<Article> articles = blogRepository.findAll();
		
		assertThat(articles.get(0).getTitle()).isEqualTo(title);
		assertThat(articles.get(0).getContent()).isEqualTo(content);
	}

}
