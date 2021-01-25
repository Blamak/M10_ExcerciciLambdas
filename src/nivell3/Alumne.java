package nivell3;

public class Alumne {

	String nom;
	int edat;
	String curs;
	double nota;

	public Alumne(String nom, int edat, String curs, double nota) {
		this.nom = nom;
		this.edat = edat;
		this.curs = curs;
		this.nota = nota;
	}

	public String getNom() {
		return this.nom;
	}

	public int getEdat() {
		return this.edat;
	}

	public String getCurs() {
		return this.curs;
	}

	public double getNota() {
		return this.nota;
	}
		
}
