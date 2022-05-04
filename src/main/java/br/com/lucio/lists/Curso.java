package br.com.lucio.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import br.com.lucio.sets.Aluno;
import lombok.ToString;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<>();
	private Set<Aluno> alunos = new HashSet<>();
	// Se alunos fosse LinkedHashSet<>, no for, pegaria a ordem adicionada
	// Mas mesmo assim não permitiria fazer alunos.get(posicao)

	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	//O mesmo vale se utilizar new LinkedHashMap<>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public void adicionar(Aula aula) {
		this.aulas.add(aula);
	}

	public List<Aula> getAulas() {
		// nao deixa modificar via referência (chamar add, ou outro método que
		// modifique)
		// Obrigando assim utilizar o metodo adicionar()
		// mas get, forEach e etc funciona normalmente
		return Collections.unmodifiableList(this.aulas);

	}

	
	public Map<Integer, Aluno> getMatriculaParaAluno() {
		return matriculaParaAluno;
	}

	public int getTempoTotal() {
		return aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", instrutor=" + instrutor + ", aulas=" + aulas + "]";
	}

	public void matricular(Aluno aluno) throws Exception {
//		if(this.alunos.contains(aluno))
//			throw new Exception("Aluno já matriculado");
		this.alunos.add(aluno);
		this.matriculaParaAluno.putIfAbsent(aluno.getNumeroMatricula(), aluno);
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatriculado(Integer numeroMatricula) {
		return this.matriculaParaAluno.get(numeroMatricula);
	}

}
