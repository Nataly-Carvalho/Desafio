package com.generation.cadastroAlunos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cadastro")
public class cadastroModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private Long idade;
	
	private String nomeProfessor;
	
	private String nota1;
	
	private String nota2;
	
	private String numeroSala;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getIdade() {
		return idade;
	}

	public void setIdade(Long idade) {
		this.idade = idade;
	}

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}

	public String getNota1() {
		return nota1;
	}

	public void setNota1(String nota1) {
		this.nota1 = nota1;
	}

	public String getNota2() {
		return nota2;
	}

	public void setNota2(String nota2) {
		this.nota2 = nota2;
	}

	public String getNumeroSala() {
		return numeroSala;
	}

	public void setNumeroSala(String numeroSala) {
		this.numeroSala = numeroSala;
	}
	
	
	
}
