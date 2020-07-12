package com.wynk.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wynk.entities.Book;
import com.wynk.repositories.BookRepository;

@Service
public class BookService {
 
    @Autowired
    private BookRepository bookRepository;
 
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		return bookRepository.save(book);
	}
	
	public Book getBook(Long id) {
		return bookRepository.findById(id).orElse(null);
	}
}