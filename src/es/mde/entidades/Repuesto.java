package es.mde.entidades;

public class Repuesto {
	private int id;
	private float precio;
	private String nombre;

	public int getId() {
		return id;
	}

	public float getPrecio() {
		return precio;
	}

	public String getNombre() {
		return nombre;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected void setPrecio(float precio) {
		this.precio = precio;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Repuesto(int id, String nombre, float precio) {
		setId(id);
		setNombre(nombre);
		setPrecio(precio);
	}

	@Override
	public String toString() {
		return "(#" + getId() + ") " + getNombre() + " | " + getPrecio() + "€";
	}

}
