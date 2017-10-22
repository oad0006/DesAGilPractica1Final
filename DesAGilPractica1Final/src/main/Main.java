package main;

import catalogo.Producto;

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

		 //Registrar Producto
		 System.out.println("Productos");
		 Producto producto1 = new Producto("Queso", 10);
		 Producto producto2 = new Producto("Pan", 20);
		 
		 System.out.println("\t- Producto 1: " + producto1.toString());
		 System.out.println("\t- Producto 2: " + producto2.toString());
				 
	}

}