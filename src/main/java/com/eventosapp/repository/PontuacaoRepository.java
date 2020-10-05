package com.eventosapp.repository;



import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.eventosapp.models.Pontuacao;

public interface PontuacaoRepository extends CrudRepository<Pontuacao, Long>{
	Pontuacao findByCodigo(long codigo);
	
	//@Query(value = "SELECT min(placar) FROM Pontuacao")
	//int min();
	
	//@Query(value = "SELECT max(placar) FROM Pontuacao")
	//int max();
	
	//@Query(value = "update Pontuacao set recordeMin = (recordeMin + 1) where id = ?1")
	//Long setRecordeMin();
	
	//@Query(value = "update Pontuacao set recordeMax = (recordeMax + 1) where id = ?1")
	//Long setRecordeMax();
	
	//pegar a maior pontuacao e ver se a pontuacao que está sendo inserida pe maior que a maior pontuacao
	//se for dai tu atualiza
}
