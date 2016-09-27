/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.sabordemel.model;

import java.util.ArrayList;
import br.sabordemel.model.agregados.Documento;

/**
 *
 * @author dhiego.balthazar
 */
public class Funcionario extends Pessoa {

    private Long idFuncionario;
    private String nomeUsuario;
    private String senha;
    private ArrayList<Venda> vendas;

    public Funcionario(
            Long idPessoa,
            String nome,
            Documento documento,
            String eMail,
            String dataNascimento,
            Long idFuncionario,
            String nomeUsuario,
            String senha) {
        
        super(idPessoa, nome, documento, eMail, dataNascimento);
        vendas = new ArrayList<Venda>();
        this.idFuncionario = idFuncionario;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
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

    public ArrayList<Venda> getVendas() {
        return vendas;
    }
    
    public void addVendas(Venda venda){
    	venda.setVendedor(this);
    	vendas.add(venda);
    }

}
