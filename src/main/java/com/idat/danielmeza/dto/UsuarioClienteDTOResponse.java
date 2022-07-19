package com.idat.danielmeza.dto;

public class UsuarioClienteDTOResponse {
	private Integer id;
	private String usuarioCliente;
	private String passwordCliente;
	private String rolCliente;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsuarioCliente() {
		return usuarioCliente;
	}
	public void setUsuarioCliente(String usuarioCliente) {
		this.usuarioCliente = usuarioCliente;
	}
	public String getPasswordCliente() {
		return passwordCliente;
	}
	public void setPasswordCliente(String passwordCliente) {
		this.passwordCliente = passwordCliente;
	}
	public String getRolCliente() {
		return rolCliente;
	}
	public void setRolCliente(String rolCliente) {
		this.rolCliente = rolCliente;
	}
}
