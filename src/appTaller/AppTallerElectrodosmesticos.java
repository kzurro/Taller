package appTaller;

import java.util.Arrays;

import com.kzurro.electrodomesticos.Financiable;

import es.mde.entidades.Averia;
import es.mde.entidades.Reparable;
import es.mde.entidades.Repuesto;
import es.mde.entidades.Taller;
import es.mde.externas.AveriaFinaciable;
import es.mde.externas.ElectrodomesticoReparable;

public class AppTallerElectrodosmesticos {

	public static void main(String[] args) {

		Taller tallerElectrodomesticos = new Taller();

		Reparable electrodomestico = new ElectrodomesticoReparable();

		tallerElectrodomesticos.diagnosticar(electrodomestico);

		electrodomestico.getAverias().forEach(a -> System.out.println(a));

		System.out.println(((Financiable) electrodomestico).getCuantiaCuota());

		tallerElectrodomesticos.diagnosticar(electrodomestico,
				new AveriaFinaciable("Puerta", 0.5f, Arrays.asList(new Repuesto("puerta", 96325.5f))));

		electrodomestico.getAverias().forEach(System.out::println);

		for (Averia averia : electrodomestico.getAverias()) {
			if (averia.getClass().getSimpleName().equals("AveriaFinaciable")) {
				System.out.println(averia + " cuesta " + averia.getPrecio());
				System.out.println(" Si la financias cuesta cada cuota" + ((Financiable) averia).getCuantiaCuota());
			}
		}

	}

}
