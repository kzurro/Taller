package es.mde.externas;

import java.util.Collection;

import com.kzurro.electrodomesticos.Financiable;

import es.mde.entidades.Averia;
import es.mde.entidades.Repuesto;

public class AveriaFinaciable extends Averia implements Financiable {

	public AveriaFinaciable(String nombre, float numeroHorasManoObra, Collection<Repuesto> repuestos) {
		super(nombre, numeroHorasManoObra, repuestos);
	}

	public static double getFloatAsDouble(float value) {
		return Double.valueOf(Float.valueOf(value).toString()).doubleValue();
	}

	@Override
	public float getPrecioFactura() {

		return super.getPrecio();
	}

}
