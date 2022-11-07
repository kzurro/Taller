package es.mde.entidades;

import java.awt.image.RescaleOp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
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

	public void almacenarRespuesto(Repuesto repuesto) {
		getRepuestos().add(asignarId(repuesto));
		System.out.println("Se ha almacenado " + repuesto.getNombre() + " S/N");
	}

	public void almacenarRespuesto(Repuesto... repuesto) {
		Arrays.stream(repuesto).forEach(r -> almacenarRespuesto(r));
	}

	public void almacenarRespuesto(Collection<Repuesto> colecionRepuestos) {
		colecionRepuestos.forEach(r -> almacenarRespuesto(r));
	}

	public Repuesto asignarId(Repuesto repuesto) {
		Repuesto repuesto2 = null;
		if (getRepuestos().contains(repuesto)) {
			repuesto2 = new Repuesto(repuesto.getNombre(), repuesto.getPrecio());
			repuesto2.setId(getRepuestos().size());
		} else {
			repuesto.setId(getRepuestos().size());
			repuesto2 = repuesto;
		}

		return repuesto2;
	}

}
