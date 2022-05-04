package br.com.lucio.sets.exercicio;

import java.util.Set;
import java.util.TreeSet;

public class ExercicioTreeSet {

	public static void main(String[] args) {
		
		Recibo rec1 = new Recibo();
		rec1.setNumero("3");
		Recibo rec2 = new Recibo();
		rec2.setNumero("2");
		Recibo rec3 = new Recibo();
		rec3.setNumero("1");
		
		//Só conseguimos adicionar coisas no TreeSet se o objeto implementar o Comparable
		
		Set<Recibo> recibos = new TreeSet<>();
		recibos.add(rec1);
		recibos.add(rec2);
		recibos.add(rec3);
		
		//Guarda os recibos na ordem definida no compareble
		recibos.forEach(recibo -> {
			System.out.println(recibo.toString());
		});
		
	}
}
