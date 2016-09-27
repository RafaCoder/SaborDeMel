/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.sabordemel.model;

/**
 *
 * @author dhiego.balthazar
 */
public class Produto {

    private Long idProduto;
    private String descricao;
    private Double valorUnitario;
    private String imagem;
    private Integer quantidade;

    public Produto(Long idProduto,
            String descricao,
            Double valorUnitario,
            String imagem,
            Integer quantidade) {

        this.idProduto = idProduto;
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
        this.imagem = imagem;
        this.quantidade = quantidade;
    }

    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    } 
}
