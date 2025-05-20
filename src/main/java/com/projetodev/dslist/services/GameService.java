package com.projetodev.dslist.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.projetodev.dslist.dto.GameMinDTO;
import com.projetodev.dslist.entities.Game;
import com.projetodev.dslist.repositories.GameRepository;

@Component //ou @Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).collect(Collectors.toList());
		return dto;
	}
}
