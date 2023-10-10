package com.generation.cadastroAlunos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.cadastroAlunos.model.cadastroModel;

@Repository
public interface cadastroRepository extends JpaRepository<cadastroModel, Long> {
	public List<cadastroModel> findAllByNomeContainingIgnoreCase (@Param("nome") String nome);

}
