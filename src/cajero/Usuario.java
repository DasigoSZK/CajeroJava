package cajero;

public abstract class Usuario {

	private String nombre;
	private String DNI;
	private String apellido;
	private int rol;
	private int pin;
	
	//Constructor
	public Usuario(String nombre, String dNI, String apellido, int rol, int pin) {
		super();
		this.nombre = nombre;
		DNI = dNI;
		this.apellido = apellido;
		this.rol = rol;
		this.pin = pin;
	}

	//----------Metodos----------
	public boolean iniciarSesion(int pin) {
		return false;
	}
	
	//Getters - Setters
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDNI() {
		return DNI;
	}


	public void setDNI(String dNI) {
		DNI = dNI;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getRol() {
		return rol;
	}


	public void setRol(int rol) {
		this.rol = rol;
	}


	public int getPin() {
		return pin;
	}


	public void setPin(int pin) {
		this.pin = pin;
	}
	
	
	
}
