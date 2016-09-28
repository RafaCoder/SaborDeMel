/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.sabordemel.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Dhiego
 */

@Entity
@Table
public class Fornecedor extends Pessoa implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4908170536274208091L;
	
	@Id
	@Column
	@GeneratedValue
	private Long idFornecedor;
	
	@Column
	private String nomeFantasia;
	
	@OneToMany(mappedBy = "fornecimento", targetEntity = Fornecimento.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Fornecimento> fornecimentos;
	
	public Fornecedor(){
		fornecimentos = new ArrayList<Fornecimento>();
	}

	public Long getIdFornecedor() {
		return idFornecedor;
	}

	public void setIdFornecedor(Long idFornecedor) {
		this.idFornecedor = idFornecedor;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
	public List<Fornecimento> getFornecimentos(){
		return fornecimentos;
	}

}
