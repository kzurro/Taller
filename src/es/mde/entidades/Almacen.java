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

	public boolean isRepuesto(Repuesto repuesto, int cantidad) {
		int contadorRepuestos = 0;

		for (Repuesto repuestoAlmacen : getRepuestos()) {
			if (repuestoAlmacen.equals(repuesto)) {
				contadorRepuestos++;
			}
		}

		return contadorRepuestos >= cantidad;
	}

	public boolean isRepuesto(Repuesto repuesto) {
		return isRepuesto(repuesto, 1);
	}

}
