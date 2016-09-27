/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.sabordemel.model;

import br.sabordemel.model.entidades.Produto;

/**
 *
 * @author Dhiego
 */
public class ItemVenda  {
    private Long idItemVenda;
    private Produto produto;
    private Integer quantidade;
    
    public ItemVenda(Long idItemVenda, Integer quantidade){
        this.idItemVenda = idItemVenda;
        this.quantidade = quantidade;
    }

    public Long getIdItemVenda() {
        return idItemVenda;
    }

    public void setIdItemVenda(Long idItemVenda) {
        this.idItemVenda = idItemVenda;
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
