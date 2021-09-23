package com.br.com.alula.mvc.mudi.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.br.com.alula.mvc.mudi.model.Pedido;

@Repository
public class PedidoRepository {

	@PersistenceContext
	private EntityManager entityManager;

	public List<Pedido> recuperaTodosOsPedidos() {
		Query query = entityManager.createQuery("SELECT p FROM Pedido p", Pedido.class);
		return query.getResultList();

	}
}
