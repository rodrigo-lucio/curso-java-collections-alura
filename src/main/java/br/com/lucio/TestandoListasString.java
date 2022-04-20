package br.com.lucio;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestandoListasString {

	public static void main(String[] args) {
		Aula aula1 = Aula.builder().titulo("Conhecendo mais de listas").tempo(2).build();
		Aula aula2 = Aula.builder().titulo("Conhecendo mais de listas").tempo(1).build();
		Aula aula3 = Aula.builder().titulo("Modelando a classe Aula").tempo(2).build();
		Aula aula4 = Aula.builder().titulo("Trabalhando com Cursos e Sets").tempo(3).build();
		Aula aula5 = Aula.builder().titulo("Aumentando Nosso conhecimento").tempo(4).build();

		List<Aula> aulas = Arrays.asList(aula1, aula2, aula3, aula4, aula5);
		
		// Deixa fazer o sort pois implementei o comparable na aula, dizendo que é para comparar por titulo 
		Collections.sort(aulas); // Ordena pelo compareTo = titulo
		
		// Ordena pelo tempo
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
	
		/*
		 Também funciona chamando direto da lista:
		 aulas.sort(Comparator.comparing(Aula::getTitulo));
		 aulas.sort(Comparator.comparing(Aula::getTempo));
		 */
	
		aulas.forEach(aula -> System.out.println(aula));
	
		
	}
	
	
	
}
