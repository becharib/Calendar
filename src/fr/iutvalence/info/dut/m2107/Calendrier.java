package fr.iutvalence.info.dut.m2107;

import java.util.Scanner;

public class Calendrier {

	private Date dateDebutDefaut = new Date(1,1,2000);
	private Date dateFinDefaut = new Date(31,12,2027);
	private Date dateDebut;
	private Date dateFin;
	private static final YEAR_DEFAULT=2000;

	
	public CreateYear(int year){
		private Month January = new Month("January",year);
		private Month Febuary = new Month("February",year;
		private Month March = new Month("March",year);
		private Month April = new Month("April",year);
		private Month May = new Month("May",year);
		private Month June = new Month("June",year);
		private Month July = new Month("July",year);
		private Month August = new Month("August",year);
		private Month September = new Month("September",year);
		private Month October = new Month("October",year);
		private Month November = new Month("November",year);
		private Month December = new Month("December",year);
		
	}
	public Calendrier() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Donnez l'annee souhaitee");
		int year= scanner.nextInt();
		CreateYear(year);
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
		//� compl�ter
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