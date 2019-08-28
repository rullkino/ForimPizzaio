package com.example.forimpizzaio.vo;

public class Usuario {
	
	private Integer id_usuario;
	private String login;
	private String nome;
	private String senha;

	public Usuario(Integer id_usuario, String login, String nome, String senha) {
		this.id_usuario = id_usuario;
		this.login = login;
		this.nome = nome;
		this.senha = senha;
	}

	public Usuario() {
	}

	public Integer getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUsuario() {
		return nome;
	}
	public void setUsuario(String usuario) {
		this.nome = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
}
