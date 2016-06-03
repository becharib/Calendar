package fr.iutvalence.info.dut.m2107;
import java.util.*;
/**
 * Class which have an ArrayList of Years(yearList)
 *
 */
public class Calendrier {

	private List<Year> yearList = new ArrayList<Year>();
	
	/**
	 * 
	 * Constructor to create the calendar between "beginYear" and "endYear" by set the ArrayList yearList
	 */
	public Calendrier(int beginYear, int endYear) {
		for(int i=beginYear;i<endYear;i++){
			getYearList().add(new Year(i));
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
				System.out.println("Please enter the month again ");
			}


		}
		return(numMonth);

	}

	public Year getYear(int year){
		for(int i = 0; i<this.getYearList().size(); i++){
			if(this.getYearList().get(i).getNum()==year)
				return this.getYearList().get(i);
		}
		return null;
	}


	public void showCalendar() {
		for(Year year : getYearList()){
			year.showYear();
		}
	}


	public List<Year> getYearList() {
		return this.yearList;
	}

}
