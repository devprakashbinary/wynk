package com.wynk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wynk.entities.Topic;

import io.swagger.annotations.Api;

@Transactional
@Repository
@Api(value="Fetches record of topic")
public interface TopicRepository extends JpaRepository<Topic, Long> , QuerydslPredicateExecutor<Topic>{

}
 