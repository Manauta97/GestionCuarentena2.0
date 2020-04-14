package Individuos;

/*
Esta clase define los atributos de Policia y hereda los de Persona
@autor Damian, Ra�l y Ivan
@version 1.0

*/

public final class Policia extends Persona{
	private String nPlaca;

	public Policia(String nombre, String dni, String nPlaca) {
		super(nombre, dni);
		this.nPlaca = nPlaca;
	}

	public String getnPlaca() {
		return nPlaca;
	}

	@Override
	public String toString() {
		return super.toString() + "N�mero Placa: " + nPlaca;
	}
	
}
