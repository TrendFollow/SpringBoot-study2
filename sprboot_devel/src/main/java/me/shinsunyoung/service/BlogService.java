package me.shinsunyoung.service;

import java.util.List;

import me.shinsunyoung.domain.Article;
import me.shinsunyoung.dto.ArticleForm;

public interface BlogService {
	
	// 게시글 전체 조회
	public List<Article> findAll();
	
	// 블로그 글 추가 메서드
	public Article save(ArticleForm articleForm);
}
