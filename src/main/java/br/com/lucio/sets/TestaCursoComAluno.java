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
		Aluno aluno2= new Aluno("João Lucio", 412321);
	
		javaColecoes.matricular(aluno);
		javaColecoes.matricular(aluno1);
		javaColecoes.matricular(aluno2);
		
		//Nao funciona, pois retornamos uma lista que não pode ser modificada
		//javaColecoes.getAlunos().add(aluno2);
		
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
		
		Set<Aluno> alunosSincronizados = Collections.synchronizedSet(javaColecoes.getAlunos());
		alunosSincronizados.forEach(a -> {
			System.out.println(a);
		});
		
	}
	
}
