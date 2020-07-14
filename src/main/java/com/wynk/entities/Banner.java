package com.wynk.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonView;
import com.wynk.views.BannerView.BannerBasicView;

@Entity
public class Banner implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonView(BannerBasicView.class)
	private Long id;
	
	@JsonView(BannerBasicView.class)
	private String name;

	@JsonView(BannerBasicView.class)
	private String imageUrl;
	
	@JsonView(BannerBasicView.class)
	private Long albumId; 
	
	@JsonView(BannerBasicView.class)
	private Long langId;
	
	private Boolean isDeleted = Boolean.FALSE;
	
	public Banner() {
		super();
	}
	
	public Banner(Long id, String name, Long albumId, Long langId) {
		super();
		this.id = id;
		this.name = name;
		this.albumId = albumId;
		this.langId = langId;
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

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Long getAlbumId() {
		return albumId;
	}

	public void setAlbumId(Long albumId) {
		this.albumId = albumId;
	}

	public Long getLangId() {
		return langId;
	}

	public void setLangId(Long langId) {
		this.langId = langId;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	
	
}
