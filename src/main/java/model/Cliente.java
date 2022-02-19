package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Entity
@Data
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long clienteId;
	
	@Column(nullable = false)
	@NotEmpty(message = "{campo.clienteNome.obrigatorio}")
	@Length(max = 100,message="{campo.clienteNome.caracteres}")
	@NotNull(message="{campo.clienteNome.nulo}")
	private String clienteNome;
	
	@Email(message ="{campo.clienteEmail.invalido}")
	@NotNull(message="{campo.clienteEmail.nulo}")
	@Length(max = 100,message="{campo.clienteEmail.caracteres}")
	@NotEmpty(message = "{campo.clienteEmail.obrigatorio}")	
	@Column(nullable = false,unique = true)
	private String clienteEmail;	
		
	@CPF(message = "{campo.clienteCpf.invalido}")
	@NotNull(message="{campo.clienteCpf.nulo}")
	@NotEmpty(message = "{campo.clienteCpf.obrigatorio}")
	@Column(nullable = false,unique=true)
	private String clienteCPF;
		
	@JsonFormat(pattern = "dd/MM/yyyy")	
	@NotNull(message="{campo.clienteNascimento.nulo}")
	@Column(nullable = false)
	private Date clienteNascimento;
	
}
