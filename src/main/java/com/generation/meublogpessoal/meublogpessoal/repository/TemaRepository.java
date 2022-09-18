package com.generation.meublogpessoal.meublogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.meublogpessoal.meublogpessoal.model.Tema;

public interface TemaRepository extends JpaRepository<Tema , Long>{
	public List<Tema> findAllByDescricaoContainingIgnoreCase(String descricao);
	
}
