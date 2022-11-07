package es.mde.entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class HojaDeTrabajo {

	private Reparable vehiculoAReparar;
	private Collection<Averia> averiasArregladas;
	private LocalDate fechaEntrada;

	public Reparable getVehiculoAReparar() {
		return vehiculoAReparar;
	}

	public Collection<Averia> getAveriasArregladas() {
		return averiasArregladas;
	}

	public LocalDate getFechaEntrada() {
		return fechaEntrada;
	}

	protected void setVehiculoAReparar(Reparable vehiculoAReparar) {
		this.vehiculoAReparar = vehiculoAReparar;
	}

	protected void setAveriasReparacion(Collection<Averia> averiasReparar) {
		if (getAveriasArregladas() == null) {
			this.averiasArregladas = new ArrayList<Averia>();
			this.averiasArregladas.addAll(averiasReparar);
		} else {
			getAveriasArregladas().addAll(averiasReparar);
		}
	}

	protected void setFechaEntrada(LocalDate fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public HojaDeTrabajo(Reparable vehiculo, LocalDate fechaEntrada) {
		setVehiculoAReparar(vehiculo);
		setAveriasReparacion(new ArrayList<Averia>());
		setFechaEntrada(fechaEntrada);
	}

	public HojaDeTrabajo(Reparable vehiculo) {
		this(vehiculo, LocalDate.now());
	}
	
	public void addReparacionFinalizada(Averia averia) {
		if(getVehiculoAReparar().getAverias().contains(averia)) {
			getVehiculoAReparar().getAverias().remove(averia);
			getAveriasArregladas().add(averia);
		} else {
			System.err.println("Se intenta añadir una reparación sin haber avería");
		}
	}
}
