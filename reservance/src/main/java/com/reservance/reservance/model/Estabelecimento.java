package com.reservance.reservance.model;

import java.util.Date;
import java.util.Objects;

public class Estabelecimento {

	private Long id;
	private String nome;
	private String funcionamento_dia;
	private Date funcionamento_hora;
	private int num_mesas;

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

	public Date getFuncionamento_hora() {
		return funcionamento_hora;
	}

	public void setFuncionamento_hora(Date funcionamento_hora) {
		this.funcionamento_hora = funcionamento_hora;
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
		result = prime * result + ((funcionamento_hora == null) ? 0 : funcionamento_hora.hashCode());
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
		if (funcionamento_hora == null) {
			if (other.funcionamento_hora != null)
				return false;
		} else if (!funcionamento_hora.equals(other.funcionamento_hora))
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
