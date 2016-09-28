/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.sabordemel.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;



/**
 *
 * @author dhiego.balthazar
 */

@Entity
@Table
public class Funcionario extends Pessoa implements Serializable{

    private Long idFuncionario;
    private String nomeUsuario;
    private String senha;
    private List<Venda> vendas;

    public Funcionario(){
        
        vendas = new ArrayList<Venda>();
        
    }

    public Long getIdFuncionario(){
    	return this.idFuncionario;
    }
    
    public void setIdFuncionario(Long idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Venda> getVendas() {
        return vendas;
    }
    
    public void addVendas(Venda venda){
    	venda.setVendedor(this);
    	vendas.add(venda);
    }

}
