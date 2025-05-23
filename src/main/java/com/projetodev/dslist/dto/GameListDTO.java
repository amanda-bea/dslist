package com.projetodev.dslist.dto;


import com.projetodev.dslist.entities.GameList;

public class GameListDTO {
	private Long id;
	private String name;
	
	public GameListDTO() {
	}
	
	public GameListDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public GameListDTO(GameList entity) { 
		id = entity.getId();
		name = entity.getName();
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
	
	
}
