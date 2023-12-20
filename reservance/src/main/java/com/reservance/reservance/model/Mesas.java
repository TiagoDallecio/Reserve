package com.reservance.reservance.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_mesas")

public class Mesas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@ManyToOne
	@JoinColumn(name = "estab")
	private Estabelecimento estab;
	
	private int numero;
	private int lugares;
	private boolean disponivel;
	
	public Mesas() {
		
	}
	
	public Mesas(Long id, Estabelecimento est, int numero, int lugares, boolean disponivel) {
		super();
		Id = id;
		estab = est;
		this.numero = numero;
		this.lugares = lugares;
		this.disponivel = disponivel;
	}



	public Estabelecimento getEst() {
		return estab;
	}
	public void setEst(Estabelecimento est) {
		estab = est;
	}
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getLugares() {
		return lugares;
	}
	public void setLugares(int lugares) {
		this.lugares = lugares;
	}
	
	public boolean isDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estab == null) ? 0 : estab.hashCode());
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		result = prime * result + (disponivel ? 1231 : 1237);
		result = prime * result + lugares;
		result = prime * result + numero;
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
		Mesas other = (Mesas) obj;
		if (estab == null) {
			if (other.estab != null)
				return false;
		} else if (!estab.equals(other.estab))
			return false;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		if (disponivel != other.disponivel)
			return false;
		if (lugares != other.lugares)
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}
	

	
	

	
	
	

}
