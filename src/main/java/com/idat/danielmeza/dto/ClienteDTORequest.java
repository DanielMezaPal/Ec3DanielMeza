package com.idat.danielmeza.dto;

public class ClienteDTORequest {
	private Integer id;
	private String nombreCli;
	private String telcel;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombreCli() {
		return nombreCli;
	}
	public void setNombreCli(String nombreCli) {
		this.nombreCli = nombreCli;
	}
	public String getTelf() {
		return telcel;
	}
	public void setTelf(String telf) {
		this.telcel = telcel;
	}
}
