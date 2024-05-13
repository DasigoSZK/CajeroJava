package cajero;

public class Cuenta {

	private Cliente cliente;
	private double saldo;
	private String transacciones;
	
	//Constructor
	public Cuenta(Cliente cliente, double saldo, String transacciones) {
		super();
		this.cliente = cliente;
		this.saldo = saldo;
		this.transacciones = transacciones;
	}
	
	//----------Metodos----------
	
	public boolean retirarDinero(double monto, Cajero cajero) {
		return false;
	}
	public boolean depositarDinero(double monto, Cajero cajero) {
		return false;
	}
	
	//Getters - Setters
	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public String getTransacciones() {
		return transacciones;
	}


	public void setTransacciones(String transacciones) {
		this.transacciones = transacciones;
	}
	
	
	
	
}
