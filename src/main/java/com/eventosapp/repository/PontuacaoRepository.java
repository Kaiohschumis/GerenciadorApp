package com.eventosapp.repository;



import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.eventosapp.models.Pontuacao;

public interface PontuacaoRepository extends CrudRepository<Pontuacao, String>{
	Pontuacao findByCodigo(long codigo);
	
	//@Query(value = "SELECT min(placar) FROM pontuacao*")
	//public int min();
	
	//@Query(value = "SELECT max(placar) FROM pontuacao")
	//public int max();
	
	//pegar a maior pontuacao e ver se a pontuacao que está sendo inserida pe maior que a maior pontuacao
	//se for dai tu atualiza
}
