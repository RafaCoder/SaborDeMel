/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.sabordemel.model;

import br.sabordemel.model.entidades.Produto;

/**
 *
 * @author dhiego.balthazar
 */
public class ItemFornecimento {
    private Produto produto;
    private Integer quantidade;
    
    public ItemFornecimento(Produto produto, Integer quantidade){
        this.produto = produto;
    }

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
    
    
}
