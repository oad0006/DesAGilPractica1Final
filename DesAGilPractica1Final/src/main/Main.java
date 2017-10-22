package main;

import catalogo.Producto;


import reservas.Reserva;

/**
 * Clase main se encarga de la ejecución principal del sistema.
 * @author Oscar Eduardo Aguado Diaz
 *
 */
public class Main {

	/**
	 * Función que se encarga de arrancar el sistema.
	 * @param args
	 */
	public static void main(String[] args) {
		 System.out.println("Ejecución inicial del sistema");		
		 System.out.println("Programador A - Commit 1");
		  //Instanciar clase de Time
		 Timer time = new Timer();
		 String timeString = time.GetHour();
		 System.out.println("Hora ejecución: "+ timeString +"\n\n");
		 
		 //Registrar Producto
		 System.out.println("Productos");
		 Producto producto1 = new Producto("Queso", 10);
		 Producto producto2 = new Producto("Pan", 20);
		 
		 System.out.println("\t- Producto 1: " + producto1.toString());
		 System.out.println("\t- Producto 2: " + producto2.toString());
				 	 
		//Registrar reserva
		 Reserva reserva = new Reserva();
		 reserva.set_date(timeString);
		 reserva.set_lugar("Burgos");
		 System.out.println("Su reserva es: \n \t" + reserva.toString());
				 
	}

}