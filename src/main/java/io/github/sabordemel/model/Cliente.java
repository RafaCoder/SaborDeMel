/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.sabordemel.model;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author a1655086
 */
public class Cliente extends Pessoa implements Serializable {

	@Id
	@Column
	@GeneratedValue
	private Long idCliente;
	private ArrayList<Venda> compras;

	public Cliente(Long idPessoa, String nome, Documento documento, String eMail, String dataNascimento,
			Long idCliente) {

		super(idPessoa, nome, documento, eMail, dataNascimento);

		this.idCliente = idCliente;
	}

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
