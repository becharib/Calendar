package fr.iutvalence.info.dut.m2107;


public class Date{

	public int dDefault = 1;
	public int mDefault = 1;
	public int yDefault = 2000;
	private int d;
	private int m;
	private int y;
	private PublicHoliday publicHoliday;
	static boolean isPublicHoliday;
	private Evenement event;

	/*public boolean PublicHoliday(int j, int m){
		if((j==1) && (m==1))
			return(true);
		if((j==28) && (m==3))
			return(true);
		if((j==1) && (m==5))
			return(true);
		if((j==5) && (m==5))
			return(true);
		if((j==8) && (m==5))
			return(true);
		if((j==16) && (m==5))
			return(true);
		if((j==14) && (m==7))
			return(true);
		if((j==1) && (m==11))
			return(true);
		if((j==25) && (m==12))
			return(true);
		
		return(false);
		
	}*/
	
	public Date() {
		this.d=dDefault;
		this.m=mDefault;
		this.y=yDefault;
		this.publicHoliday = PublicHoliday.newYear;
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
		for (PublicHoliday pH : PublicHoliday.values()){
			if ((pH.getDay()==d)&&(pH.getMonth()==m)){
				this.publicHoliday = pH;
				this.isPublicHoliday = true;
			}
		}
		if (this.publicHoliday == null)
			this.isPublicHoliday = false;
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
	public String getpublicHoliday() {
		return this.publicHoliday.getName();
	}
	
	public boolean isPublicHoliday() {
		return this.isPublicHoliday;
	}
	
	public static Evenement getEvent(Date date){
		return date.event;
	}
	
	public static void addEvent(Date date, Evenement event){
		date.event=event;
	}
	

	/**
	 * 
	 * @param date
	 */
	public Evenement consulterEvenement(Date date) {
		return(this.event);
	}
	
	

	public void supprimerEvenement(Date date) {
		this.event.place="";
		this.event.name="";
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param evenement
	 */
	public void modifierEvenement(Evenement evenement) {
		this.event.place=evenement.place;
		this.event.name=evenement.name;
		throw new UnsupportedOperationException();
	}


	public String toString() {
		if (this.isPublicHoliday())
			return (this.d + "/" + this.m + "/" + this.y + "/" + this.getpublicHoliday());
		else 
			return (this.d + "/" + this.m + "/" + this.y + "/");
	}
}