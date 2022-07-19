package com.idat.danielmeza.dto;

public class HospitalDTORequest {
	private Integer id;
	private String nombreHospital;
	private String descHospital;
	private String distHospital;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombreHospital() {
		return nombreHospital;
	}
	public void setNombreHospital(String nombreHospital) {
		this.nombreHospital = nombreHospital;
	}
	public String getDescHospital() {
		return descHospital;
	}
	public void setDescHospital(String detalleHospital) {
		this.descHospital = detalleHospital;
	}
	public String getDistHospital() {
		return distHospital;
	}
	public void setDistHospital(String distritoHospital) {
		this.distHospital = distritoHospital;
	}
}
