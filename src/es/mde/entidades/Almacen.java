package es.mde.entidades;

import java.util.ArrayList;
import java.util.List;

public class Almacen {

	private List<Repuesto> repuestos;

	public List<Repuesto> getRepuestos() {
		return repuestos;
	}

	protected void setRepuestos(List<Repuesto> repuestos) {
		if (getRepuestos() == null) {
			this.repuestos = new ArrayList<>();
			this.repuestos.addAll(repuestos);
		} else {
			getRepuestos().addAll(repuestos);

		}
	}

	public Almacen() {
		setRepuestos(new ArrayList<Repuesto>());
	}

	public Almacen(List<Repuesto> repuestos) {
		setRepuestos(repuestos);
	}

}
