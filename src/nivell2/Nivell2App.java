package nivell2;

import java.util.Arrays;
//import java.util.Comparator;

public class Nivell2App {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		/*
		 *  Feu una matriu que contingui algunes cadenes de text y números.
		 */

		String[] matriu  = {"Electroencefalografista", "5654786", "1000110011000" ,"filaberquí", "77", "fastuc", "titiriteru", "34564", "316456456"};

		/*
		 * Ordeneu-la per:
		 */
			// -longitud (de més curta a més llarga):
				// Arrays.sort(matriu, Comparator.comparingInt(String::length)); --amb Comparator--
			Arrays.sort(matriu, (a, b)->Integer.compare(a.length(), b.length()));
			System.out.println(Arrays.toString(matriu));
		
			// -longitud (de més llarga a més curta):
			Arrays.sort(matriu, (a, b)->Integer.compare(b.length(), a.length()));
			System.out.println(Arrays.toString(matriu));
			
			// -alfabèticament pel primer caràcter
			Arrays.sort(matriu, (a, b)->Character.compare(a.charAt(0), b.charAt(0)));
			System.out.println(Arrays.toString(matriu));
			
			// Les cadenes que contenen "e" primer, tota la resta en segon lloc.
			
			

	}

}
