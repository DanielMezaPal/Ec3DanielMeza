package com.idat.danielmeza.dto;

public class HospitalDTOResponse {
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
	public void setDescHospital(String descHospital) {
		this.descHospital = descHospital;
	}
	public String getDistHospital() {
		return distHospital;
	}
	public void setDistHospital(String distHospital) {
		this.distHospital = distHospital;
	}
}
