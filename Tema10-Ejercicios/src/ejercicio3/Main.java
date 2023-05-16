package ejercicio3;

public class Main {

	public static void main(String[] args) throws NegativeDayException, NegativeMonthException, NegativeYearException {
		// Objeto, al que se le pasa como parámetro al constructor un día, un mes y un
		// año
		Fecha objeto = new Fecha(28, 2, 9);

		// Modificamos el dia, mes y año de la fecha
		try {
			objeto.setDia(-1);
			objeto.setMes(1);
			objeto.setAño(1);

			// Y si algún dato es incorrecto y se da una excepcion, mostramos el mensaje que
			// sobreescribimos
		} catch (NegativeDayException d) {
			System.out.println(d.toString());
		} catch (NegativeMonthException m) {
			System.out.println(m.toString());
		} catch (NegativeYearException a) {
			System.out.println(a.toString());
		}

	}

}
