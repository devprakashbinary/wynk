package com.wynk.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.fasterxml.jackson.annotation.JsonView;

import com.wynk.views.TopicView.TopicBasicView;



@Entity
public class Topic implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonView({TopicBasicView.class})
	private Long id;
	
	@JsonView({TopicBasicView.class})
	private String name; 
	
	@JsonView({TopicBasicView.class})
	private String description;
	
	public Topic() {
	}
	public Topic(Long id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
