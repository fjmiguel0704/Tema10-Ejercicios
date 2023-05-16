package ejercicio3;

public class NegativeYearException extends Exception {
	/**
	 * Sobreescribimos el mensaje de excepción en caso de que el año introducido no
	 * sea válido
	 */
	@Override
	public String toString() {
		return "El año no es correcto";
	}
}
