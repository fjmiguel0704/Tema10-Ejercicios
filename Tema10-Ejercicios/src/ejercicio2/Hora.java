package ejercicio2;

public class Hora {
	/**
	 * Hora actual de una hora
	 */
	private int hora;
	/**
	 * Minutos actuales de una hora
	 */
	private int minutos;
	/**
	 * Segundos actuales de una hora
	 */
	private int segundos;

	/**
	 * Constructo vacío
	 */
	public Hora() {

	}

	/**
	 * Constructor que asigna valores a horas, minutos y segundos y lanza una
	 * excepción en caso de un dato no válido
	 * 
	 * @param hora     actual
	 * @param minutos  actuales
	 * @param segundos actuales
	 */
	public Hora(int hora, int minutos, int segundos)
			throws NegativeHourException, NegativeMinuteException, NegativeSecondException {
		if (hora < 0) {
			throw new NegativeHourException();
		} else {
			this.hora = hora;
		}

		if (minutos < 0) {
			throw new NegativeMinuteException();
		} else {
			this.minutos = minutos;
		}

		if (segundos < 0) {
			throw new NegativeSecondException();
		} else {
			this.segundos = segundos;
		}

	}

	/**
	 * Este método devuelve la hora actual
	 * 
	 * @return la hora
	 */
	public int getHora() {
		return hora;
	}

	/**
	 * Este método actualiza la hora y lanza una excepción en caso de una hora no
	 * válida
	 * 
	 * @param hora a actualizar
	 */
	public void setHora(int hora) throws NegativeHourException {
		if (hora < 0) {
			throw new NegativeHourException();
		} else {
			this.hora = hora;
		}
	}

	/**
	 * Este método devuelve los minutos actuales
	 * 
	 * @return los minutos
	 */
	public int getMinutos() {
		return minutos;
	}

	/**
	 * Este método actualiza los minutos y lanza una excepción en caso de unos
	 * minutos no válidos
	 * 
	 * @param minutos a actualizar
	 */
	public void setMinutos(int minutos) throws NegativeMinuteException {
		if (minutos < 0) {
			throw new NegativeMinuteException();
		} else {
			this.minutos = minutos;
		}
	}

	/**
	 * Este método devuelve los segundos actuales
	 * 
	 * @return los segundos
	 */
	public int getSegundos() {
		return segundos;
	}

	/**
	 * Este método actualiza los segundos y lanza una excepción en caso de unos
	 * segundos no válidos
	 * 
	 * @param segundos a actualizar
	 */
	public void setSegundos(int segundos) throws NegativeSecondException {
		if (segundos < 0) {
			throw new NegativeSecondException();
		} else {
			this.segundos = segundos;
		}
	}

	/**
	 * Este método incrementa un segundo. Va incrementando los minutos cuando los
	 * segundos sean igual a 60 y segundos se resetean a 0. También incrementa las
	 * horas cuando los minutos sean igual a 60 y minutos se resetean a 0. Cuando
	 * las horas sean las 23, la siguiente en incrementar pasarán a ser las 00
	 */
	public void incrementaSegundo() {
		segundos++;
		if (segundos >= 60) {
			segundos = 0;
			minutos++;
		}

		if (minutos == 60) {
			minutos = 0;
			segundos = 0;
			hora++;
		}

		if (hora >= 24) {
			hora = 0;
		}
	}
}
