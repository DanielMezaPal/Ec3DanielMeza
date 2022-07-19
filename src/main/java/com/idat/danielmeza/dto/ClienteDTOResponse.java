package com.idat.danielmeza.dto;

public class ClienteDTOResponse {
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
	public String getTelcel() {
		return telcel;
	}
	public void setTelcel(String telcel) {
		this.telcel = telcel;
	}
}
