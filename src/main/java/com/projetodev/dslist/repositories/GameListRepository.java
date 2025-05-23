package com.projetodev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetodev.dslist.entities.Game;
import com.projetodev.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{ //Jpa recebe o tipo da entidade e o tipo do id
	// JpaRepository é uma interface do Spring Data JPA que fornece métodos para operações CRUD (Create, Read, Update, Delete) em entidades JPA.
	// O primeiro parâmetro é a entidade que você deseja manipular (neste caso, Game), e o segundo parâmetro é o tipo do identificador (neste caso, Long).
	
	
	
	

}
