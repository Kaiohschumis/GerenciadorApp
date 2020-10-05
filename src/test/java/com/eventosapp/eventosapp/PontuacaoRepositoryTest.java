package com.eventosapp.eventosapp;

import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.eventosapp.models.Pontuacao;
import com.eventosapp.repository.PontuacaoRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PontuacaoRepositoryTest {
	
	@Autowired
	private PontuacaoRepository pr;
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void createShouldPersistData() {
		Pontuacao pontuacao = new Pontuacao();
		this.pr.save(pontuacao);
		Assertions.assertThat(pontuacao.getCodigo()).isNotNull();
		Assertions.assertThat(pontuacao.getPlacar()).isEqualTo(0);
		Assertions.assertThat(pontuacao.getObservacao()).isEqualTo(null);
	}

}
