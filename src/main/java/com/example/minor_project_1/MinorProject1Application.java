package com.example.minor_project_1;

import com.example.minor_project_1.domain.Book;
import com.example.minor_project_1.domain.Genre;
import com.example.minor_project_1.repositries.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MinorProject1Application //implements CommandLineRunner
{

	@Autowired
	private BookRepository bookRepository;
	public static void main(String[] args) {
		SpringApplication.run(MinorProject1Application.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {

//		int a = 10;
//		int b = 20;
//		System.out.println(a+b);

//		Book book = Book.builder()
//				.name("Intro to programming")
//				.genre(Genre.PROGRAMMING)
//				.build();
//		bookRepository.save(book);

	//}
}
