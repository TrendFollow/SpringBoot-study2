package me.shinsunyoung.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import me.shinsunyoung.domain.Article;
import me.shinsunyoung.dto.ArticleForm;
import me.shinsunyoung.repository.BlogMapperImpl;
import me.shinsunyoung.repository.BlogRepository;

@RequiredArgsConstructor	// final 이 붙거나 @NotNull이 붙은 필드의 생성자 추가
@Service
public class BlogServiceImpl implements BlogService{
	
	private final BlogRepository blogRepository;
	
	// 게시글 전체 조회
	public List<Article> findAll(){
		return blogRepository.findAll();
	}// findAll()
	
	// 블로그 글 추가 메서드
	public Article save(ArticleForm articleForm) {
		return blogRepository.save(articleForm.toEntity());
	}// save()
	
	// 글 하나 조회
	@Override
	public Article findById(int id) {
		return blogRepository.findById(id);
	}// findById()
	
	// 글 삭제
	@Override
	public void deleteById(int id) {
		blogRepository.deleteById(id);
	}// delete()
	
	// 글 수정
	@Override
	@Transactional
	public Article update(int id, ArticleForm articleForm) {
		Article article = articleForm.toEntity();
		article.setId(id);
		
		blogRepository.update(article);
		
		return article;
	}// update()
}
