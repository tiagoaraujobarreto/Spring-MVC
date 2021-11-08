package com.br.com.alula.mvc.mudi.api;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.com.alula.mvc.mudi.dto.RequisicaoNovaOferta;
import com.br.com.alula.mvc.mudi.model.Oferta;
import com.br.com.alula.mvc.mudi.model.Pedido;
import com.br.com.alula.mvc.mudi.repository.PedidoRepository;

@RestController
@RequestMapping("/api/ofertas")
public class OfertasRest {

	@Autowired
	private PedidoRepository pedidoRepository;

	@PostMapping
	public Oferta criaOferta(@Valid @RequestBody RequisicaoNovaOferta requisicao) {

		Optional<Pedido> pedidoBuscado = pedidoRepository.findById(requisicao.getPedidoId());
		if (!pedidoBuscado.isPresent()) {
			return null;
		}

		Pedido pedido = pedidoBuscado.get();

		Oferta nova = requisicao.toOferta();
		nova.setPedido(pedido);
		pedido.getOfertas().add(nova);
		pedidoRepository.save(pedido);

		return nova;
	}

}
