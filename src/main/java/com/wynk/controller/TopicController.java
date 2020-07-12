package com.wynk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.wynk.entities.Topic;
import com.wynk.exceptions.WynkServiceException;
import com.wynk.services.TopicService;
import com.wynk.views.TopicView.TopicBasicView;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api")
@Api(value ="Topic CRUD Operation")

public class TopicController {

	@Autowired
	private TopicService topicService;
	
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "Agent successfully registered"),
	        @ApiResponse(code = 401, message = "You are not authorized to register the Agent"),
	        @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
	        @ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
	        @ApiResponse(code = 400, message = "Bad Request")
		}
	)
	
	
	@ApiOperation(value ="add topic")
	@PostMapping(value="/topics")
	@JsonView(Topic.class)
	public  Topic addTopic(@RequestBody Topic topic) {
		return topicService.addTopic(topic);
	}
	
	@ApiOperation(value ="Get topic by id")
	@GetMapping(value="/topics/{id}")		
	@JsonView(TopicBasicView.class)
	public  Topic getTopic(@PathVariable Long id)  throws WynkServiceException {
		Topic topic = topicService.getTopic(id);
		System.out.println(topic);
		return topic;
	}
	
	@ApiOperation(value ="update topic")
	@PutMapping("/topics/{id}")
	@JsonView(TopicBasicView.class)
	public Topic updateTopic(@PathVariable Long id, @RequestBody Topic topic) throws WynkServiceException {
		return topicService.updateTopic(id, topic);
	}
	
	@ApiOperation(value ="Get all topic")
	@GetMapping(value="/topics")
	@JsonView(TopicBasicView.class)
	public  Iterable<Topic> getTopics() {
		return topicService.getTopics();
	}
	
	@ApiOperation(value ="Delete topic")
	@DeleteMapping(value="/topics/{id}")
	@JsonView(Topic.class)
	public  void deleteTopic(@PathVariable Long id) {
		 topicService.deleteTopics(id);
	}
}
