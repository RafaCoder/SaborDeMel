/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.sabordemel.model;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author a1655086
 */
@Entity
@Table
public class Cliente extends Pessoa implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3350502675686127051L;

	@Id
	@Column
	@GeneratedValue
	private Long idCliente;
	
	@OneToMany(mappedBy = "venda", targetEntity = Venda.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private ArrayList<Venda> compras;

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public ArrayList<Venda> getCompras() {
		return compras;
	}

}
