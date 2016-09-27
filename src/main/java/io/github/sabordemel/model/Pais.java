package io.github.sabordemel.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Pais implements Serializable{
	
	@Id
	@Column
	@GeneratedValue
	private Long idPais;
	
	@Column
	private String pais;
	
	public Pais(){
		
	}

	public Long getIdPais() {
		return idPais;
	}

	public void setIdPais(Long idPais) {
		this.idPais = idPais;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
}
