package br.com.lucio.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.sun.jdi.IntegerType;

import br.com.lucio.sets.Aluno;
import lombok.ToString;

@ToString
public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<>();
	private Set<Aluno> alunos = new HashSet<>();
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	public void adicionar(Aula aula) {
		this.aulas.add(aula);
	}

	public List<Aula> getAulas() {
		// nao deixa modificar via referência (chamar add, ou outro método que modifique)
		// Obrigando assim utilizar o metodo adicionar()
		// mas get, forEach e etc funciona normalmente
		return Collections.unmodifiableList(this.aulas); 
		
	}
	
	public int getTempoTotal() {
		return aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", instrutor=" + instrutor + ", aulas=" + aulas + "]";
	}

	public void matricular(Aluno aluno) {
		this.alunos.add(aluno);
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}
	
}
