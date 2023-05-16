package ejercicio3;

public class NegativeMonthException extends Exception {
	/**
	 * Sobreescribimos el mensaje de excepción en caso de que el mes introducido no
	 * sea válido
	 */
	@Override
	public String toString() {
		return "El mes no es correcto";
	}
}
