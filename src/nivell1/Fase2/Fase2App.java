package nivell1.Fase2;

/*
 * FASE 2:
 * 
 * Crea una Functional Interface que continga un mètode abstracte getPiValue (),
 * que retorna un valor double; en una altra classe, instancie la interfície i 
 * assigneu-li mitjançant una lambda el valor 3.1415. 
 * Invoca el mètode getPiValue de la instància d'interfície i imprimeix el resultat. 
 */

public class Fase2App {

	public static void main(String[] args) {

		IPiValue valor = () -> 3.1475;

		System.out.println(valor.getPiValue());
	}

}
