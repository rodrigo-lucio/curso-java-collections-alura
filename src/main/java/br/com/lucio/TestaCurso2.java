package br.com.lucio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
		List<Aula> aulas = javaColecoes.getAulas();
		
		// Só adiciona com o metodo adicionar, pois lá o get esta com uma lista que nao pode ser modificada
		javaColecoes.adicionar(Aula.builder().titulo("Modelando com coleçoes").tempo(4).build());
		javaColecoes.adicionar(Aula.builder().titulo("Conhecendo mais de listas").tempo(2).build());
		javaColecoes.adicionar(Aula.builder().titulo("Conhecendo mais de Arraylists").tempo(4).build());
		
		aulas.forEach(aula -> System.out.println(aula.toString()));
		
		// Aqui da problema tambem pois a nossa lista nao pode ser modificada
		// Collections.sort(javaColecoes.getAulas());
		
		// Para que consiga mexer nela, deve fazer isso:
		List<Aula> aulasParaModificar = new ArrayList<>(javaColecoes.getAulas());

		//Agora consegue
		Collections.sort(aulasParaModificar);
		
		aulasParaModificar.forEach(aula -> System.out.println(aula.toString()));
		System.out.println("Tempo total: " + javaColecoes.getTempoTotal());
		System.out.println(javaColecoes);
		
	}
	
}
