package me.shinsunyoung.repository;

import java.util.List;

import me.shinsunyoung.domain.Article;

public interface BlogRepository {
	
	// 게시글 저장
	public Article save(Article article);
	
	// 게시글 전체 삭제
	public void deleteAll();
	
	// 게시글 전체 조회
	public List<Article> findAll();
	
	// 글 하나 조회
	public Article findById(int id);
	
	// 글 삭제
	public void deleteById(int id);
	
	// 글 수정
	public void update(Article article);
}
