package es.mde.entidades;

import java.util.Collection;

public interface Reparable {

	Collection<Averia> getAverias();

	default void addAveria(Averia averia) {
		getAverias().add(averia);
	}

	default boolean isReparado() {
		return getAverias().isEmpty();
	}

	default float getHorasReparacion() {
		float tiempoTotal = 0;
		for (Averia averia : getAverias()) {
			tiempoTotal += averia.getNumeroHorasManoObra();
		}

		return tiempoTotal;
	}

	default float getCosteReparacion() {
		float tiempoTotal = 0;
		for (Averia averia : getAverias()) {
			tiempoTotal += averia.getPrecio();
		}

		return tiempoTotal;
	}

}
