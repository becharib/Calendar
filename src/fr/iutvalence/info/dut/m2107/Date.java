package fr.iutvalence.info.dut.m2107;


public class Date{

	public int jDefaut = 1;
	public int mDefaut = 1;
	public int aDefaut = 2000;
	private int j;
	private int m;
	private int a;
	private boolean publicHoliday=false;
	private Evenement event;

	public boolean PublicHoliday(int j, int m){
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
		
	}
	
	public Date() {
		this.j=jDefaut;
		this.m=mDefaut;
		this.a=aDefaut;
		this.publicHoliday = PublicHoliday(jDefaut, mDefaut);
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param j
	 * @param m
	 * @param a
	 */
	public Date(int j0, int m0, int a0) {
		this.j = j0;
		this.m = m0;
		this.a = a0;
		this.publicHoliday = PublicHoliday(j0, m0);
	}
	

	public int obtenirJ() {
		return this.j;
	}

	public int obtenirM() {
		return this.m;
	}

	public int obtenirA() {
		return this.a;
	}
	public boolean getpublicHoliday() {
		return this.publicHoliday;
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
		// TODO - implement Calendrier.consulterEvenement
		return(this.event);
	}
	

	public void supprimerEvenement(Date date) {
		// TODO - implement Calendrier.supprimerEvenement
		this.event.place="";
		this.event.hour=0;
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


	public String getDate(Date date) {
		// TODO - implement Date.obtenirLaRepresentationTexte
		if(this.publicHoliday){
			return (this.j + "/" + this.m + "/" + this.a + " , Jour férié");
		}
		else{
			return (this.j + "/" + this.m + "/" + this.a + " , Jour non férié");
		}
	}
}