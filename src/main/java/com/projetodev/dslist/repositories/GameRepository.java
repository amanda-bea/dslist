package com.projetodev.dslist.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.projetodev.dslist.entities.Game;
import com.projetodev.dslist.projections.GameMinProjection;

public interface GameRepository extends JpaRepository<Game, Long>{ //Jpa recebe o tipo da entidade e o tipo do id
	// JpaRepository é uma interface do Spring Data JPA que fornece métodos para operações CRUD (Create, Read, Update, Delete) em entidades JPA.
	// O primeiro parâmetro é a entidade que você deseja manipular (neste caso, Game), e o segundo parâmetro é o tipo do identificador (neste caso, Long).
	
	@Query(nativeQuery = true, value = """
			SELECT tb_game.id, tb_game.title, tb_game.game_year AS `year`, tb_game.img_url AS imgUrl,
			tb_game.short_description AS shortDescription, tb_belonging.position
			FROM tb_game
			INNER JOIN tb_belonging ON tb_game.id = tb_belonging.game_id
			WHERE tb_belonging.list_id = :listId
			ORDER BY tb_belonging.position
				""")
	List<GameMinProjection> searchByList(Long listId); //atenção no :listId na query que é susbstituto pelo valor do parâmetro listId
	
	
}
