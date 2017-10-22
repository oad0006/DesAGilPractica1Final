package main;
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
		 System.out.println("Hora ejecuci�n: "+ time.GetHour() +"\n\n");
	}

}