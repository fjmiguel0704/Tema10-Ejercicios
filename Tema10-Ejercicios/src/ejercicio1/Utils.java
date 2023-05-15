package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {

	/**
	 * Esta función leerá un dato introducido por teclado y capturará su excepción
	 * en caso de que se de para devolver un mensaje de error
	 * 
	 * @param valor
	 * @return
	 */
	public static double readDouble(Scanner valor) {
		double valorDouble = 0;
		try {
			System.out.println("Introduce un número con decimales: ");
			valorDouble = valor.nextDouble();

		} catch (InputMismatchException e) {
			System.err.println("El dato introducido no es de tipo double");
		}
		valor.nextLine();
		return valorDouble;
	}

	/**
	 * Esta función leerá un dato introducido por teclado y capturará su excepción
	 * en caso de que se de para devolver un mensaje de error
	 * 
	 * @param valor
	 * @return
	 */
	public static int readInt(Scanner valor) {
		int valorInt = 0;
		try {
			System.out.println("Introduce un número entero: ");
			valorInt = valor.nextInt();

		} catch (InputMismatchException e) {
			System.err.println("El dato introducido no es de tipo int");
		}
		valor.nextLine();
		return valorInt;
	}

}
