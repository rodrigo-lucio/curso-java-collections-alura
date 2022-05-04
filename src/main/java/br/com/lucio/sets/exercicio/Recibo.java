package br.com.lucio.sets.exercicio;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Recibo implements Comparable<Recibo> {

	private String numero;

	@Override
	public int compareTo(Recibo o) {
		return this.numero.compareTo(o.getNumero());
	}
	
	
}
