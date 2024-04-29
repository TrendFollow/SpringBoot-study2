package me.shinsunyoung.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;

import me.shinsunyoung.domain.Article;

@Mapper
public interface BlogMapper {
	
	// 전체 게시글 조회
	public List<Article> findAll() throws DataAccessException;
	
	// 게시글 저장
	public void save(Article article) throws DataAccessException;
	
	// 마지막 저장된 글 조회
	public Article selectLastOne() throws DataAccessException;
	
	// 게시글 전체 삭제
	public void deleteAll() throws DataAccessException;
}
