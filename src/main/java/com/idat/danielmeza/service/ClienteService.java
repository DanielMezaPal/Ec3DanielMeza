package com.idat.danielmeza.service;

import java.util.List;

import com.idat.danielmeza.dto.ClienteDTORequest;
import com.idat.danielmeza.dto.ClienteDTOResponse;

public interface ClienteService {
	void guardar(ClienteDTORequest Clientes);
	void actualizar(ClienteDTORequest Clientes);
	void eliminar(Integer id);	
	List<ClienteDTOResponse>listar();
	ClienteDTOResponse obtenerById(Integer id);
}
