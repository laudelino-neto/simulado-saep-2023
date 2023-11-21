package br.com.senai.saep2023.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "saep_transportadoras")
@Entity(name = "Transportadora")
@ToString
public class Transportadora {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@EqualsAndHashCode.Include
	private Integer id;
	
	@NotBlank(message = "O nome da transportadora é obrigatório")
	@Column(name = "nome")
	private String nome;
	
	@NotBlank(message = "O e-mail da transportadora é obrigatório")
	@Column(name = "email")
	private String email;
	
	@NotBlank(message = "A senha da transportadora é obrigatória")
	@Column(name = "senha")
	private String senha;
	
}
