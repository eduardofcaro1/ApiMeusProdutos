package com.usd.ApiMeusProdutos.controller.dto;

import java.sql.Date;

public class ProdutoRs {
	private Long id;
	private String nome;
	private String descricao;
	private float preco;
	private Long categoria_id;
	private Date data_cadastro;
	private String nomeCategoria;
	
	public ProdutoRs(Long id, String nome,String descricao ,float preco,Long categoria_id ,String nomeCategoria,Date data_cadastro) {
        this.id = id;
        this.nome = nome;
        this.descricao=descricao;
        this.preco = preco;
        this.categoria_id=categoria_id;
        this.nomeCategoria=nomeCategoria;//this.categoria_id = categoria_id;
        this.data_cadastro = data_cadastro; 
    }
	
	/*
	public static ProdutoRs converter(Produto p) {
		var produto = new ProdutoRs();
		produto.setId(p.getId());
		produto.setNome(p.getNome());
		produto.setDescricao(p.getDescricao());
		produto.setPreco(p.getPreco());
		produto.setCategoria_id(p.getCategoria_id());
		produto.setData_cadastro(p.getData_cadastro());
		return produto;
	}*/
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public Date getData_cadastro() {
		return data_cadastro;
	}
	public void setData_cadastro(Date data_cadastro) {
		this.data_cadastro = data_cadastro;
	}

	public Long getCategoria_id() {
		return categoria_id;
	}

	public void setCategoria_id(Long categoria_id) {
		this.categoria_id = categoria_id;
	}
}
