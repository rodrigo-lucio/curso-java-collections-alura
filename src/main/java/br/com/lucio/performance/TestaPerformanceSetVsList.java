package br.com.lucio.performance;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformanceSetVsList {

	public static void main(String[] args) {

		Collection<Integer> numerosArray = new ArrayList<>();
		tempoBuscaContains(numerosArray);
		Collection<Integer> numerosSet = new HashSet<>();
		tempoBuscaContains(numerosSet);

	}

	private static void tempoBuscaContains(Collection<Integer> numeros) {
		long inicio = System.currentTimeMillis();

		for (int i = 1; i <= 50000; i++) {
			numeros.add(i);
		}

		for (Integer numero : numeros) {
			numeros.contains(numero);
		}

		long fim = System.currentTimeMillis();
		long tempoDeExecucao = fim - inicio;
		System.out.println("Tempo gasto: " + tempoDeExecucao);
	}

}
