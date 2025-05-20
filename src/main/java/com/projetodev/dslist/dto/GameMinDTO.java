package com.projetodev.dslist.dto;

import com.projetodev.dslist.entities.Game;

public class GameMinDTO {
	private Long id;
	private String title;
	private Integer year;
	private Double score;
	private String imgUrl;
	private String shortDescription;
	
	public GameMinDTO() {
	}
	
	public GameMinDTO(Game entity) {
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.year = entity.getYear();
		this.score = entity.getScore();
		this.imgUrl = entity.getImgUrl();
		this.shortDescription = entity.getShortDescription();
	}
	
	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public Double getScore() {
		return score;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	
}


