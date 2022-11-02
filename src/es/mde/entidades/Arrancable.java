package es.mde.entidades;

public interface Arrancable {

	default void arrancar() {
		System.out.println("Arrancado S/N");
	}

}
