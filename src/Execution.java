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
		
		// 1) puis 3)
		e1.ouMeTrouver();
		a1.ouMeTrouver();
		prof1.ouMeTrouver();
		
		// 4)
		System.out.println("\n*** Question 4 ***");
		Personne tab[] = new Personne[6];
		tab[0] = e1;
		tab[1] = e2;
		tab[2] = e3;
		tab[3] = e4;
		tab[4] = a1;
		tab[5] = prof1;
		
		for(Personne p : tab){
			p.ouMeTrouver();
			System.out.println(p.toString() + "\n");
		}
		
		// 7)
		e3.setNom("Kerhervé");
		e3.setPrenom("Matthieu");
		e3.setAge(21);
		e3.setPromotion("Pascale");
		e3.setNbAbsences(5);
		
		e4.setNom("Gouinguenet");
		e4.setPrenom("Elouan");
		e4.setAge(21);
		e4.setPromotion("Pascale");
		e4.setNbAbsences(17);
		
		// 8)
		System.out.println("\n*** Question 8 ***");
		for(Personne p : tab){
			p.ouMeTrouver();
			System.out.println(p.toString() + "\n");
		}
	}

}
