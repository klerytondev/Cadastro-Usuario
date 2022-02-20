package com.api.CadastroUsuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.CadastroUsuarios.model.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Long> {
	
	

}
