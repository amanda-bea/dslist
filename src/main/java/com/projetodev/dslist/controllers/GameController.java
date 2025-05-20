package com.projetodev.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetodev.dslist.dto.GameMinDTO;
import com.projetodev.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games") //mapeia a URL
public class GameController {
	@Autowired
	private GameService gameService;
	
	@GetMapping //porque é uma requisição do tipo GET
	public List<GameMinDTO> findAll() {
		List<GameMinDTO> result = gameService.findAll();
		return result;
	}

}
