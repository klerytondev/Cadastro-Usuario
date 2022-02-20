package com.api.CadastroUsuarios.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.api.CadastroUsuarios.model.Cliente;
import com.api.CadastroUsuarios.repository.IClienteRepository;

@RestController
@RequestMapping("/api")
public class ClienteController {

	@Autowired
	private IClienteRepository clienteRepository;

	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public Cliente salvarCliente(@RequestBody @Valid Cliente cliente) {
		return clienteRepository.save(cliente);
	}

}
