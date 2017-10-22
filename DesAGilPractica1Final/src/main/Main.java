package main;
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
		 System.out.println("Hora ejecución: "+ time.GetHour() +"\n\n");
	}

}