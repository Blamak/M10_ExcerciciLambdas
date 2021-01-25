package nivell2;

import java.util.Arrays;
import java.util.Comparator;

import nivell1.Fase2.IPiValue;

public class Nivell2App {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		/*
		 * Feu una matriu que contingui algunes cadenes de text y números.
		 */
			String[] matriu = { "tro", "postre", "electroencefalografista", "012", "0123", "01",
				"alegria", "amalgama", "paleontòleg" };

		/*
		 * Ordeneu-la per:
		 */
			// - longitud (de més curta a més llarga)
			Arrays.sort(matriu, (a, b) -> Integer.compare(a.length(), b.length()));
			System.out.println("longitud (curta a llarga): " + Arrays.toString(matriu));
	
			// - longitud (de més llarga a més curta)
			Arrays.sort(matriu, (a, b) -> Integer.compare(b.length(), a.length()));
			System.out.println("\nlongitud (llarga a curta): " + Arrays.toString(matriu));
	
			// - alfabèticament pel primer caràcter
			Arrays.sort(matriu, (a, b) -> Character.compare(a.charAt(0), b.charAt(0)));
			System.out.println("\nalfabèticament primer caràcter: " + Arrays.toString(matriu));
	
			// - Les cadenes que contenen 'e' primer, tota la resta en segon lloc
			Arrays.sort(matriu, Comparator.comparingInt(a -> (a.contains("E") || a.contains("e") ? 0 : 1)));
			System.out.println("\ncontenen 'e' primer: " + Arrays.toString(matriu));
	
			// - Modifica tots els elements de la matriu per canviar els caracters 'a' a '4'
			matriu = Arrays.stream(matriu).map(string -> string.replace("a", "4")).toArray(String[]::new);
	
			System.out.println("\ncaracters 'a' -> '4': " + Arrays.toString(matriu));
	
			// - Mostra només els elements que siguin 100% numèrics. (tot i que estigui guardats com strings)
			String[] matriuNumbers = Arrays.stream(matriu).filter(string -> string.matches("[0-9]*"))
					.toArray(String[]::new);
	
			System.out.println("\nelements 100% numèrics: " + Arrays.toString(matriuNumbers));
			
		

		/*
		 * Crea una Functional Interface que continga un mètode abstracte operacio (),
		 * que retorne un valor float; injecta a la interfície creada mitjançant una
		 * lambda el cos del mètode, de manera que pugis transformar la operació a una
		 * suma, resta, multiplicació i divisio.
		 */
			IOperacio suma = (Float num1, Float num2) ->  num1 + num2;
			System.out.println("\nsuma: " + suma.operacio(35.25F, 25.25F));
			
			IOperacio resta = (Float num1, Float num2) ->  num1 - num2;
			System.out.println("resta: " + resta.operacio(35.25F, 25.25F));
			
			IOperacio producte = (Float num1, Float num2) ->  num1 * num2;
			System.out.println("producte: " + producte.operacio(10.25F, 10F));
			
			IOperacio divisio = (Float num1, Float num2) ->  num1 / num2;
			System.out.println("divisio: " + divisio.operacio(10.25F, 10F));
			
	}

}
