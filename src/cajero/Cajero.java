package cajero;

public class Cajero {
	
	private String ubicacion;
	private double saldo;
	
	//Constructor
	public Cajero(String ubicacion, double saldo) {
		super();
		this.ubicacion = ubicacion;
		this.saldo = saldo;
	}

	//----------Metodos----------
	
	//Getters - Setters
	public String getUbicacion() {
		return ubicacion;
	}


	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String toString() {
		
		String cajero = "Información del Cajero "+this.getUbicacion()+":\n";
		cajero += "Saldo: $" + this.getSaldo();
		
		return cajero;
	}

}
