package me.shinsunyoung.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;
import me.shinsunyoung.domain.Article;
import me.shinsunyoung.mapper.BlogMapper;

@Repository
@RequiredArgsConstructor
public class BlogMapperImpl implements BlogRepository{
	
	private final BlogMapper blogMapper;
	
	// 게시글 저장
	public Article save(Article article) {
		blogMapper.save(article);
		return blogMapper.selectLastOne();
	}// save()
	
	// 게시글 전체 삭제
	public void deleteAll() {
		blogMapper.deleteAll();
	}//deleteAll()
	
	// 게시글 전체 조회
	public List<Article> findAll(){
		return blogMapper.findAll();
	}
	
	// 글 하나 조회
	@Override
	public Article findById(int id) {
		return blogMapper.findById(id);
	}
	
	// 글 삭제
	@Override
	public void deleteById(int id) {
		blogMapper.deleteById(id);
	}
	
	// 글 수정
	@Override
	public void update(Article article) {
		blogMapper.update(article);
	}
}
