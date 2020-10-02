package com.eventosapp.models;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
public class Pontuacao implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long codigo;
	
	@NotEmpty
	private String jogo;
	
	@NotNull
	private int placar;

	@NotEmpty
	private String observacao;

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getJogo() {
		return jogo;
	}

	public void setJogo(String jogo) {
		this.jogo = jogo;
	}
	
	public int getPlacar() {
		return placar;
	}

	public void setPlacar(int placar) {
		this.placar = placar;
	}

}
