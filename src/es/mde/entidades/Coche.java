package es.mde.entidades;

public class Coche extends VehiculoConRuedas {
	protected int numeroDeRuedas;
	private String matricula;

	public String getMatricula() {
		return matricula;
	}

	protected void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	protected void setNumeroDeRuedas(int numeroDeRuedas) {
		this.numeroDeRuedas = numeroDeRuedas;
	}

	public Coche(String modelo, String color) {
		super(modelo, color);
		setNumeroDeRuedas(4);
	}

	public Coche(String modelo, String color, int numeroDeRuedas, String matricula) {
		super(modelo, color);
		setNumeroDeRuedas(numeroDeRuedas);
		setMatricula(matricula);
	}

	@Override
	public int getNumeroDeRuedas() {
		return numeroDeRuedas;
	}

	@Override
	public void arrancar() {
		System.out.println(getMatricula() + "estoy arrancando");
	}

	@Override
	public String toString() {
		return "Placa " + matricula + " - " + super.toString();
	}
}
