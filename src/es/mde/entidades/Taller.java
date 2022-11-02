package es.mde.entidades;

import java.util.ArrayList;
import java.util.List;

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

}
