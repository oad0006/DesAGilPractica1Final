package main;

import java.util.Calendar;

/**
 * Clase que representa la hora
 * @author Oscar Eduardo Aguado Diaz
 *
 */
public class Timer {
	/**
	 * Objeto calendario
	 */
	private Calendar _calendar;	
	/**
	 * Hora
	 */
	private int _hours;
	/**
	 * Minutos
	 */
	private int _minutes;
	/**
	 * Segundos
	 */
	private int _seconds;
	
	/**
	 * Constructor
	 */
	public Timer() {
		_calendar = Calendar.getInstance();
		_hours =_calendar.get(Calendar.HOUR_OF_DAY);
		_minutes = _calendar.get(Calendar.MINUTE);
	    _seconds = _calendar.get(Calendar.SECOND);
	}
	
	/**
	 * Función que se encarga de retornar la hora
	 * @return
	 */
	public String GetHour() {
	    return "" + _hours + ":" + _minutes + ":" + _seconds;
	}
}