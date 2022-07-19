package com.idat.danielmeza.service;

import java.util.List;

import com.idat.danielmeza.dto.HospitalDTORequest;
import com.idat.danielmeza.dto.HospitalDTOResponse;


public interface HospitalService {
	void guardar(HospitalDTORequest Hospitals);
	void actualizar(HospitalDTORequest Hospitals);
	void eliminar(Integer id);	
	List<HospitalDTOResponse>listar();
	HospitalDTOResponse obtenerById(Integer id);
}
