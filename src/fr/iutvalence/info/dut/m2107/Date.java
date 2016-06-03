package fr.iutvalence.info.dut.m2107;

/**
 * 
 * Date is a class to defin the day.
 * The current day has a day number, it have a month number and a year number, and finally an event which is null at beginning.
 * the current date can also be a publicHoliday, we know that thanks to the boolean publicHolidayBool
 * 
 *
 */
public class Date{

	private int d;
	/**day number
	 * 
	 */
	private int m;
	/**
	 * Month number
	 */
	private int y;
	/**
	 * Year number
	 */
	private String publicHoliday;
	/**
	 * the name of the publicHoliday of the current Date
	 */
	private boolean publicHolidayBool;
	/**
	 * is true when current date is a publicHoliday and false when it's not
	 */
	private Evenement event;
	/**
	 * event of the date
	 */


	/**
	 * 
	 * Constructor to inizialize the current date whith d,m,y ; set the publicHoliday corresponding
	 * and set the event of the date to null
	 */
	public Date(int d, int m, int y) {
		this.d = d;
		this.m = m;
		this.y = y;
		this.publicHoliday = PublicHoliday.getPublicHoliday(d,m);
		if (this.publicHoliday==null)
			this.publicHolidayBool=false;
		else 
			this.publicHolidayBool=true;
		this.event = null;
	}	
	
/**
 * 
 * get the day number of the day
 */
	public int getDay() {
		return this.d;
	}
	/**
	 * 
	 * get the month number of the day
	 */
	public int getMonth(){
		return this.m;
	}

	/**
	 * 
	 * get the year number of the day
	 */
	public int getYear() {
		return this.y;
	}
	/**
	 * 
	 * get the name of the PublicHoliday of the day
	 */
	public String getPublicHoliday() {
		return this.publicHoliday;
	}
	/**
	 * 
	 * return true if the day is a PublicHoliday, else return false
	 */
	public boolean isPublicHoliday() {
		return this.isPublicHolidayBool();
	}

	public Evenement getEvent(){
		return this.event;
	}
	/**
	 * add or change the event of the day
	 */

	public void addEvent(Evenement event){
		this.event=event;
	}
	/**
	 * delete the event of the day
	 */
	public void deleteEvent(Date date) {
		date.event = null;
	}
	/**
	 * 
	 * get publicHolidayBool
	 */
	public boolean isPublicHolidayBool() {
		return this.publicHolidayBool;
	}
	/**
	 * get the boolean to know if the current day is a PublicHoliday or not
	 */

}