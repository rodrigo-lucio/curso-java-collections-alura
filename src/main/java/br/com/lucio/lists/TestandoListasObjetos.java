package br.com.lucio.lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestandoListasObjetos {

	public static void main(String[] args) {
		
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";
		String aula4 = "Aumentando Nosso conhecimento";
		
	
		List<String> aulas = Arrays.asList(aula1, aula2, aula3, aula4);
		
		Collections.sort(aulas);
		
		//Aulas ordenadas alfabeticamente
		aulas.forEach(aula -> System.out.println(aula));
		
		
	}
	
	
}
