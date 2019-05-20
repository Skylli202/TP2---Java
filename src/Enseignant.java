/**
 * 
 */

/**
 * @author Elouan
 *
 */
public class Enseignant extends Personnel{
	private String matierePrincipale;
	private String matiereSecondaire;
	
	public Enseignant() {
		super();
		this.matierePrincipale = "no-matierePrincipale";
		this.matiereSecondaire = "no-matiereSecondaire";
	}
	
	public Enseignant(String nom, String prenom, int age, String service, String matierePrincipale, String matiereSecondaire) {
		super(nom, prenom, age, service);
		this.matierePrincipale = matierePrincipale;
		this.matiereSecondaire = matiereSecondaire;
	}

	public String getMatierePrincipale() {
		return matierePrincipale;
	}

	public void setMatierePrincipale(String matierePrincipale) {
		this.matierePrincipale = matierePrincipale;
	}

	public String getMatiereSecondaire() {
		return matiereSecondaire;
	}

	public void setMatiereSecondaire(String matiereSecondaire) {
		this.matiereSecondaire = matiereSecondaire;
	}
}
