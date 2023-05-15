package ejercicio2;

public class NegativeMinuteException extends Exception {
	/**
	 * Sobreescribimos el mensaje de excepción en caso de que los minutos
	 * introducidos no sean válidos
	 */
	@Override
	public String getMessage() {
		return "Los minutos no pueden ser negativos";
	}
}
