package es.mde.entidades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Averia {

	private static final float PRECIO_MANO_OBRA = 40;
	private String nombre;
	private Collection<Repuesto> repuestosNecesarios;
	private float numeroHorasManoObra;

	public static float getPrecioManoObra() {
		return PRECIO_MANO_OBRA;
	}

	public String getNombre() {
		return nombre;
	}

	public Collection<Repuesto> getRepuestosNecesarios() {
		return repuestosNecesarios;
	}

	public float getNumeroHorasManoObra() {
		return numeroHorasManoObra;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected void setRepuestosNecesarios(Collection<Repuesto> repuestos) {
		if (getRepuestosNecesarios() == null) {
			this.repuestosNecesarios = new ArrayList<Repuesto>();
			this.repuestosNecesarios.addAll(repuestos);
		} else {
			getRepuestosNecesarios().addAll(repuestos);
		}
	}

	protected void setNumeroHorasManoObra(float numeroHorasManoObra) {
		this.numeroHorasManoObra = numeroHorasManoObra;
	}

	private Averia(String nombre, float numeroHorasManoObra) {
		setNombre(nombre);
		setNumeroHorasManoObra(numeroHorasManoObra);
	}

	public Averia(String nombre, float numeroHorasManoObra, Collection<Repuesto> repuestos) {
		this(nombre, numeroHorasManoObra);
		setRepuestosNecesarios(repuestos);
	}

	public Averia(String nombre, float numeroHorasManoObra, Repuesto... repuestos) {
		this(nombre, numeroHorasManoObra);
		setRepuestosNecesarios(Arrays.asList(repuestos));
	}

	public float getPrecio() {
		float precio = 0;
		for (Repuesto repuesto : getRepuestosNecesarios()) {
			precio += repuesto.getPrecio();
		}
		precio += getNumeroHorasManoObra() * PRECIO_MANO_OBRA;

		return precio;
	}

	@Override
	public String toString() {
		return "Averia: " + getNombre() + " (" + getPrecio() + "€ " + getNumeroHorasManoObra()
				+ "h) repuestos necesarios: " + getRepuestosNecesarios();
	}

}
