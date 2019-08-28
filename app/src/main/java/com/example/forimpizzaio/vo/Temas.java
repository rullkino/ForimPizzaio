package com.example.forimpizzaio.vo;

public class Temas {
	
	private Integer id_tema;
	private String nome_tema;
	private String descricao_tema;

	public Temas(Integer id_tema, String nome_tema, String descricao_tema) {
		this.id_tema = id_tema;
		this.nome_tema = nome_tema;
		this.descricao_tema = descricao_tema;
	}

	public Temas() {
	}

	public Integer getId_tema() {
		return id_tema;
	}
	public void setId_tema(Integer id_tema) {
		this.id_tema = id_tema;
	}
	public String getNome_tema() {
		return nome_tema;
	}
	public void setNome_tema(String nome_tema) {
		this.nome_tema = nome_tema;
	}
	public String getDescricao_tema() {
		return descricao_tema;
	}
	public void setDescricao_tema(String descricao_tema) {
		this.descricao_tema = descricao_tema;
	}
	
}