package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;

@RestController
@RequestMapping("/books")
public class BookController {

	@Autowired
	private BookRepository bookRepository;

	@GetMapping
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	@PostMapping
	public Book createBook(@RequestBody Book book) {
		return bookRepository.save(book);
	}

	@PutMapping("/{id}")
	public Book updateBook(@PathVariable Long id, @RequestBody Book bookDetails) {
		Book book = bookRepository.findById(id).orElseThrow();
		book.setTitle(bookDetails.getTitle());
		book.setAuthor(bookDetails.getAuthor());
		return bookRepository.save(book);
	}

	@DeleteMapping("/{id}")
	public void deleteBook(@PathVariable Long id) {
		bookRepository.deleteById(id);
	}
}