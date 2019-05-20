/**
 * 
 */

/**
 * @author Elouan
 *
 */
public class Administratif extends Personnel{
	private String fonction;
	
	public Administratif() {
		super();
		this.fonction = "no-fonction";
	}
	
	public Administratif(String nom, String prenom, int age, String service, String fonction) {
		super(nom, prenom, age, service);
		this.fonction = fonction;
	}

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	
}
