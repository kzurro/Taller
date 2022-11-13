package es.mde.entidades;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

}
