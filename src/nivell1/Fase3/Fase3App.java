package nivell1.Fase3;

/*
 * FASE 3: 
 * 
 * Crea una Functional Interface que continga un m�tode abstracte reverse (),
 * que retorne un valor String; en una altra classe,
 * injecta a la interf�cie creada mitjan�ant una lambda el cos del m�tode,
 * de manera que torne la mateixa cadena que rep com a par�metre per� a l'inrev�s.
 * Invoca la inst�ncia de la interf�cie passant-li una cadena i comprovant el resultat. 
 * 
 */
public class Fase3App {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// Soluci� can�nica
		IReverse invertCadena = cadena -> new StringBuilder(cadena).reverse().toString();
		System.out.println(invertCadena.reverse("Ateo por Arabia iba raro poeta."));
		System.out.println("");

		// Amb un bucle for
		IReverse invertCadena2 = cadena -> {
			String result = "";
			for (int i = cadena.length() - 1; i >= 0; i--) {
				result += cadena.charAt(i);
			}
			return result;
		};
		System.out.println(invertCadena2.reverse("La ruta nos aport� otro paso natural."));
		System.out.println("");

		// Amb Stream de car�cters
		IReverse invertCadena3 = cadena -> 
				cadena.chars().mapToObj(c -> (char) c)
				.reduce("", (s, c) -> c + s, (s1, s2) -> s2 + s1);
		System.out.println(invertCadena3.reverse("Sarita Sosa es id�nea en odiseas o s�tiras."));
	}

}
