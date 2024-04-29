package me.shinsunyoung.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.shinsunyoung.domain.Article;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ArticleForm {
	private String title;
	private String content;
	
	public Article toEntity() {
		return Article.builder().title(this.title).content(this.content).build();
	}
}
