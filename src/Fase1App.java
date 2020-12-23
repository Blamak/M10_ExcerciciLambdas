import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Fase1App {

	public static void main(String[] args) {

		/*
		 * 1: Tenint una llista de cadenes de noms propis, escriu un m�tode que retorne
		 * una llista de totes les cadenes que comencen amb la lletra 'a' (mayuscula) i
		 * tenen exactament 3 lletres. Imprimeix el resultat.
		 * 
		 */
		List<String> nomsList = Arrays.asList("Ada", "Deanna", "Geordi", "Beverly", "William", "Adam", "Armen", "Art",
				"Asa", "Arn");

		System.out.println(cadenesAmbA(nomsList));
		

		/*
		 * 2: Escriu un m�tode que retorne una cadena separada per comes basada en una
		 * llista d�Integers. Cada element hauria d'anar precedit per la lletra "e" si
		 * el nombre �s parell, i precedit de la lletra "o" si el nombre �s imparell.
		 * Per exemple, si la llista d'entrada �s (3,44), la sortida hauria de ser
		 * "o3, e44". Imprimeix el resultat.
		 * 
		 */
		List<Integer> nombres = Arrays.asList(3, 44);
		System.out.println(parellsSenars(nombres));
		

		/*
		 * 3: Escriu un m�tode que retorne una cadena separada per comes basada en una
		 * llista d�Integers. Cada element hauria d'anar precedit per la lletra "e" si
		 * el nombre �s parell, i precedit de la lletra "o" si el nombre �s imparell.
		 * Per exemple, si la llista d'entrada �s (3,44), la sortida hauria de ser
		 * "o3, e44". Imprimeix el resultat.
		 * 
		 */
		List<String> cadenesList = Arrays.asList("Betazed", "OmicronIV", "Nibok", "Zeon", 
				"TarsusIII", "Ferenginar", "Risa", "ThanatosVII");
		System.out.println(cadenesAmbO(cadenesList));
		

		/*
		 * 4: Has de fer el mateix que en el punt anterior, per� retornant una llista
		 * que incloga els elements amb m�s de 5 lletres. Imprimeix el resultat
		 */
		System.out.println(mesDeCincLletres(cadenesList));
		
		
		/*
		 * 5: Crea una llista amb els nombs dels mesos de l�any. Imprimeix tots els elements
		 * de la llista amb una lambda.
		 */
		List<String> mesos = Arrays.asList("gener", "febrer", "mar�", "abril", "maig", "juny",
				"juliol", "agost", "setembre", "octubre", "novembre", "desembre");
		mesos.forEach(mes -> System.out.println(mes));
		
		
		/*
		 * 6: Has de fer la mateixa impressi� del punt anterior per� fent-ho mitjan�ant method reference.
		 */
		mesos.forEach(System.out::println);

	}
	
	
	// ****************** M�TODES ORDENATS *************************** //

	// 1:
	public static List<String> cadenesAmbA(List<String> cadena) {
		return cadena.stream()
				.filter(nom -> nom.startsWith("A"))
				.filter(nom -> nom.length() == 3)
				.collect(Collectors.toList());
	}

	// 2:
	public static String parellsSenars(List<Integer> nombres) {
		return nombres.stream()
				.map(nombre -> String.valueOf(nombre))
				.map(nombre -> Integer.parseInt(nombre) % 2 == 0 ? "e".concat(nombre) : "o".concat(nombre))
				.collect(Collectors.joining(","));
	}

	// 3:
	public static List<String> cadenesAmbO(List<String> cadenesList) {
		return cadenesList.stream()
				.filter(cadena -> cadena.toLowerCase().contains("o"))
				.collect(Collectors.toList());
	}
	
	// 4:
	public static List<String> mesDeCincLletres(List<String> cadenesList) {
		return cadenesList.stream()
				.filter(cadena -> cadena.length() > 5)
				.collect(Collectors.toList());
	}

}