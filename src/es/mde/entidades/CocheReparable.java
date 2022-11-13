package es.mde.entidades;

import java.util.ArrayList;
import java.util.Collection;

public class CocheReparable extends Coche implements Reparable {

	private Collection<Averia> averias;

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
		setAverias(new ArrayList<>());
	}

	public CocheReparable(String modelo, String color, int numeroDeRuedas, String matricula) {
		super(modelo, color, numeroDeRuedas, matricula);
		setAverias(new ArrayList<>());

	}

	@Override
	public Collection<Averia> getAverias() {
		return this.averias;
	}

}
