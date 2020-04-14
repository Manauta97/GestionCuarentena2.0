package Individuos;

import java.io.Serializable;
/*
  Esta clase define los atributos de persona
  @autor Damian, Ra�l y Ivan
  @version 1.0
  
 */

public abstract class Persona implements Serializable {
		protected String nombre;
		protected String dni;
		
		public Persona(String nombre, String dni) {
			this.nombre = nombre;
			this.dni = dni;
		}

		public String getNombre() {
			return nombre;
		}

		public String getDni() {
			return dni;
		}

		@Override
		public String toString() {
			return "nombre: "+ nombre + "dni: " + dni;
		}
		
}
