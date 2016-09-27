/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.sabordemel.model;

import br.sabordemel.model.agregados.Documento;

/**
 *
 * @author Dhiego
 */
public class Fornecedor extends Pessoa{
    
    private Long idFornecedor;
    private String nomeFantasia;
    
    public Fornecedor(
            Long idPessoa,
            String nome,
            Documento documento,
            String eMail,
            String dataNascimento,
            Long idFornecedor,
            String nomeFantasia) {
        
        super(idPessoa, nome, documento, eMail, dataNascimento);
        
        this.idFornecedor = idFornecedor;
        this.nomeFantasia = nomeFantasia;
    }

    public Long getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(Long idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
    
}
