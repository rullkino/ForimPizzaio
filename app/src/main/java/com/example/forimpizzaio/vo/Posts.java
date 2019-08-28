package com.example.forimpizzaio.vo;

public class Posts {
	
	private Integer id_post;
	private Integer id_tema;
	private Integer id_usuario;
	private String nome_tema;
	private String descricao_posts;
	private String palavras_chave;

	public Posts(Integer id_post, Integer id_tema, Integer id_usuario, String nome_tema, String descricao_posts, String palavras_chave) {
		this.id_post = id_post;
		this.id_tema = id_tema;
		this.id_usuario = id_usuario;
		this.nome_tema = nome_tema;
		this.descricao_posts = descricao_posts;
		this.palavras_chave = palavras_chave;
	}

	public Posts() {
	}

	public Integer getId_post() {
		return id_post;
	}
	public void setId_posts(Integer id_post) {
		this.id_post = id_post;
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
	public String getDescricao_posts() {
		return descricao_posts;
	}
	public void setDescricao_posts(String descricao_posts) {
		this.descricao_posts = descricao_posts;
	}
	public String getPalavras_chave() {
		return palavras_chave;
	}
	public void setPalavras_chave(String palavras_chave) {
		this.palavras_chave = palavras_chave;
	}
	
	public Integer getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}
	
}
