package br.com.senai.saep2023.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.senai.saep2023.entity.Motorista;

@Repository
public interface MotoristasRepository extends JpaRepository<Motorista, Integer>{

	@Query(value = 
			"SELECT m "
			+ "FROM Motorista m "
			+ "JOIN FETCH m.transportadora "
			+ "ORDER BY m.nome ")
	public List<Motorista> listarTodos();
	
}
