package com.wynk.services;

import org.springframework.beans.factory.annotation.Autowired;
import com.wynk.services.MessageByLocaleService;
import org.springframework.stereotype.Service;

import com.querydsl.core.types.dsl.BooleanExpression;
import com.wynk.entities.QTopic;
import com.wynk.entities.Topic;
import com.wynk.repositories.TopicRepository;

@Service
public class TopicServiceImpl implements TopicService {

	@Autowired
	private TopicRepository topicRepository;
	
	@Autowired
	private MessageByLocaleService messageByLocaleService;
	
	

	@Override
	public Topic addTopic(Topic topic) {
		// TODO Auto-generated method stub
		return topicRepository.save(topic);
	}

	@Override
	public Topic updateTopic(Long id, Topic topic) {
		// TODO Auto-generated method stub
		topic.setId(id);
		return topicRepository.save(topic);
	}

	@Override
	public Iterable<Topic> getTopics() {
		// TODO Auto-generated method stub
		return topicRepository.findAll();
	}

	@Override
	public Topic getTopic(Long id) {
		// TODO Auto-generated method stub
		BooleanExpression expression = QTopic.topic.id.eq(id);
		return topicRepository.findOne(expression)
				.orElseThrow(() ->  new com.wynk.exceptions.EntityNotFoundException(messageByLocaleService.getMessage("hello this is the msg")));
	}

	@Override
	public void deleteTopics(Long id) {
		// TODO Auto-generated method stub
		Topic topic = getTopic(id);
		topicRepository.save(topic);
	}
	
}
