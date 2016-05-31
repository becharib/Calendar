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
	
	
	public static int ConvertMonth(String month){
		int numMonth=0;
		while(numMonth==0){

			switch (month)
			{
			  case "January":
				  numMonth=1;
			    break;
			  case "February":
				  numMonth=2;
			    break;
			  case "March":
				  numMonth=3;
			    break;
			  case "April":
				  numMonth=4;
			    break;
			  case "May":
				  numMonth=5;
			    break;
			  case "June":
				  numMonth=6;
			    break;
			  case "July":
				  numMonth=7;
			    break;
			  case "August":
				  numMonth=8;
			    break;
			  case "September":
				  numMonth=9;
			    break;
			  case "October":
				  numMonth=10;
			    break;
			  case "November":
				  numMonth=11;
			    break;
			  case "December":
				  numMonth=12;
			    break;
			  default:
				  System.out.println("Please enter the month again");
			}
			
			
		}
		return(numMonth);
		
	}

	public static void createMonth(){
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		int numMonth=0;
		String month="";
		
		System.out.printf("Year ? Exemple : 2016 \n");
		String yearString = sc1.nextLine();
		int year = Integer.parseInt(yearString); 
		sc1.close();
		System.out.printf("Month ? Exemple : July \n");	
		month = sc2.nextLine();
		numMonth=ConvertMonth(month);
	
		sc2.close();
		System.out.printf("[%s,%d]\n", month, year);
		Month.showMonth(new Month(numMonth, year));
	
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
	/*public void entrerEvenement(Evenement evenement, Date date) {
		// TODO - implement Calendrier.entrerEvenement
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param date
	 */
	/*public Evenement consulterEvenement(Date date) {
		// TODO - implement Calendrier.consulterEvenement
		throw new UnsupportedOperationException();
	}

	public void supprimerEvenement(Date date) {
		// TODO - implement Calendrier.supprimerEvenement
		yearList.get(year[month[day].event.place])=null;
		throw new UnsupportedOperationException();
	}*/

	/**
	 * 
	 * @param evenement
	 */
	/*public void modifierEvenement(Evenement evenement) {
		// TODO - implement Calendrier.modifierEvenement
		throw new UnsupportedOperationException();
	}*/
		

}