package com.reservance.reservance.model;

import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_estabelecimentos")
public class Estabelecimento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String funcionamento_dia;
	
	@JsonFormat(pattern = "HH:mm")
	private LocalTime hora_inicio;
	
	@JsonFormat(pattern = "HH:mm")
	private LocalTime hora_fim;
	
	private int num_mesas;

	public Estabelecimento() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFuncionamento_dia() {
		return funcionamento_dia;
	}

	public void setFuncionamento_dia(String funcionamento_dia) {
		this.funcionamento_dia = funcionamento_dia;
	}

	public LocalTime getHora_inicio() {
		return hora_inicio;
	}

	public void setHora_inicio(LocalTime hora_inicio) {
		this.hora_inicio = hora_inicio;
	}

	public LocalTime getHora_fim() {
		return hora_fim;
	}

	public void setHora_fim(LocalTime hora_fim) {
		this.hora_fim = hora_fim;
	}

	public int getNum_mesas() {
		return num_mesas;
	}

	public void setNum_mesas(int num_mesas) {
		this.num_mesas = num_mesas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((funcionamento_dia == null) ? 0 : funcionamento_dia.hashCode());
		result = prime * result + ((hora_fim == null) ? 0 : hora_fim.hashCode());
		result = prime * result + ((hora_inicio == null) ? 0 : hora_inicio.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + num_mesas;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estabelecimento other = (Estabelecimento) obj;
		if (funcionamento_dia == null) {
			if (other.funcionamento_dia != null)
				return false;
		} else if (!funcionamento_dia.equals(other.funcionamento_dia))
			return false;
		if (hora_fim == null) {
			if (other.hora_fim != null)
				return false;
		} else if (!hora_fim.equals(other.hora_fim))
			return false;
		if (hora_inicio == null) {
			if (other.hora_inicio != null)
				return false;
		} else if (!hora_inicio.equals(other.hora_inicio))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (num_mesas != other.num_mesas)
			return false;
		return true;
	}
	
}
