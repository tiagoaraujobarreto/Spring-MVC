package com.br.com.alula.mvc.mudi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.com.alula.mvc.mudi.model.Pedido;
import com.br.com.alula.mvc.mudi.model.StatusDoPedidio;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

	List<Pedido> findByStatus(StatusDoPedidio aguardando);

}
