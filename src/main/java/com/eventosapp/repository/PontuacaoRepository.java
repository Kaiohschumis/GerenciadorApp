package com.eventosapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventosapp.models.Pontuacao;

public interface PontuacaoRepository extends CrudRepository<Pontuacao, String>{
	Pontuacao findByCodigo(long codigo);
}
