package me.shinsunyoung;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("me.shinsunyoung.mapper")
public class SprbootDevelApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprbootDevelApplication.class, args);
	}

}
