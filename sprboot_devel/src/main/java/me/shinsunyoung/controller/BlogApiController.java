package me.shinsunyoung.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import me.shinsunyoung.domain.Article;
import me.shinsunyoung.dto.ArticleForm;
import me.shinsunyoung.service.BlogService;
import me.shinsunyoung.service.BlogServiceImpl;

@RequiredArgsConstructor
@RestController
public class BlogApiController {
	
	private final BlogService blogService;
	
	// 게시글 전체 조회
	@GetMapping("/api/articles")
	public ResponseEntity<List<Article>> findAll(){
		List<Article> articles = blogService.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(articles);
	}
	
	// 글 하나 조회
	@GetMapping("/api/articles/{id}")
	public ResponseEntity<Article> findArticle(@PathVariable("id") int id){
		Article article = blogService.findById(id);
		return ResponseEntity.ok(article);
	}
	
	// 게시글 추가
	@PostMapping("/api/articles")
	public ResponseEntity<Article> addArticle(@RequestBody ArticleForm articleForm){
		Article savedArticle = blogService.save(articleForm);
		
		// 요청한 자원이 성공적으로 생성되었으며 저장된 블로그 글 정보를 전송
		return ResponseEntity.status(HttpStatus.CREATED).body(savedArticle);
	}// addArticle()
	
	
	// 글 삭제
	@DeleteMapping("/api/articles/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable("id") int id){
		blogService.deleteById(id);
		return ResponseEntity.ok().build();
	}
	
	// 글 수정
	@PutMapping("/api/articles/{id}")
	public ResponseEntity<Article> update(@PathVariable("id") int id, @RequestBody ArticleForm articleForm){
		System.out.println(articleForm.getContent());
		Article article =blogService.update(id, articleForm);
		return ResponseEntity.ok().body(article);
	}
	
}
