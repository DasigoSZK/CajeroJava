package cajero;

import javax.swing.JOptionPane;

public class Empleado extends Usuario{
	
	private String turno;

	//Constructor
	public Empleado(String nombre, String dNI, String apellido, int rol, int pin, String turno) {
		super(nombre, dNI, apellido, rol, pin);
		this.turno = turno;
	}
	
	//----------Metodos----------
	//Suma saldo al cajero
	public boolean mantenerCajero(Cajero cajero, int monto) {
		
		if(monto < 1) {
			JOptionPane.showMessageDialog(null, "El monto no puede ser menor a $1");
			return false;
		}else {
			cajero.setSaldo(cajero.getSaldo()+monto);
			return true;
		}
		
	}
	
	//POLIMORFISMO: menu del empleado
	@Override
	public void menu(Cajero cajero) {
		JOptionPane.showMessageDialog(null, "Estoy en el menu empleado");
		String[] opciones = { "Recargar dinero", "Ver Estado", "Salir" };
		int opcion = 0;
		do {
			opcion = JOptionPane.showOptionDialog(null, "Elija una opción", "Cajero", 0, 0, null, opciones,
					opciones[0]);

			switch (opcion) {
				//Recargar Dinero
				case 0:
					int monto =0; 
					monto = Integer.parseInt(JOptionPane.showInputDialog( "Ingrese el monto"));
					this.mantenerCajero(cajero, monto);
					break;
					
				//Ver Estado Cajero
				case 1:
					JOptionPane.showMessageDialog(null, cajero);
					break;
				//Salir
				case 2:
					JOptionPane.showMessageDialog(null, "Salir");
					break;
				default:
					break;
				}
		} while (opcion != 2);
		
	}
	
	

	
	
	//Getters - Setters
	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	

}
