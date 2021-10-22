package com.br.com.alula.mvc.mudi.repository;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.br.com.alula.mvc.mudi.model.Pedido;
import com.br.com.alula.mvc.mudi.model.StatusDoPedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

	@Cacheable("books")
	List<Pedido> findByStatus(StatusDoPedido aguardando, Pageable sort);

	@Query("SELECT p FROM Pedido p JOIN p.user u WHERE u.username = :username")
	List<Pedido> findAllByUsuario(@Param("username") String username);

	@Query("SELECT p FROM Pedido p JOIN p.user u WHERE u.username =:username and p.status =:status")
	List<Pedido> findByStatusEUsuario(@Param("status")StatusDoPedido status, @Param("username") String username);

}
