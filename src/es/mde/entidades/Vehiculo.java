package es.mde.entidades;

public class Vehiculo {

	private String modelo;
	private String color;

	protected String getModelo() {
		return modelo;
	}

	public String getColor() {
		return color;
	}

	protected void setColor(String color) {
		this.color = color;
	}

	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Vehiculo() {
		this("", "");
	}

	public Vehiculo(String modelo, String color) {
		setModelo(modelo);
		setColor(color);
	}

	@Override
	public String toString() {
		return getModelo() +  " " + getColor() + " ";
	}
	
	

}
