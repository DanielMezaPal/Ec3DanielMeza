package com.idat.danielmeza.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.danielmeza.dto.UsuarioClienteDTORequest;
import com.idat.danielmeza.dto.UsuarioClienteDTOResponse;
import com.idat.danielmeza.service.UsuarioClienteService;

@Controller
@RequestMapping("/usuariocliente")
public class UsuarioClienteController {
	@Autowired
	private UsuarioClienteService service;
	
	@RequestMapping("/listar")
	public @ResponseBody ResponseEntity<List<UsuarioClienteDTOResponse>> listar() {
		return new ResponseEntity<List<UsuarioClienteDTOResponse>>( service.listar(),HttpStatus.OK);
	}
	
	@RequestMapping(path = "/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody UsuarioClienteDTORequest usuarioCliente) {
		service.guardar(usuarioCliente);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(path = "/eliminar/{id}", method = RequestMethod.POST)
	public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
		UsuarioClienteDTOResponse p=service.obtenerById(id);
		if(p != null) {
			service.eliminar(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(path = "actualizar", method = RequestMethod.PUT)
	public ResponseEntity<Void> actualizar(@RequestBody UsuarioClienteDTORequest usuarioCliente) {
		UsuarioClienteDTOResponse p=service.obtenerById(usuarioCliente.getId());
		
		if(p != null) {
			service.actualizar(usuarioCliente);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(path = "listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<UsuarioClienteDTOResponse> obtenerID(@PathVariable Integer id) {
		UsuarioClienteDTOResponse p=service.obtenerById(id);
		if(p != null) {			
			return new ResponseEntity<UsuarioClienteDTOResponse>(service.obtenerById(id),HttpStatus.OK);
		}
		return new ResponseEntity<UsuarioClienteDTOResponse>(HttpStatus.NOT_FOUND);
	}
}
