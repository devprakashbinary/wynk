package com.wynk.services;

import com.wynk.entities.Topic;

import io.swagger.annotations.Api;

@Api(value = "CRUD operation for Book")

public interface TopicService {

	Topic addTopic(Topic book);

	Topic updateTopic(Long id, Topic topic);

	Iterable<Topic> getTopics();

	Topic getTopic(Long id );

	void deleteTopics(Long id);

}
