package es.mde.entidades;

import java.util.ArrayList;
import java.util.Collection;

public class CocheReparable extends Coche {

	private Collection<Averia> averias;

	public Collection<Averia> getAverias() {
		return averias;
	}

	protected void setAverias(Collection<Averia> averias) {
		if (getAverias() == null) {
			this.averias = new ArrayList<Averia>();
			this.averias.addAll(averias);
		} else {
			this.averias.addAll(averias);
		}
	}

	public CocheReparable(String modelo, String color) {
		super(modelo, color);
		averias = new ArrayList<Averia>();
	}

	public CocheReparable(String modelo, String color, int numeroDeRuedas, String matricula) {
		super(modelo, color, numeroDeRuedas, matricula);

	}

}
