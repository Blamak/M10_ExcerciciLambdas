package nivell1.Fase3;

/*
 * FASE 3: 
 * 
 * Crea una Functional Interface que continga un mètode abstracte reverse (),
 * que retorne un valor String; en una altra classe,
 * injecta a la interfície creada mitjançant una lambda el cos del mètode,
 * de manera que torne la mateixa cadena que rep com a paràmetre però a l'inrevés.
 * Invoca la instància de la interfície passant-li una cadena i comprovant el resultat. 
 * 
 */
public class Fase3App {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// Solució canònica
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
		System.out.println(invertCadena2.reverse("La ruta nos aportó otro paso natural."));
		System.out.println("");

		// Amb Stream de caràcters
		IReverse invertCadena3 = cadena -> 
				cadena.chars().mapToObj(c -> (char) c)
				.reduce("", (s, c) -> c + s, (s1, s2) -> s2 + s1);
		System.out.println(invertCadena3.reverse("Sarita Sosa es idónea en odiseas o sátiras."));
	}

}
