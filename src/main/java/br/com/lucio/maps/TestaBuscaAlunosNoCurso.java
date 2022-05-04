package br.com.lucio.maps;

import br.com.lucio.lists.Aula;
import br.com.lucio.lists.Curso;
import br.com.lucio.sets.Aluno;

public class TestaBuscaAlunosNoCurso {

	public static void main(String[] args) throws Exception {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		javaColecoes.adicionar(Aula.builder().titulo("Modelando com coleçoes").tempo(4).build());
		javaColecoes.adicionar(Aula.builder().titulo("Conhecendo mais de listas").tempo(2).build());
		javaColecoes.adicionar(Aula.builder().titulo("Conhecendo mais de Arraylists").tempo(4).build());

		Aluno aluno = new Aluno("Rodrigo Lucio", 12345);
		Aluno aluno1 = new Aluno("Danielly Mattiollo", 412323);
		Aluno aluno2 = new Aluno("João Lucio", 123456); 
		Aluno aluno3 = new Aluno("João Lucio", 12345);
		Aluno aluno4 = new Aluno("João Lucio", 12345);

		javaColecoes.matricular(aluno);
		javaColecoes.matricular(aluno1);
		//nao adiciona pois é um set, o equals e hashcode está sobreescrito em Aluno para o numero de matricula
		javaColecoes.matricular(aluno2);
		javaColecoes.matricular(aluno3);
		javaColecoes.matricular(aluno3);
		javaColecoes.matricular(aluno3);
		javaColecoes.matricular(aluno3);
		javaColecoes.matricular(aluno4);
		

		System.out.println("\nSet de alunos");
		javaColecoes.getAlunos().forEach(e -> {
			System.out.println(e);
		});
		
		System.out.println("\nBuscando aluno com a matricula: 12345");
		Aluno alunoBuscaMatriculado = javaColecoes.buscaMatriculado(12345);
		System.out.println(alunoBuscaMatriculado);

		System.out.println("\nPercorrendo as chaves:");
		javaColecoes.getMatriculaParaAluno().keySet().forEach(e -> {
			System.out.println(e);
		});
		
		System.out.println("\nPercorrendo as chaves/valores:");
		javaColecoes.getMatriculaParaAluno().entrySet().forEach(e -> {
			System.out.println(e);
		});
		
	}

}
