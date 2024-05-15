package cajero;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		//Creamos un cliente
		Cliente cliente1 = new Cliente("Dasigo", "43887305", "Szkamarda", 0, 123456, 1);
		//Creamos un empleado
		Empleado empleado1 = new Empleado("Leandro", "24470671", "Steyskal", 1, 654321, "tarde");
		//Creamos 2 cajeros
		Cajero cajero1 = new Cajero("Resistencia",1000);
		Cajero cajero2 = new Cajero("Sáenz Peña",0);
		
		
		
		//Preguntamos rol (Cliente/Empleado)
		int rol = JOptionPane.showOptionDialog(null, "¿Cuál es el rol del usuario?", "Ingresar Cajero", 
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[] {"Cliente","Empleado"}, "Cliente");
		
		//Preguntamos qué cajero desea utilizar
		int opcion = JOptionPane.showOptionDialog(null, "Elija cajero", "Ingresar Cajero", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
				null, new String[] {"Cajero Resistencia","Cajero Sáenz Peña"}, "Cajero Resistencia");
		Cajero seleccionado= null;
		if (opcion==0) {
			seleccionado= cajero1;
		} else {
			seleccionado= cajero2;
		}
		
		
		//-----------------------------------Ingresamos al menu-----------------------------------
		switch (rol) {
		
			case 0:
				//Ingresamos como cliente
				String dni = JOptionPane.showInputDialog("Ingrese su DNI");
				int pin = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el pin de la cuenta " + dni));
				if(cliente1.iniciarSesion(dni, pin)) {
					JOptionPane.showMessageDialog(null, "Ingresaste como " + cliente1.getNombre());
					cliente1.menu(seleccionado);
				}else {
					JOptionPane.showMessageDialog(null, "PIN u contraseña incorrectos para " + cliente1.getNombre());
				}
				break;
				
			case 1:
				//Ingresamos como empleado
				String dni1 = JOptionPane.showInputDialog("Ingrese su DNI");
				int pin1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el pin de la cuenta " + dni1));
				if(empleado1.iniciarSesion(dni1, pin1)) {
					JOptionPane.showMessageDialog(null, "Ingresaste como " + empleado1.getNombre());
					empleado1.menu(seleccionado);
				}else {
					JOptionPane.showMessageDialog(null, "PIN u contraseña incorrectos para " + empleado1.getNombre());
				}
				break;

			default:
				break;
		}

	}

}
