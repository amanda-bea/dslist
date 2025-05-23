package com.projetodev.dslist.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.projetodev.dslist.dto.GameListDTO;
import com.projetodev.dslist.dto.GameMinDTO;
import com.projetodev.dslist.entities.GameList;
import com.projetodev.dslist.repositories.GameListRepository;

@Component //ou @Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true) //não vai fazer nenhuma alteração no banco de dados
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).collect(Collectors.toList());
		return dto;
	}
	
	
}
