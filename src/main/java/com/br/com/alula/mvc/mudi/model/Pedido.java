package com.br.com.alula.mvc.mudi.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private LocalDate dataDaEntrega;
	private String nomeProduto;
	private String urlDoProduto;
	private String urlDaImagem;
	private String descricao;
	private BigDecimal valorNegociado;

	@Enumerated(EnumType.STRING)
	private StatusDoPedidio status;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private User user;

	public LocalDate getDataDaEntrega() {
		return dataDaEntrega;
	}

	public void setDataDaEntrega(LocalDate dataDaEntrega) {
		this.dataDaEntrega = dataDaEntrega;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getUrlDoProduto() {
		return urlDoProduto;
	}

	public void setUrlDoProduto(String urlDoProduto) {
		this.urlDoProduto = urlDoProduto;
	}

	public String getUrlDaImagem() {
		return urlDaImagem;
	}

	public void setUrlDaImagem(String urlDaImagem) {
		this.urlDaImagem = urlDaImagem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValorNegociado() {
		return valorNegociado;
	}

	public void setValorNegociado(BigDecimal valorNegociado) {
		this.valorNegociado = valorNegociado;
	}

	public StatusDoPedidio getStatus() {
		return status;
	}

	public void setStatus(StatusDoPedidio status) {
		this.status = status;
	}
}