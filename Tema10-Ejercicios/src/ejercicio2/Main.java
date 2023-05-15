package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
			throws NegativeHourException, NegativeMinuteException, NegativeSecondException {
		// Cantidad de segundos a incrementar
		int segundosIncre;

		// Scanner para leer por teclado
		Scanner read = new Scanner(System.in);

		// Objeto, pasando como parámetro al constructor la hora, minutos y segundos
		Hora objeto = new Hora(23, -59, 40);

		// Pedimos los segundos a incrementar
		System.out.println("Introduce los segundos a incrementar: ");
		segundosIncre = read.nextInt();

		// Incrementamos un segundo mientras que i sea menor a los segundos a
		// incrementar
		for (int i = 0; i < segundosIncre; i++) {
			// Llamamos al método que incrementa un segundo
			objeto.incrementaSegundo();
		}

		// Imprimimos la hora, minutos y segundos final
		System.out.println(objeto.getHora() + " : " + objeto.getMinutos() + " : " + objeto.getSegundos());
	}

}
