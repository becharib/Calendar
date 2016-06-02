package fr.iutvalence.info.dut.m2107;
import java.util.*;

public class Calendrier {

	private static List<Year> yearList = new ArrayList<Year>();



	/**
	 * 
	 * @param dateDebut
	 * @param dateFin
	 */
	public Calendrier(int beginYear, int endYear) {
		for(int i=beginYear;i<endYear;i++){
			yearList.add(new Year(i));
		}
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
	
	public Year getYear(int year){
		for(int i = 0; i<this.yearList.size(); i++){
			if(this.yearList.get(i).getNum()==year)
				return this.yearList.get(i);
		}
		return null;
	}


	/**
	 * 
	 * @param dateDuJour
	 */
	public void miseAJourCalendrier(Date dateDuJour) {
		// TODO - implement Calendrier.miseAJourCalendrier
		throw new UnsupportedOperationException();
	}

	public void showCalendar() {
		for(Year year : yearList){
			year.showYear();
		}
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
