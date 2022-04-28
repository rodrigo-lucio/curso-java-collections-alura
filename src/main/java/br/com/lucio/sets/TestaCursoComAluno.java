package br.com.lucio.sets;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import br.com.lucio.lists.Aula;
import br.com.lucio.lists.Curso;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		javaColecoes.adicionar(Aula.builder().titulo("Modelando com coleçoes").tempo(4).build());
		javaColecoes.adicionar(Aula.builder().titulo("Conhecendo mais de listas").tempo(2).build());
		javaColecoes.adicionar(Aula.builder().titulo("Conhecendo mais de Arraylists").tempo(4).build());

		Aluno aluno = new Aluno("Rodrigo Lucio", 12345);
		Aluno aluno1 = new Aluno("Danielly Mattiollo", 412323);
		Aluno aluno2 = new Aluno("João Lucio", 412321);

		javaColecoes.matricular(aluno);
		javaColecoes.matricular(aluno1);
		javaColecoes.matricular(aluno2);

		// Nao funciona, pois retornamos uma lista que não pode ser modificada
		// javaColecoes.getAlunos().add(aluno2);

		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});

		// Sincronizado não aceita elementos nulos, e pode ser utilizada em threads
		Set<Aluno> alunosSincronizados = Collections.synchronizedSet(javaColecoes.getAlunos());
		alunosSincronizados.forEach(a -> {
//			System.out.println(a);
		});

		
		//Retorna true abaixo pois implementamos o equals e hashcode
		Aluno alunoClone = new Aluno("Rodrigo ssLucio", 12345);
		System.out.println(javaColecoes.estaMatriculado(alunoClone));
		
		//Vai retornar igual
		//O equals depende do hashcode
		//Se dois objetos sao equals, eles tem que ter o mesmo hashCode
		System.out.println(alunoClone.hashCode() + " = " + aluno.hashCode());

	}

}
