package ejercicio3;

public class NegativeDayException extends Exception {
	/**
	 * Sobreescribimos el mensaje de excepción en caso de que el dia introducido no
	 * sea válido
	 */
	@Override
	public String toString() {
		return "El día no es correcto";
	}
}
