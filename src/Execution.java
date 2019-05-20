/**
 * 
 */

/**
 * @author Elouan
 *
 */
public class Execution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Création Etudiant
		Etudiant e1 = new Etudiant("Dupont", "Alice", 21, "Pascal", 0);
		Etudiant e2 = new Etudiant("Dujardin", "Benjamin", 22, "Ohm", 2);
		Etudiant e3 = new Etudiant();
		e3.setPromotion("Promotion inconnue");
		Etudiant e4 = new Etudiant();
		e4.setPromotion("Promotion inconnue");
		
		// Création Administratif
		Administratif a1 = new Administratif("Dupont", "Béatrice", 19, "Secrétariat" ,"secrétaire");
		
		// Création Enseignant
		Enseignant prof1 = new Enseignant("Machin", "Boris", 36,"Equipe enseignante" ,"Informatique", "Electronique");
		
		

	}

}
