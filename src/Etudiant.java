/**
 * 
 */

/**
 * @author Elouan
 *
 */
public class Etudiant extends Personne {
	private String promotion;
	private int nbAbsences;
	
	public Etudiant() {
		super();
		this.promotion = "no-promotion";
		this.nbAbsences = -1;
	}
	
	public Etudiant(String nom, String prenom, int age, String promotion, int abs) {
		super(nom,prenom,age);
		this.promotion = promotion;
		this.nbAbsences = abs;
	}

	public String getPromotion() {
		return promotion;
	}

	public void setPromotion(String promotion) {
		this.promotion = promotion;
	}

	public int getNbAbsences() {
		return nbAbsences;
	}

	public void setNbAbsences(int nbAbsences) {
		this.nbAbsences = nbAbsences;
	}
	
	public void ouMeTrouver() {
		System.out.println("Je suis en cours tous les jours, sauf les jeudis après-midi (je fais du sport, mais c'est comme un cours car j'aime pas le sport).");
	}
	
	public String toString() {
		return super.toString() + ", promotion \"" + promotion + "\", nombres d'Abs : " + nbAbsences;
	}
}
