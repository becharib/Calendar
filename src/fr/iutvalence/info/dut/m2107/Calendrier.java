package fr.iutvalence.info.dut.m2107;
/*import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Scanner;*/
import java.util.*;

public class Calendrier {

	private List<Year> yearList = new ArrayList<Year>();
	
	private Date dateDebutDefaut = new Date(1,1,2000);
	private Date dateFinDefaut = new Date(31,12,2027);
	private int beginYear;
	private int EndYear;
	private static final int YEAR_DEFAULT=2000;


	
	public Calendrier() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Donnez l'annee souhaitee");
		int year= scanner.nextInt();
		yearList.add(new Year(year));
	}

	
	/**
	 * 
	 * @param dateDebut
	 * @param dateFin
	 */
	public Calendrier(int beginYear, int endYear) {
		for(int i=beginYear;i<endYear;i++){
			yearList.add(new Year(i));
		}
		//yearList.get(0).getMonth().get
		throw new UnsupportedOperationException();
	}

	public static void createMonth(){
		Scanner sc1 = new Scanner(System.in);
		
		System.out.printf("Year ? Exemple : 2016 \n");
		String yearString = sc1.nextLine();
		int year = Integer.parseInt(yearString); 
		
		System.out.printf("Month ? Exemple : July \n");

		Scanner sc2 = new Scanner(System.in);
		String month = sc2.nextLine();
		
		System.out.printf("[%s,%d]\n", month, year);
		Month.showMonth(new Month(month, year));
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
	public void entrerEvenement(Evenement evenement, Date date) {
		// TODO - implement Calendrier.entrerEvenement
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param date
	 */
	public Evenement consulterEvenement(Date date) {
		// TODO - implement Calendrier.consulterEvenement
		throw new UnsupportedOperationException();
	}

	public void supprimerEvenement(Date date) {
		// TODO - implement Calendrier.supprimerEvenement
		yearList.get(year[month[day].event.place])=null;
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