package motivos;

/*
Esta clase define los atributos de Salidas
@autor Damian, Raúl y Ivan
@version 1.0
*/

public class Salidas {
	private String motivos;
	private String fecha;
	private String hora;
	private String minutos;
	private String dni;
	
	
	public Salidas(String motivos, String fecha, String hora, String minutos,String dni) {
		this.motivos=motivos;
		this.fecha=fecha;
		this.hora=hora;
		this.minutos=minutos;
		this.dni=dni;
	}
	
	public String getMotivos() {
		return motivos;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public String getHora() {
		return hora;
	}
	
	public String getMinutos() {
		return minutos;
	}
	
	public String getdni() {
		return dni;
	}
	
	public void setMotivos(String motivos) {
		this.motivos = motivos;
	}
	
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public void setHora(String hora) {
		this.hora = hora;
	}
	
	public void setMinutos(String minutos) {
		this.minutos = minutos;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "motivos: " + motivos + " fecha: " + fecha + " hora: " + hora + " minutos: " + minutos + ", dni: "+ dni;
				
	}
	
	
	
}
