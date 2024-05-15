package cajero;

import java.time.LocalDateTime;

import javax.swing.JOptionPane;

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
	
	//Retira dinero si la cuenta y el cajero poseen saldo
	public boolean retirarDinero(double monto, Cajero cajero) {
		
		//Validación  básica
		if(monto < 1) {
			JOptionPane.showMessageDialog(null, "El monto a retirar no puede ser menor a $1.");
			return false;
		}
		
		
		if(this.getSaldo() >= monto) {
			if(cajero.getSaldo() >= monto) {
				//Si la cuenta y el cajero tienen saldo, retiramos
				this.setTransacciones(this.getTransacciones() + "Retiro de dinero - Horario: " 
									+ LocalDateTime.now().getHour() +  " "  + LocalDateTime.now().getMinute() 
									+ " - Monto: $"+ monto + "\n");
				//Sacamos dinero de la cuenta
				this.setSaldo(this.getSaldo()-monto);
				return true;
			}else {
				//El cajero no tiene saldo
				JOptionPane.showMessageDialog(null, "El cajero no posee saldo suficiente ($" + cajero.getSaldo() + ").");
				return false;
			}
		}else {
			//Si la persona no tiene saldo suficiente
			JOptionPane.showMessageDialog(null, "No tienes saldo suficiente para realizar esta extracción ($" + this.getSaldo() + ").");
			return false;
		}
	}
	
	//Deposita dinero en el cajero
	public boolean depositarDinero(double monto, Cajero cajero) {
		if(monto < 1) {
			JOptionPane.showMessageDialog(null, "El monto a depositar no puede ser menor a $1.");
			return false;
		}
		
		//Depositamos en la cuenta
		this.setSaldo(this.getSaldo()+monto);
		this.setTransacciones(this.getTransacciones() + "Deposito de dinero - Horario: "
				+ LocalDateTime.now().getHour() +  " "  + LocalDateTime.now().getMinute()
				+ " - Monto: $" + monto + "\n");
		//Sumamos saldo al cajero
		cajero.setSaldo(cajero.getSaldo()+monto);
		
		return true;
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
