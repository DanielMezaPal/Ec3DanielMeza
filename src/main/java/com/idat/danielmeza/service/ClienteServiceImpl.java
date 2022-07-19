package com.idat.danielmeza.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.danielmeza.dto.ClienteDTORequest;
import com.idat.danielmeza.dto.ClienteDTOResponse;
import com.idat.danielmeza.model.Cliente;
import com.idat.danielmeza.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService{
	@Autowired
	ClienteRepository repository;
	@Override
	public void guardar(ClienteDTORequest ClientesDTO) {
		Cliente cliente=new Cliente();		
		cliente.setNombre(ClientesDTO.getNombreCli());
		cliente.setCelular(ClientesDTO.getTelf());
		repository.save(cliente);
	}

	@Override
	public void actualizar(ClienteDTORequest ClientesDTO) {
		Cliente cliente=new Cliente();	
		cliente.setIdCliente(ClientesDTO.getId());
		cliente.setNombre(ClientesDTO.getNombreCli());
		cliente.setCelular(ClientesDTO.getTelf());		
		repository.saveAndFlush(cliente);		
	}

	@Override
	public void eliminar(Integer id) {
		repository.deleteById(id);		
	}

	@Override
	public List<ClienteDTOResponse> listar() {
		List<ClienteDTOResponse> listar=new ArrayList<>();
		ClienteDTOResponse dto=null;
		List<Cliente> p=repository.findAll();
		
		for(Cliente cliente:p) {
			dto=new ClienteDTOResponse();
			dto.setId(cliente.getIdCliente());
			dto.setNombreCli(cliente.getNombre());
			dto.setTelcel(cliente.getCelular());			
			listar.add(dto);			
		}
		return listar;
	}

	@Override
	public ClienteDTOResponse obtenerById(Integer id) {
		Cliente cliente=repository.findById(id).orElse(null);
		ClienteDTOResponse dto=null;
		dto=new ClienteDTOResponse();
		dto.setId(cliente.getIdCliente());
		dto.setNombreCli(cliente.getNombre());
		dto.setTelcel(cliente.getCelular());	
		return dto;		
	}

}
