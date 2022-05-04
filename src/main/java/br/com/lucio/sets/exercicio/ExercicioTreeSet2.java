package br.com.lucio.sets.exercicio;

import java.util.Set;
import java.util.TreeSet;

public class ExercicioTreeSet2 {

	public static void main(String[] args) {

		Funcionario f4 = new Funcionario("Rodrigo", 27);
		Funcionario f1 = new Funcionario("Barney", 12);
		Funcionario f2 = new Funcionario("Jonatan", 9);
		Funcionario f3 = new Funcionario("Guaraciara", 1);

		//Pede um comparator e guarda os funcionarios por idade
		Set<Funcionario> funcionarios = new TreeSet<>(new OrdenaPorIdade());
		funcionarios.add(f1);
		funcionarios.add(f2);
		funcionarios.add(f4);
		funcionarios.add(f3);

		funcionarios.forEach(func -> {
			System.out.println(func.toString());
		});

	}

}
