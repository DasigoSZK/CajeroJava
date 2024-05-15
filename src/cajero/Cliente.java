package cajero;

import javax.swing.JOptionPane;

public class Cliente extends Usuario {
	
	private int numCliente;

	//Constructor
	public Cliente(String nombre, String dNI, String apellido, int rol, int pin, int numCliente) {
		super(nombre, dNI, apellido, rol, pin);
		this.numCliente = numCliente;
	}
	
	//----------Metodos----------
	
	@Override
	public void menu(Cajero cajero) {
		
		JOptionPane.showMessageDialog(null, "Estoy en el menu cliente");
		String[] opciones = { "Retirar dinero", "Depositar dinero", "Ver cuenta", "Salir" };
		int opcion = 0;
		Cuenta corriente = new Cuenta(this, 1000, "");
		
		do {
			opcion = JOptionPane.showOptionDialog(null, "Elija una opción", "Cajero", 0, 0, null, opciones,
					opciones[0]);

			switch (opcion) {
				//Retirar dinero
				case 0:
					int monto =0; 
	
					do {
						 monto = Integer.parseInt(JOptionPane.showInputDialog( "Ingrese el monto"));
					} while (monto< 1);
					if (corriente.retirarDinero(monto, cajero)) {
						JOptionPane.showMessageDialog(null, "Retiró $"+monto+"\nSaldo Actual: $" + corriente.getSaldo());
					} else {
						JOptionPane.showMessageDialog(null, "Operación cancelada.");
					}
					break;
				
				//Depositar dinero
				case 1:
					
					int monto2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto a depositar:"));
					if(corriente.depositarDinero(monto2, cajero)) {
						JOptionPane.showMessageDialog(null, "Depositó $" + monto2 + "\nSaldo Actual: $" + corriente.getSaldo());
					}else {
						JOptionPane.showMessageDialog(null, "Operación cancelada.");
					}
					break;
					
				//Ver cuenta
				case 2:
					JOptionPane.showMessageDialog(null, "información de cuenta : " + corriente.getCliente().getNombre() 
					+ "\nTransacciones:\n" +  corriente.getTransacciones() + "\n\nSaldo Actual: $" + corriente.getSaldo());
					break;
				
				//Salir
				case 3:
					break;
				default:
					break;
			}
		} while (opcion != 3);
	}

	
	//Getters - Setters
	public int getNumCliente() {
		return numCliente;
	}


	public void setNumCliente(int numCliente) {
		this.numCliente = numCliente;
	}

	
	
	

}
