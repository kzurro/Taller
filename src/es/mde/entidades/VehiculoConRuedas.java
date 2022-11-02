package es.mde.entidades;

public abstract class VehiculoConRuedas extends Vehiculo {

	public abstract int getNumeroDeRuedas();

	public VehiculoConRuedas(String modelo, String color) {
		super(modelo, color);
	}

	@Override
	public String toString() {
		return super.toString() + ", " + getNumeroDeRuedas() + " ruedas";
	}

}
