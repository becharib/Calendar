package fr.iutvalence.info.dut.m2107;


public class Date{

	private int d;
	private int m;
	private int y;
	private String publicHoliday;
	private boolean publicHolidayBool;
	private Evenement event;
	

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
		if (this.publicHoliday==null)
			this.publicHolidayBool=false;
		else 
			this.publicHolidayBool=true;
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
		return this.isPublicHolidayBool();
	}
	
	public Evenement getEvent(){
		return this.event;
	}
	
	public void addEvent(Evenement event){
		this.event=event;
	}

	public void deleteEvent(Date date) {
		date.event = null;
	}

	public boolean isPublicHolidayBool() {
		return this.publicHolidayBool;
	}

}