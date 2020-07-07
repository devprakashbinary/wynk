package com.wync.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.wync.entities.Book;
import com.wync.services.BookService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@RestController
@RequestMapping("/api")
@Api(value ="Agent CRUD Operation")
public class HelloController {
	@Autowired
	private BookService bookService;
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "Agent successfully registered"),
	        @ApiResponse(code = 401, message = "You are not authorized to register the Agent"),
	        @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
	        @ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
	        @ApiResponse(code = 400, message = "Bad Request")
		}
	)
	@PostMapping(value="/agents")
	@JsonView(Book.class)
	public  Book addAgent(@RequestBody Book book) {
		return bookService.addBook(book);
	}
}
