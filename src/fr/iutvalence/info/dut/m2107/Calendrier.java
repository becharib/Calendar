package fr.iutvalence.info.dut.m2107;
import java.util.Scanner;

public class Calendrier {

	private Date dateDebutDefaut = new Date(1,1,2000);
	private Date dateFinDefaut = new Date(31,12,2027);
	private Date dateDebut;
	private Date dateFin;
	/*private Month January = new Month("January");
	private Month Febuary = new Month("February");
	private Month January = new Month("January");
	private Month January = new Month("January");
	private Month January = new Month("January");
	private Month January = new Month("January");
	private Month January = new Month("January");
	private Month January = new Month("January");
	private Month January = new Month("January");
	private Month January = new Month("January");
	private Month January = new Month("January");
	private Month January = new Month("January");*/
	public Calendrier() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Donnez l'année demandée");
		int year= scanner.nextInt();
	}

	

	/**
	 * 
	 * @param dateDebut
	 * @param dateFin
	 */
	public Calendrier(Date dateDebut, Date dateFin) {
		// TODO - implement Calendrier.Calendrier
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param dateDuJour
	 */
	public void miseAJourCalendrier(Date dateDuJour) {
		// TODO - implement Calendrier.miseAJourCalendrier
		throw new UnsupportedOperationException();
	}

	public void afficherCalendrier() {
		// TODO - implement Calendrier.afficherCalendrier
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param evenement
	 */
	public void entrerEvenement(Evenement evenement) {
		// TODO - implement Calendrier.entrerEvenement
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param date
	 */
	public Evenement consulterEvenement(Date date) {
		// TODO - implement Calendrier.consulterEvenement
		//à compléter
		throw new UnsupportedOperationException();
	}

	public void supprimerEvenement() {
		// TODO - implement Calendrier.supprimerEvenement
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param evenement
	 */
	public void modifierEvenement(Evenement evenement) {
		// TODO - implement Calendrier.modifierEvenement
		throw new UnsupportedOperationException();
	}


}