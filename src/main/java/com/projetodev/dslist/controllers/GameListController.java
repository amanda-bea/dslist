package com.projetodev.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetodev.dslist.dto.GameListDTO;
import com.projetodev.dslist.dto.GameMinDTO;
import com.projetodev.dslist.services.GameListService;
import com.projetodev.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists") //mapeia a URL
public class GameListController {
	@Autowired
	private GameListService gameListService;
	@Autowired
	private GameService gameService;
	
	
	@GetMapping //porque é uma requisição do tipo GET
	public List<GameListDTO> findAll() {
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listId) {
		List<GameMinDTO> result = gameService.findByList(listId);
		return result;
	}
	
}
