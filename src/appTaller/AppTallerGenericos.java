package appTaller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import es.mde.entidades.Coche;
import es.mde.entidades.Vehiculo;

public class AppTallerGenericos {

	public static void main(String[] args) {

		Vehiculo vehiculo1 = new Vehiculo("Ford", "Verde");
		Vehiculo vehiculo2 = new Vehiculo("Mercedes", "Azul");
		Vehiculo vehiculo3 = new Vehiculo("Nissan", "Amarillo");

		Coche coche1 = new Coche("Seat", "Negro", 4, "1234-DFG");
		Coche coche2 = new Coche("Honda", "Blanco", 5, "5678-LKP");
		Coche coche3 = new Coche("Toyota", "Gris", 4, "2597-FFF");
		
		List<Vehiculo> vehiculos = new ArrayList<>();
		vehiculos.add(vehiculo1);
		vehiculos.add(vehiculo2);
		vehiculos.add(vehiculo3);
		//vehiculos.add(coche1); esto es correcto porque todos los coches son vehiculos
		
		List<Coche> coches = new ArrayList<>();
		coches.add(coche1);
		coches.add(coche2);
		coches.add(coche3);
		//coches.add(vehiculo1); esto NO FUNCIONOA porque no todos los vehiculos son coches.
		
		imprimirFlota(vehiculos);
		imprimirFlota(coches);
		
		
	}
	
	private static void imprimirFlota(Collection<? extends Vehiculo> vehiculos) {
	    vehiculos.forEach(System.out::println);
	}

}
