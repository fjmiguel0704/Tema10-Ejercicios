package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Creamos el scanner para leer por teclado
		Scanner read = new Scanner(System.in);

		// Llámamos al método double
		System.out.println(Utils.readDouble(read));
		System.out.println();
		// Llámamos al método int
		System.out.println(Utils.readInt(read));

	}

}
