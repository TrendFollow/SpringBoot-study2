package me.shinsunyoung.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import lombok.RequiredArgsConstructor;
import me.shinsunyoung.domain.Article;
import me.shinsunyoung.dto.ArticleForm;
import me.shinsunyoung.service.BlogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequiredArgsConstructor
public class BlogViewController {
	
	private final BlogService blogService;
	
	@GetMapping("/articles")
	public String getArticles(Model model) {
		List<Article> articles = blogService.findAll();
		model.addAttribute("articles", articles);
		
		return "articleList";
	}
}
