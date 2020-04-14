package Individuos;

/*
Esta clase define los atributos de Ciudadano y hereda los de Persona
@autor Damian, Ra�l y Ivan
@version 1.0

*/

public final class Ciudadano extends Persona{
	private String nCiudadano;

	public Ciudadano(String nombre, String dni, String nCiudadano) {
		super(nombre, dni);
		this.nCiudadano = nCiudadano;
	}

	public String getnCiudadano() {
		return nCiudadano;
	}

	@Override
	public String toString() {
		return super.toString()+ " nCiudadano: " + nCiudadano;
	}
	
	
	
}
