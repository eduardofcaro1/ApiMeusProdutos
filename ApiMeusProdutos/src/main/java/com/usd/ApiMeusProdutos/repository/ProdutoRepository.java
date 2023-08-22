package com.usd.ApiMeusProdutos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.usd.ApiMeusProdutos.controller.dto.ProdutoRs;
import com.usd.ApiMeusProdutos.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	@Query("SELECT new com.usd.ApiMeusProdutos.controller.dto.ProdutoRs"
			+ "(p.id,"
			+ " p.nome,"
			+ " p.descricao,"
			+ " p.preco,"
			+ " p.categoria.id,"
			+ " p.categoria.nome,"
			+ " p.data_cadastro) FROM Produto p JOIN p.categoria")
    List<ProdutoRs> findAllProducts();
}
