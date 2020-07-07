package com.wync.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wync.entities.Book;
import com.wync.repositories.BookRepository;

@Service
public class BookService {
 
    @Autowired
    private BookRepository bookRepository;
 
    public List<Book> list() {
        return bookRepository.findAll();
    }
    
   

	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		return bookRepository.save(book);
	}
}