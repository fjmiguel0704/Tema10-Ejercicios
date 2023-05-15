package ejercicio2;

public class NegativeSecondException extends Exception {
	/**
	 * Sobreescribimos el mensaje de excepción en caso de que los segundos
	 * introducidos no sean válidos
	 */
	@Override
	public String getMessage() {
		return "Los segundos no pueden ser negativos";
	}
}
