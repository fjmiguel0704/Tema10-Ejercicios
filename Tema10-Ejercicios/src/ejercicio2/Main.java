package ejercicio2;

import java.util.Scanner;

import ejercicio3.NegativeDayException;
import ejercicio3.NegativeMonthException;
import ejercicio3.NegativeYearException;

public class Main {

	public static void main(String[] args)
			throws NegativeHourException, NegativeMinuteException, NegativeSecondException {
		// Cantidad de segundos a incrementar
		int segundosIncre;

		// Scanner para leer por teclado
		Scanner read = new Scanner(System.in);

		// Objeto, pasando como parámetro al constructor la hora, minutos y segundos
		Hora objeto = new Hora(23, 59, 40);

		// Modificamos la hora, minutos y segundos
		try {
			objeto.setHora(1);
			objeto.setMinutos(1);
			objeto.setSegundos(-1);

			// Y si algún dato es incorrecto y se da una excepcion, mostramos el mensaje que
			// sobreescribimos
		} catch (NegativeHourException h) {
			System.out.println(h.toString());
		} catch (NegativeMinuteException m) {
			System.out.println(m.toString());
		} catch (NegativeSecondException s) {
			System.out.println(s.toString());
		}
	}

}
