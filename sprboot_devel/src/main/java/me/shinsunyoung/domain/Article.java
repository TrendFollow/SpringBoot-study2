package me.shinsunyoung.domain;

import org.springframework.stereotype.Component;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@Getter
@Setter
@NoArgsConstructor
public class Article {
	
	private int id;
	private String title;
	private String content;
	
	@Builder
	public Article(String title, String content) {
		this.title = title;
		this.content = content;
	}
	
	
}
