package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Long> {
	
	

}
