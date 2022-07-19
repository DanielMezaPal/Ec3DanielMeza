package com.idat.danielmeza.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.danielmeza.dto.UsuarioClienteDTORequest;
import com.idat.danielmeza.dto.UsuarioClienteDTOResponse;
import com.idat.danielmeza.model.UsuarioCliente;
import com.idat.danielmeza.repository.UsuarioClienteRepository;

@Service
public class UsuarioClienteServiceImpl implements UsuarioClienteService{
@Autowired
	private UsuarioClienteRepository repository;
	@Override
	public void guardar(UsuarioClienteDTORequest UsuarioClienteDTO) {
		UsuarioCliente usuarioCliente=new UsuarioCliente();		
		usuarioCliente.setUsuario(UsuarioClienteDTO.getUsuarioCliente());
		usuarioCliente.setPassword(UsuarioClienteDTO.getPasswordCliente());
		usuarioCliente.setRol(UsuarioClienteDTO.getRolCliente());
		repository.save(usuarioCliente);		
	}

	@Override
	public void actualizar(UsuarioClienteDTORequest UsuarioClienteDTO) {
		UsuarioCliente usuarioCliente=new UsuarioCliente();
		usuarioCliente.setIdUsuario(UsuarioClienteDTO.getId());
		usuarioCliente.setUsuario(UsuarioClienteDTO.getUsuarioCliente());
		usuarioCliente.setPassword(UsuarioClienteDTO.getPasswordCliente());
		usuarioCliente.setRol(UsuarioClienteDTO.getRolCliente());
		repository.saveAndFlush(usuarioCliente);
		
	}

	@Override
	public void eliminar(Integer id) {
		repository.deleteById(id);		
	}

	@Override
	public List<UsuarioClienteDTOResponse> listar() {
		List<UsuarioClienteDTOResponse> listar=new ArrayList<>();
		UsuarioClienteDTOResponse dto=null;
		List<UsuarioCliente> p=repository.findAll();
		
		for(UsuarioCliente usuarioCliente:p) {
			dto=new UsuarioClienteDTOResponse();
			dto.setId(usuarioCliente.getIdUsuario());
			dto.setUsuarioCliente(usuarioCliente.getUsuario());
			dto.setPasswordCliente(usuarioCliente.getPassword());
			dto.setRolCliente(usuarioCliente.getRol());
			listar.add(dto);
		}
		return listar;
	}

	@Override
	public UsuarioClienteDTOResponse obtenerById(Integer id) {
		UsuarioCliente usuarioCliente=repository.findById(id).orElse(null);
		UsuarioClienteDTOResponse dto=null;
		dto=new UsuarioClienteDTOResponse();
		dto.setId(usuarioCliente.getIdUsuario());
		dto.setUsuarioCliente(usuarioCliente.getUsuario());
		dto.setPasswordCliente(usuarioCliente.getPassword());
		dto.setRolCliente(usuarioCliente.getRol());
		return dto;
	}

}
