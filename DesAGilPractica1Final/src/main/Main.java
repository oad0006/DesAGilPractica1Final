package main;

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
		 
		 //Instanciar clase de Time
		 Timer time = new Timer();
		 String timeString = time.GetHour();
		 System.out.println("Hora ejecución: "+ timeString +"\n\n");
		 

		//Registrar reserva
		 Reserva reserva = new Reserva();
		 reserva.set_date(timeString);
		 reserva.set_lugar("Burgos");
		 System.out.println("Su reserva es: \n \t" + reserva.toString());
				 
	}

}