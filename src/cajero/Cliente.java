package cajero;

public class Cliente extends Usuario {
	
	private int numCliente;

	//Constructor
	public Cliente(String nombre, String dNI, String apellido, int rol, int pin, int numCliente) {
		super(nombre, dNI, apellido, rol, pin);
		this.numCliente = numCliente;
	}
	
	//----------Metodos----------
	
	//Getters - Setters
	public int getNumCliente() {
		return numCliente;
	}

	public void setNumCliente(int numCliente) {
		this.numCliente = numCliente;
	}

	
	
	

}
