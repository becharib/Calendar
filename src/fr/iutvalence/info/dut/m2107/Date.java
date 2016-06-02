package fr.iutvalence.info.dut.m2107;


public class Date{

	public int dDefault = 1;
	public int mDefault = 1;
	public int yDefault = 2000;
	private int d;
	private int m;
	private int y;
	private String publicHoliday;
	private static boolean publicHolidayBool;
	private Evenement event;
	
	public Date() {
		this.d=dDefault;
		this.m=mDefault;
		this.y=yDefault;
		this.publicHoliday = PublicHoliday.getPublicHoliday(1,1);
		this.event = null;
	}

	/**
	 * 
	 * @param d
	 * @param m
	 * @param y
	 */
	public Date(int d, int m, int y) {
		this.d = d;
		this.m = m;
		this.y = y;
		this.publicHoliday = PublicHoliday.getPublicHoliday(d,m);
		if (this.publicHoliday!=null)
			Date.publicHolidayBool=true;
		else 
			Date.publicHolidayBool=false;
		this.event = null;
	}	
	
	public int getDay() {
		return this.d;
	}

	public int getMonth(){
		return this.m;
	}

	public int getYear() {
		return this.y;
	}
	public String getPublicHoliday() {
		return this.publicHoliday;
	}
	
	public boolean isPublicHoliday() {
		return Date.isPublicHolidayBool();
	}
	
	public Evenement getEvent(){
		return this.event;
	}
	
	public void addEvent(Evenement event){
		this.event=event;
	}

	/**
	 * 
	 * @param date
	 */
	public Evenement showEvent(Date date) {
		return(date.event);
	}
	
	

	public void deleteEvent(Date date) {
		date.event = null;
	}

	/**
	 * 
	 * @param evenement
	 */
	/*public void changeEvent(Evenement evenement) {
		this.event.place=evenement.place;
		this.event.name=evenement.name;
		throw new UnsupportedOperationException();
	}*/

	public static boolean isPublicHolidayBool() {
		return publicHolidayBool;
	}

	public static void setPublicHolidayBool(boolean publicHolidayBool) {
		Date.publicHolidayBool = publicHolidayBool;
	}

}