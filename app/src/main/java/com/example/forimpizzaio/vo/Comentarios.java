package com.example.forimpizzaio.vo;

public class Comentarios {
	
	private Integer id_comentario;
	private Integer id_post;
	private Integer id_tema;
	private Integer id_usuario;
	private String descricao_comentario;

	public Comentarios(Integer id_comentario, Integer id_post, Integer id_tema, Integer id_usuario, String descricao_comentario) {
		this.id_comentario = id_comentario;
		this.id_post = id_post;
		this.id_tema = id_tema;
		this.id_usuario = id_usuario;
		this.descricao_comentario = descricao_comentario;
	}

	public Comentarios() {
	}

	public Integer getId_comentario() {
		return id_comentario;
	}
	public void setId_comentario(Integer id_comentario) {
		this.id_comentario = id_comentario;
	}
	public Integer getId_post() {
		return id_post;
	}
	public void setId_post(Integer id_post) {
		this.id_post = id_post;
	}
	public Integer getId_tema() {
		return id_tema;
	}
	public void setId_tema(Integer id_tema) {
		this.id_tema = id_tema;
	}
	public Integer getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getDescricao_comentario() {
		return descricao_comentario;
	}
	public void setDescricao_comentario(String descricao_comentario) {
		this.descricao_comentario = descricao_comentario;
	}
	
}
