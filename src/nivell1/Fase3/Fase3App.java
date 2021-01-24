package nivell1.Fase3;

public class Fase3App {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// Solución canónica
		IReverse invertCadena = cadena -> new StringBuilder(cadena).reverse().toString();
		
		IReverse invertCadena2 = cadena -> { 
	         String result = "";
	         for(int i = cadena.length()-1; i >= 0; i--) {
	            result += cadena.charAt(i);}
	         return result;
	      };
	      
	     IReverse invertCadena3 = cadena -> cadena.chars()
	    		 .mapToObj(c -> (char) c)
	    		 .reduce("", (s,c) -> c+s, (s1,s2) -> s2+s1);
		
		System.out.println(invertCadena.reverse("aaabbbcccdddeee"));
		
		System.out.println(invertCadena.reverse("\naaabbbcccdddeee"));
		
		System.out.println(invertCadena.reverse("\naaabbbcccdddeee"));
	}

}
