package es.mde.constantes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import es.mde.entidades.Averia;
import es.mde.entidades.Repuesto;

public class ConstantesTaller {

	final static Repuesto REPUESTO1 = new Repuesto("aceite", 12.6f);
	final static Repuesto REPUESTO2 = new Repuesto("pastillas de freno", 22.6f);
	final static Repuesto REPUESTO3 = new Repuesto("anticongelante", 9.6f);
	final static Repuesto REPUESTO4 = new Repuesto("rueda", 125.2f);
	final static Repuesto REPUESTO5 = new Repuesto("luna", 225.2f);
	final static Repuesto REPUESTO6 = new Repuesto("arandela", 0.5f);
	final static Repuesto REPUESTO7 = new Repuesto("junta Torica", 1.2f);
	final static Repuesto REPUESTO8 = new Repuesto("tornillo", 1.5f);
	final static Repuesto REPUESTO9 = new Repuesto("filtro", 23.2f);
	final static Repuesto REPUESTO10 = new Repuesto("generico", 33.2f);

	final static Repuesto[] REPUESTO_CAMBIO_ACEITE = { REPUESTO1, REPUESTO6, REPUESTO7 };
	final static Repuesto[] REPUESTO_CAMBIO_ANTICONGELANTE = { REPUESTO3, REPUESTO6, REPUESTO8 };
	final static Repuesto[] REPUESTO_CAMBIO_LUNA = { REPUESTO5 };
	final static Repuesto[] REPUESTO_CAMBIO_RUEDA = { REPUESTO4, REPUESTO6, REPUESTO8, REPUESTO6, REPUESTO8, REPUESTO6,
			REPUESTO8, REPUESTO6, REPUESTO8 };
	final static Repuesto[] REPUESTO_CAMBIO_FILTRO = { REPUESTO9, REPUESTO6, REPUESTO7 };
	final static Repuesto[] REPUESTO_CAMBIO_GENERICO = { REPUESTO10 };

	final static Averia[] AVERIAS = { new Averia("Cambio Aceite", 0.5f, addRepuestoAveria(REPUESTO_CAMBIO_ACEITE)),
			new Averia("Cambio luna", 1.5f, addRepuestoAveria(REPUESTO_CAMBIO_LUNA)),
			new Averia("Cambio anticongelante", 1.5f, addRepuestoAveria(REPUESTO_CAMBIO_ANTICONGELANTE)),
			new Averia("Cambio rueda", 1.5f, addRepuestoAveria(REPUESTO_CAMBIO_RUEDA)),
			new Averia("Cambio filtro", 1.5f, addRepuestoAveria(REPUESTO_CAMBIO_FILTRO)),
			new Averia("Cambio GENERICO", 1.5f, addRepuestoAveria(REPUESTO_CAMBIO_GENERICO)), };

	public static Averia[] getAverias() {
		return AVERIAS;
	}

	public static List<Repuesto> addRepuestoAveria(Repuesto... repuesto) {
		List<Repuesto> listaRepuestos = new ArrayList<>();

		listaRepuestos.addAll(Arrays.asList(repuesto));

		return listaRepuestos;
	}

}
