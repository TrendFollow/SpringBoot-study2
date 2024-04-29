package me.shinsunyoung.service;

import java.util.List;

import me.shinsunyoung.domain.Article;
import me.shinsunyoung.dto.ArticleForm;

public interface BlogService {
	
	// 게시글 전체 조회
	public List<Article> findAll();
	
	// 블로그 글 추가 메서드
	public Article save(ArticleForm articleForm);
	
	// 글 하나 조회
	public Article findById(int id);
	
	// 글 삭제
	public void deleteById(int id);
	
	// 글 수정
	public Article update(int id, ArticleForm articleForm);
}
