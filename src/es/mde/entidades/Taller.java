package es.mde.entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import es.mde.constantes.ConstantesTaller;

public class Taller {

	private String nombre;
	private Almacen almacenTaller;
	private List<HojaDeTrabajo> hojasDeTrabajo;

	public String getNombre() {
		return nombre;
	}

	public Almacen getAlmacenTaller() {
		return almacenTaller;
	}

	public List<HojaDeTrabajo> getHojasDeTrabajo() {
		return hojasDeTrabajo;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected void setAlmacenTaller(Almacen almacenTaller) {
		this.almacenTaller = almacenTaller;
	}

	protected void setHojasDeTrabajo(List<HojaDeTrabajo> hojasDeTrabajo) {
		if (getHojasDeTrabajo() == null) {
			this.hojasDeTrabajo = new ArrayList<HojaDeTrabajo>();
			this.hojasDeTrabajo.addAll(hojasDeTrabajo);
		} else {
			getHojasDeTrabajo().addAll(hojasDeTrabajo);
		}
	}

	public Taller(String nombre, Almacen almacenTaller, List<HojaDeTrabajo> hojasDeTrabajo) {
		setNombre(nombre);
		setAlmacenTaller(almacenTaller);
		setHojasDeTrabajo(hojasDeTrabajo);
	}

	public Taller() {
	}

	public void diagnosticar(Reparable reparable) {
		if (reparable.getAverias().isEmpty()) {
			int numAleatorio = (int) Math.floor(Math.random() * (ConstantesTaller.getAverias().length));
			reparable.addAveria(ConstantesTaller.getAverias()[numAleatorio]);
		} else {
			String averiaString = "";
			for (Averia a : reparable.getAverias()) {
				averiaString += a.getNombre() + ", ";
			}
			System.out.println("El " + reparable.getClass().getSimpleName() + " ya está diagnosticado, su averia es: "
					+ averiaString);
		}

	}

	public void diagnosticar(Reparable reparable, Averia averia) {
		if (reparable.getAverias().contains(averia)) {
			System.out.println(averia.getNombre() + " ya es una averia de " + reparable.getClass().getSimpleName());
		} else {
			reparable.addAveria(averia);
		}

	}

	public float getPresupuesto(HojaDeTrabajo hojaDeTrabajo) {
		float presupuesto = 0f;

		for (Averia averia : hojaDeTrabajo.getVehiculoAReparar().getAverias()) {
			presupuesto += averia.getPrecio();

		}

		return presupuesto;
	}

	public Collection<HojaDeTrabajo> getHojasDeTrabajoParaReparable(Reparable reparable) {
		Collection<HojaDeTrabajo> hojasDelReparable = new ArrayList<HojaDeTrabajo>();
		for (HojaDeTrabajo hojaDeTrabajo : getHojasDeTrabajo()) {
			if (hojaDeTrabajo.getVehiculoAReparar().equals(reparable)) {
				hojasDelReparable.add(hojaDeTrabajo);
			}
		}
		return hojasDelReparable;
	}

	public List<HojaDeTrabajo> getHojasHastaHaceUnAno(Reparable reparable) {
		LocalDate haceUnAno = LocalDate.now().minusYears(1);

		return getHojasDeTrabajoParaReparable(reparable).stream().filter(h -> h.getFechaEntrada().isAfter(haceUnAno))
				.collect(Collectors.toList());
	}

	public Collection<Averia> getAveriasGarantizadas(Reparable reparable) {
		Collection<Averia> averiasGarantizadas = new ArrayList<>();
		for (HojaDeTrabajo hoja : getHojasHastaHaceUnAno(reparable)) {
			for (Averia averia : hoja.getAveriasArregladas()) {
				averiasGarantizadas.add(averia);
			}
		}

		return averiasGarantizadas;
	}
	
	public boolean isGarantia(Reparable reparable) {
		return getAveriasGarantizadas(reparable).contains(reparable.getAverias());
	}

}
