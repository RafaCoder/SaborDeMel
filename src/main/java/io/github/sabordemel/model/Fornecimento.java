/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.sabordemel.model;

import java.util.ArrayList;
import br.sabordemel.model.agregados.ItemFornecimento;

/**
 *
 * @author dhiego.balthazar
 */
public class Fornecimento {
    private Long idFornecimento;
    private Fornecedor fornecedor;
    private String dataFornecimento;
    private ArrayList<ItemFornecimento> itens;
    
    public Fornecimento(Long idFornecimento,
            Fornecedor fornecedor,
            String dataFornecimento){
        
        itens = new ArrayList<ItemFornecimento>();
        this.idFornecimento = idFornecimento;
        this.fornecedor = fornecedor;
        this.dataFornecimento = dataFornecimento;
    }

    public Long getIdFornecimento() {
        return idFornecimento;
    }

    public void setIdFornecimento(Long idFornecimento) {
        this.idFornecimento = idFornecimento;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getDataFornecimento() {
        return dataFornecimento;
    }

    public void setDataFornecimento(String dataFornecimento) {
        this.dataFornecimento = dataFornecimento;
    }

    public ArrayList<ItemFornecimento> getItens() {
        return itens;
    }
    
    public void addItens(ItemFornecimento itemFornecimento){
    	itens.add(itemFornecimento);
    }
}
