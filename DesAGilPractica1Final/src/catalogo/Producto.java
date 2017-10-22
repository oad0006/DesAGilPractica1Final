package catalogo;
/**
 * Clase que se encarga de realizar un registro de producto
 * @author Oscar Eduardo Aguado Diaz
 *
 */
public class Producto {
	
	private String _name;
	
	private int _quantity; 
	
	/**
	 * Contructor
	 */
	public Producto(String name, int quantity) {
		 _name = name;	
		 _quantity = quantity;
	}
	
	/**
	 * Asignación de un producto "Venta"
	 */
	public void AssignProduct() {
		_quantity-=1;
	}
	
	/**
	 * Representación en cadena
	 * @return
	 */
	public String toString() {
		return "Producto: "+_name +", Cantidad: " + _quantity ;
	}

}