package cajero;

public class Empleado extends Usuario{
	
	private String turno;

	//Constructor
	public Empleado(String nombre, String dNI, String apellido, int rol, int pin, String turno) {
		super(nombre, dNI, apellido, rol, pin);
		this.turno = turno;
	}
	
	//----------Metodos----------
	public boolean mantenerCajero(Cajero cajero, int monto) {
		return false;
	}
	//Getters - Setters
	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	

}
