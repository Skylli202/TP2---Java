/**
 * 
 */

/**
 * @author Elouan
 *
 */
public class Personnel extends Personne {
	private String service;
	
	public Personnel() {
		super();
		this.service = "no-service";
	}
	
	public Personnel(String nom, String prenom, int age, String service) {
		super(nom,prenom,age);
		//super();
		this.service = service;
	}
	
	public void afficherNom() {
		System.out.println("Ce personnel a " + super.getNom()+ "an(s)");
	}
	
	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public void afficherPrenom() {
		System.out.println("Ce personnel a " + prenom + "an(s)");
	}
	
	public void afficherAge() {
		System.out.println("Ce personnel a " + age + "an(s)");
	}
	
	public String toString() {
		return super.toString() + ", service \"" + service + "\"";
	}
}
