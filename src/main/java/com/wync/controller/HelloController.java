package com.wync.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@RestController
@RequestMapping("/api")
@Api(value ="Agent CRUD Operation")
public class HelloController {
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "Agent successfully registered"),
	        @ApiResponse(code = 401, message = "You are not authorized to register the Agent"),
	        @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
	        @ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
	        @ApiResponse(code = 400, message = "Bad Request")
		}
	)
	@RequestMapping("/agents")
	public String getAgent() {
		return "HI";
	}
}
