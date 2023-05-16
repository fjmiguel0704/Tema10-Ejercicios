package ejercicio2;

public class NegativeHourException extends Exception {
	/**
	 * Sobreescribimos el mensaje de excepción en caso de que la hora introducida no
	 * sea válida
	 */
	@Override
	public String toString() {
		return "La hora no puede ser negativa";
	}
}
