package com.projetodev.dslist.projections;

public interface GameMinProjection { //métodos gets correspondentes a consulta
	
	Long getId(); //método getId() que retorna o id do jogo
	String getTitle(); //método getTitle() que retorna o título do jogo
	Integer getYear(); //método getYear() que retorna o ano do jogo
	String getImgUrl(); //método getImgUrl() que retorna a URL da imagem do jogo
	String getShortDescription(); //método getShortDescription() que retorna a descrição curta do jogo
	Integer getPosition(); //método getPosition() que retorna a posição do jogo na lista
	
	

}
