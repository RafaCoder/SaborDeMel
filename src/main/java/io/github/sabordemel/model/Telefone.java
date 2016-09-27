/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.sabordemel.model;

import br.sabordemel.model.entidades.Pessoa;

/**
 *
 * @author dhiego.balthazar
 */
public class Telefone {
	private Long idTelefone;
	private Pessoa pessoa;
	private String ddd;
	private String numero;
	
	public Telefone(Long idTelefone, String ddd, String numero){
		this.idTelefone = idTelefone;
		this.ddd = ddd;
		this.numero = numero;
	}

	public Long getIdTelefone() {
		return idTelefone;
	}

	public void setIdTelefone(Long idTelefone) {
		this.idTelefone = idTelefone;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}	
}
