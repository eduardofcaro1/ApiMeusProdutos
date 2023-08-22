package com.usd.ApiMeusProdutos.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usd.ApiMeusProdutos.controller.dto.ProdutoRs;
import com.usd.ApiMeusProdutos.model.Produto;
import com.usd.ApiMeusProdutos.repository.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	private final ProdutoRepository produtoRepository;
	
	public ProdutoController(ProdutoRepository produtoRepository) {
		this.produtoRepository=produtoRepository;
	}
	
	@GetMapping("/")
	public List<ProdutoRs> findAllProducts(){
		/*var produtos = produtoRepository.findAll(); 
		return produtos.stream().map((p) -> ProdutoRs.converter(p))
				.collect(Collectors.toList());*/
		return produtoRepository.findAllProducts();
	}
	
	@GetMapping("/all")
	public List<Produto> findAll(){
		/*var produtos = produtoRepository.findAll(); 
		return produtos.stream().map((p) -> ProdutoRs.converter(p))
				.collect(Collectors.toList());*/
		return produtoRepository.findAll();
	}
}
