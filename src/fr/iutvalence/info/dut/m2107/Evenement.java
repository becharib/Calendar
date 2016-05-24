package fr.iutvalence.info.dut.m2107;

public class Evenement {

	private String nom;
	private String lieu;
	private Date date;
	private int heure;

	/**
	 * 
	 * @param lieu
	 * @param date
	 * @param heure
	 * @param nom
	 */
	public Evenement() {
		this.nom="";
		this.lieu="";
		this.heure=0;
		// TODO - implement Evenement.Evenement
		throw new UnsupportedOperationException();
	}
	public Evenement(String lieu0, Date date0, int heure0, String nom0) {
		// TODO - implement Evenement.Evenement
		// � compl�ter
		this.lieu=lieu0;
		this.date=date0;
		this.heure=heure0;
		this.nom=nom0;
		throw new UnsupportedOperationException();
	}

	public String obtenirNom() {
		// TODO - implement Evenement.obtenirNom
		return(this.nom);
	
	}

	public String obtenirLieu() {
		// TODO - implement Evenement.obtenirLieu
		return(this.lieu);

	}

	public Date obtenirDate() {
		// TODO - implement Evenement.obtenirDate
		return(this.date);

	}

	public int obtenirHeure() {
		// TODO - implement Evenement.obtenirHeure
		return(this.heure);

	}

	public String obtenirLaRepresentationTexte() {
		// TODO - implement Evenement.obtenirLaRepresentationTexte
		System.out.println("L'�v�nement"+this.nom + "aura lieu �" +this.lieu + " ,le" + this.date + " ,�" + this.heure);
		throw new UnsupportedOperationException();
	}
}