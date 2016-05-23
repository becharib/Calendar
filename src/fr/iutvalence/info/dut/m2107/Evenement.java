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
		// à compléter
		this.lieu=lieu0;
		this.date=date0;
		this.heure=heure0;
		this.nom=nom0;
		throw new UnsupportedOperationException();
	}

	public String obtenirNom() {
		// TODO - implement Evenement.obtenirNom
		return(this.nom);
		throw new UnsupportedOperationException();
	}

	public String obtenirLieu() {
		// TODO - implement Evenement.obtenirLieu
		return(this.lieu);
		throw new UnsupportedOperationException();
	}

	public Date obtenirDate() {
		// TODO - implement Evenement.obtenirDate
		retrun(this.date);
		throw new UnsupportedOperationException();
	}

	public int obtenirHeure() {
		// TODO - implement Evenement.obtenirHeure
		return(this.heure);
		throw new UnsupportedOperationException();
	}

	public String obtenirLaRepresentationTexte() {
		// TODO - implement Evenement.obtenirLaRepresentationTexte
		systeme.out.println("L'évènement"+this.nom + "aura lieu à" this.lieu + " ,le" + this.date + " ,à" + this.heure);
		throw new UnsupportedOperationException();
	}
}