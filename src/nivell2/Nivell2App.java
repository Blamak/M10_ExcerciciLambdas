package nivell2;

import java.util.Arrays;
import java.util.Comparator;

public class Nivell2App {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		/*
		 * Feu una matriu que contingui algunes cadenes de text y n�meros.
		 */
			String[] matriu = { "tro", "postre", "electroencefalografista", "012", "0123", "01",
				"alegria", "amalgama", "paleont�leg", "Eristoff" };

		/*
		 * Ordeneu-la per:
		 */
			// - longitud (de m�s curta a m�s llarga)
			Arrays.sort(matriu, (a, b) -> Integer.compare(a.length(), b.length()));
			
			System.out.println("longitud (curta a llarga): " + Arrays.toString(matriu));
			
	
			// - longitud (de m�s llarga a m�s curta)
			Arrays.sort(matriu, (a, b) -> Integer.compare(b.length(), a.length()));
			
			System.out.println("\nlongitud (llarga a curta): " + Arrays.toString(matriu));
			
	
			// - alfab�ticament pel primer car�cter
			Arrays.sort(matriu, (a, b) -> Character.compare(
					Character.toLowerCase(a.charAt(0)), Character.toLowerCase(b.charAt(0))
					));
			
			System.out.println("\nalfab�ticament primer car�cter: " + Arrays.toString(matriu));
				
	
			// - les cadenes que contenen 'e' primer, tota la resta en segon lloc
			Arrays.sort(matriu, Comparator.comparingInt(
					a -> (a.contains("e") || a.contains("E") ? 0 : 1)
					));
			
			System.out.println("\ncontenen 'e' primer: " + Arrays.toString(matriu));
			
	
			// - modifica tots els elements de la matriu per canviar els caracters 'a' a '4'
			matriu = Arrays.stream(matriu)
					.map(string -> string.replace("a", "4"))
					.toArray(String[]::new);
	
			System.out.println("\ncaracters 'a' -> '4': " + Arrays.toString(matriu));
			
	
			// - mostra nom�s els elements que siguin 100% num�rics. (tot i que estigui guardats com strings)
			String[] matriuNumbers = Arrays.stream(matriu)
					.filter(string -> string.matches("[0-9]*"))
					.toArray(String[]::new);
	
			System.out.println("\nelements 100% num�rics: " + Arrays.toString(matriuNumbers));
			
		

		/*
		 * Crea una Functional Interface que continga un m�tode abstracte operacio (),
		 * que retorne un valor float; injecta a la interf�cie creada mitjan�ant una
		 * lambda el cos del m�tode, de manera que pugis transformar la operaci� a una
		 * suma, resta, multiplicaci� i divisio.
		 */
			IOperacio suma = (Float num1, Float num2) ->  num1 + num2;
			System.out.println("\nsuma: " + suma.operacio(35.25F, 20.25F));
			
			IOperacio resta = (Float num1, Float num2) ->  num1 - num2;
			System.out.println("resta: " + resta.operacio(35.25F, 20.25F));
			
			IOperacio producte = (Float num1, Float num2) ->  num1 * num2;
			System.out.println("producte: " + producte.operacio(10.25F, 10F));
			
			IOperacio divisio = (Float num1, Float num2) ->  num1 / num2;
			System.out.println("divisio: " + divisio.operacio(10.25F, 10F));
			
	}

}
