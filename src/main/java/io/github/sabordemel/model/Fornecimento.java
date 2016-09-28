/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.sabordemel.model;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author dhiego.balthazar
 */

@Entity
@Table
public class Fornecimento implements Serializable{
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -5708677461255185358L;
	
	@Id
	@Column
	@GeneratedValue
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
