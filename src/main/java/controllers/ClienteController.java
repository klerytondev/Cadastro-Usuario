package controllers;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import model.Cliente;
import repository.IClienteRepository;

@RestController
@RequestMapping("/api")
public class ClienteController {

	private IClienteRepository clienteRepository;
	
	public ClienteController(IClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public Cliente salvarCliente(@RequestBody @Valid Cliente cliente) {
		return clienteRepository.save(cliente);
	}

}
