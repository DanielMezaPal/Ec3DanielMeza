package com.idat.danielmeza.service;

import java.util.List;

import com.idat.danielmeza.dto.UsuarioClienteDTORequest;
import com.idat.danielmeza.dto.UsuarioClienteDTOResponse;


public interface UsuarioClienteService {
	void guardar(UsuarioClienteDTORequest UsuarioClientes);
	void actualizar(UsuarioClienteDTORequest UsuarioClientes);
	void eliminar(Integer id);	
	List<UsuarioClienteDTOResponse>listar();
	UsuarioClienteDTOResponse obtenerById(Integer id);
}
