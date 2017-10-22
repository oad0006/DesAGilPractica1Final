package main;

import reservas.Reserva;

/**
 * Clase main se encarga de la ejecuci�n principal del sistema.
 * @author Oscar Eduardo Aguado Diaz
 *
 */
public class Main {

	/**
	 * Funci�n que se encarga de arrancar el sistema.
	 * @param args
	 */
	public static void main(String[] args) {
		 System.out.println("Ejecuci�n inicial del sistema");		
		 
		 //Instanciar clase de Time
		 Timer time = new Timer();
		 String timeString = time.GetHour();
		 System.out.println("Hora ejecuci�n: "+ timeString +"\n\n");
		 

		//Registrar reserva
		 Reserva reserva = new Reserva();
		 reserva.set_date(timeString);
		 reserva.set_lugar("Burgos");
		 System.out.println("Su reserva es: \n \t" + reserva.toString());
				 
	}

}