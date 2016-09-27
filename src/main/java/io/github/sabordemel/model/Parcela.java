package io.github.sabordemel.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


public class Parcela implements Serializable{
	@Id
	@Column
	@GeneratedValue
	private Long idParcela;
	
	@Column
	private Double valorParcela;
	
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "idVenda", nullable = false)
	private Venda venda;
	
	@Column
	private boolean statusParcela;
	
	public Parcela(){
		
	}

	public Long getIdParcela() {
		return idParcela;
	}

	public void setIdParcela(Long idParcela) {
		this.idParcela = idParcela;
	}

	public Double getValorParcela() {
		return valorParcela;
	}

	public void setValorParcela(Double valorParcela) {
		this.valorParcela = valorParcela;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	public boolean isStatusParcela() {
		return statusParcela;
	}

	public void setStatusParcela(boolean statusParcela) {
		this.statusParcela = statusParcela;
	}
	
}
