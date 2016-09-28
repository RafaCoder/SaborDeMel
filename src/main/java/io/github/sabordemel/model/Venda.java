/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.sabordemel.model;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author dhiego.balthazar
 */

@Entity
@Table
public class Venda implements Serializable{
	
	private Long idVenda;
	private ArrayList<ItemVenda> itens;
	private Double valorTotal;
	private Funcionario vendedor;
	private Cliente cliente;
	private String dataVenda;
	private FormaDePagamento formaDePagamento;
	
	public Venda(Long idVenda, Funcionario vendedor, Cliente cliente){
		itens = new ArrayList<ItemVenda>();
		this.vendedor = vendedor;
		this.cliente = cliente;
		//contrutor incompleto falta metodos para completa-lo**************
	}

	public Long getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(Long idVenda) {
		this.idVenda = idVenda;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Funcionario getVendedor() {
		return vendedor;
	}

	public void setVendedor(Funcionario vendedor) {
		this.vendedor = vendedor;
	}

	public Object getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	}

	public FormaDePagamento getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}
	
	public void addItem(ItemVenda item){
		itens.add(item);
	}
	
	public ArrayList<ItemVenda> getItens() {
		return itens;
	}
}