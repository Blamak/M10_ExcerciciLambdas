package nivell3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Nivell3App {

	public static void main(String[] args) {

		/*
		 * Crea una clase Alumne que tingui com a propietats: Nom, edat, curs i nota.
		 * Omple la llista amb 10 alumnes. 
		 */
		
		List<Alumne> llista = new ArrayList<>();
		
		llista.add(new Alumne("Aldo", 20, "JAVA", 3.2));
		llista.add(new Alumne("Allison", 16, "JAVA", 7.8));
		llista.add(new Alumne("Antonio", 22, "PHP", 9.5));
		llista.add(new Alumne("Carlos Alberto", 23, "PHP", 4.7));
		llista.add(new Alumne("Gerson", 17, "JAVA", 8.3));
		llista.add(new Alumne("Clodoaldo", 25, "Python", 3.1));
		llista.add(new Alumne("Rivelino", 26, "Python", 7.8));
		llista.add(new Alumne("Jairzinho", 15, "PHP", 6.4));
		llista.add(new Alumne("Tostao", 28, "PHP", 5.0));
		llista.add(new Alumne("Pelé", 29, "JAVA", 5.6));
		
		/*
		 *  Mostra per pantalla el nom i l’edat de cada alumne.
		 */
		String alumnes = llista.stream()
				.map(alumne -> alumne.getNom() + " - " + alumne.getEdat() + " anys.")
				.collect(Collectors.joining("\n"));
				
		System.out.println(alumnes);
		
		
		/*
		 *  Filtra la llista per tots els alumnes que el nom comenci per “a”,
		 *  asigna-ho a un altre llista y mostra per pantalla la nova llista (tot amb lambdas) 
		 */
		
		List<Alumne> nomPerA = llista.stream()
				.filter(alumne -> alumne.getNom().startsWith("A"))
				.collect(Collectors.toList());
		
		System.out.println("\nAlumnes amb nom començat per 'A': ");
		
		nomPerA.forEach(alumne -> {
			System.out.println(alumne.getNom());
		});
		
		
		/*
		 * Filtra y mostra per pantalla els alumnes que tinguin un 5 o mes de nota. 
		 */
		List<Alumne> cincOMes = llista.stream()
				.filter(alumne -> alumne.getNota() >= 5)
				.collect(Collectors.toList());
		
		System.out.println("\nAlumnes amb 5 o més de nota: ");
		
		cincOMes.forEach(alumne -> {
			System.out.println(alumne.getNom() + " - " + alumne.getNota());
		});
		
		
		/*
		 * Filtra y mostra per pantalla els alumnes que tinguin un 5 o mes de nota y que no siguin de PHP. 
		 */
		List<Alumne> cincOMes_noPHP = llista.stream()
				.filter(alumne -> alumne.getNota() >= 5 && !alumne.getCurs().equals("PHP"))
				.collect(Collectors.toList());
		
		System.out.println("\nAlumnes amb 5 o més de nota i no són de PHP: ");
		
		cincOMes_noPHP.forEach(alumne -> {
			System.out.println(alumne.getNom() + " - " + alumne.getCurs() + " - " + alumne.getNota());
		});
		
		/*
		 * Mostra tots els alumnes que facin JAVA i siguin majors d’edat. 
		 */
		List<Alumne> java_adults = llista.stream()
				.filter(alumne -> alumne.getEdat() >= 18 && alumne.getCurs().equals("JAVA"))
				.collect(Collectors.toList());
		
		System.out.println("\nAlumnes que fan JAVA i són majors d'edat: ");
		
		java_adults.forEach(alumne -> {
			System.out.println(alumne.getNom() + " - " + alumne.getCurs() + " - " + alumne.getEdat());
		});
	}
}
