package es.mde.externas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.kzurro.electrodomesticos.Electrodomestico;

import es.mde.entidades.Averia;
import es.mde.entidades.Reparable;

public class ElectrodomesticoReparable extends Electrodomestico implements Reparable {

	List<Averia> averias;

	protected void setAverias(List<Averia> averias) {
		if (getAverias() == null) {
			this.averias = new ArrayList<Averia>();
			this.averias.addAll(averias);
		} else {
			this.averias.addAll(averias);
		}
	}

	public ElectrodomesticoReparable(List<Averia> averias) {
		setAverias(averias);
	}

	public ElectrodomesticoReparable() {
		setAverias(new ArrayList<>());
	}

	public ElectrodomesticoReparable(double precioBase, double peso, char consumoEnergetico, String color) {
		super(precioBase, peso, consumoEnergetico, color);
		setAverias(new ArrayList<>());
	}

	public ElectrodomesticoReparable(double precio, double peso) {
		super(precio, peso);
		setAverias(new ArrayList<>());
	}

	@Override
	public Collection<Averia> getAverias() {

		return this.averias;
	}

}
