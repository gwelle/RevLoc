/**
 * 
 */
package fr.adavis.revLoc;

/**
 * @author eleve
 *
 */
public class Garagiste {
	
	private String nom ;
	private String adresse ;
	
	


	/**
	 * @param nom
	 * @param adresse
	 */
	public Garagiste(String nom, String adresse) {
		this.nom = nom;
		this.adresse = adresse;
	}

	



	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}


	



	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}





	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}





	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}





	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

	}

}
