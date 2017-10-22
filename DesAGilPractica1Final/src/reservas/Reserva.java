package reservas;
/**
 * Clase que se encarga de realizar una reserva
 * @author Oscar Eduardo Aguado Diaz
 *
 */
public class Reserva {

	/**
	 * Fecha de la reserva
	 */
	private String _date;
	
	/**
	 * Lugar de reserva
	 */
	private String _lugar;
	
	
	/**
	 * Constructor
	 */
	public Reserva() {
		 
	}


	/**
	 * retorna la fecha de reserva
	 * @return  _date 
	 */
	public String get_date() {
		return _date;
	}


	/**
	 * Asigna la fecha de reserva
	 * @param _date the _date to set
	 */
	public void set_date(String _date) {
		this._date = _date;
	}


	/**
	 * Obtener el lugar de la reserva
	 * @return the _lugar
	 */
	public String get_lugar() {
		return _lugar;
	}


	/**
	 * Asignar el lugar de la reserva
	 * @param _lugar the _lugar to set
	 */
	public void set_lugar(String _lugar) {
		this._lugar = _lugar;
	}
	
	/**
	 * Representación en cadena
	 * @return
	 */
	public String toString() {
		return "Lugar: "+_lugar +", Hora: " + _date;
	}

}