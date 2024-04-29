package me.shinsunyoung.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import me.shinsunyoung.domain.Article;
import me.shinsunyoung.dto.ArticleForm;
import me.shinsunyoung.repository.BlogMapperImpl;

@RequiredArgsConstructor	// final 이 붙거나 @NotNull이 붙은 필드의 생성자 추가
@Service
public class BlogServiceImpl implements BlogService{
	
	private final BlogMapperImpl blogMapperImpl;
	
	// 게시글 전체 조회
	public List<Article> findAll(){
		return blogMapperImpl.findAll();
	}
	
	// 블로그 글 추가 메서드
	public Article save(ArticleForm articleForm) {
		return blogMapperImpl.save(articleForm.toEntity());
	}// save()
}
