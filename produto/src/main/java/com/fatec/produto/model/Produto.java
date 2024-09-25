package com.fatec.produto.model;

public class Produto {
	private Long id;
	private String descricao;
	private String categoria;
	private String custo;
	private String quantidadeNoEstoque;

	public Produto(String descricao, String categoria, String custo, String quantidadeNoEstoque) {
		this.descricao = descricao;
		this.categoria = categoria;
		this.custo = custo;
		this.quantidadeNoEstoque = quantidadeNoEstoque;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getCusto() {
		return custo;
	}

	public void setCusto(String custo) {
		this.custo = custo;
	}

	public String getQuantidadeNoEstoque() {
		return quantidadeNoEstoque;
	}

	public void setQuantidadeNoEstoque(String quantidadeNoEstoque) {
		this.quantidadeNoEstoque = quantidadeNoEstoque;
	}

}
