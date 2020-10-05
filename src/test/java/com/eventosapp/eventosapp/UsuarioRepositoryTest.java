package com.eventosapp.eventosapp;

import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.eventosapp.models.Usuario;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UsuarioRepositoryTest {
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void createShouldPersistData() {
		Usuario usuario = new Usuario("Kaio", "Kaio Chumis", "senhaForte");
		Assertions.assertThat(usuario.getLogin()).isEqualTo("Kaio");
		Assertions.assertThat(usuario.getNomeCompleto()).isEqualTo("Kaio Chumis");
		Assertions.assertThat(usuario.getSenha()).isEqualTo("senhaForte");
		
	}

}
