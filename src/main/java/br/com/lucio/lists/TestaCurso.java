package br.com.lucio.lists;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
		List<Aula> aulas = javaColecoes.getAulas();
		
		// Só adiciona com o metodo adicionar, pois lá o get esta com uma lista que nao pode ser modificada
		javaColecoes.adicionar(Aula.builder().titulo("Conhecendo mais de listas").tempo(2).build());
		javaColecoes.adicionar(Aula.builder().titulo("Conhecendo mais de Arraylists").tempo(4).build());
		javaColecoes.adicionar(Aula.builder().titulo("Modelando com coleçoes").tempo(4).build());
		
		aulas.forEach(aula -> System.out.println(aula.toString()));
	}
	
}
