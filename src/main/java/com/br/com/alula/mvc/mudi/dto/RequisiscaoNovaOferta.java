package com.br.com.alula.mvc.mudi.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.br.com.alula.mvc.mudi.model.Oferta;

public class RequisiscaoNovaOferta {

	private Long pedidoId;
	private String valor;
	private String dataDaEntrega;
	private String comentario;

	private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd//MM/yyyy");

	public Long getPedidoId() {
		return pedidoId;
	}

	public void setPedidoId(Long pedidoId) {
		this.pedidoId = pedidoId;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getDataDaEntrega() {
		return dataDaEntrega;
	}

	public void setDataDaEntrega(String dataDaEntrega) {
		this.dataDaEntrega = dataDaEntrega;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Oferta toOferta() {
		Oferta oferta = new Oferta();
		oferta.setComentario(this.comentario);
		oferta.setDataDaEntrega(LocalDate.parse(this.dataDaEntrega, formatter));
		oferta.setValor(new BigDecimal(this.valor));
		return oferta;
	}

}
