package br.com.lucio.sets;

import java.util.HashSet;
import java.util.Set;


public class TestaAlunos {

	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
		
		alunos.add("Rodrigo Lúcio");
		alunos.add("Danielly Mattiollo");
		alunos.add("João Mattiollo");
		alunos.add("Eloi Lúcio");
		alunos.add("Ana Luiza Siqueira Lúcio");

		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		//Sets
		//São conjuntos (sacolas)
		//Set - Não tem garantia da ordem que foi adicionado, diferente da lista
		//Não suporta elementos repetidos
		//Nao tem o método GET(index)
		//Grande vantagem = velocidade ex: Utilizar o contains/remove
		
	}
	
}
