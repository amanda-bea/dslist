package com.projetodev.dslist.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.projetodev.dslist.dto.GameDTO;
import com.projetodev.dslist.dto.GameMinDTO;
import com.projetodev.dslist.entities.Game;
import com.projetodev.dslist.projections.GameMinProjection;
import com.projetodev.dslist.repositories.GameRepository;

@Component //ou @Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true) //não vai fazer nenhuma alteração no banco de dados
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).collect(Collectors.toList());
		return dto;
	}
	
	@Transactional(readOnly = true) //não vai fazer nenhuma alteração no banco de dados
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		GameDTO dto = new GameDTO(result);
		return dto;
	}
	
	@Transactional(readOnly = true) //não vai fazer nenhuma alteração no banco de dados
	public List<GameMinDTO> findByList(Long listId) {
		List<GameMinProjection> result = gameRepository.searchByList(listId);
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).collect(Collectors.toList());
		return dto;
	}
	
}
