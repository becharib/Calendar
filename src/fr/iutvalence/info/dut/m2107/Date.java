package fr.iutvalence.info.dut.m2107;

import java.util.GregorianCalendar;

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
		// TODO - implement Date.Date
		this.j = j0;
		this.m = m0;
		this.a = a0;
		this.publicHoliday = PublicHoliday(j0, m0);
	}
	

	public int obtenirJ() {
		// TODO - implement Date.obtenirJ
		return this.j;
	}

	public int obtenirM() {
		// TODO - implement Date.obtenirM
		return this.m;
	}

	public int obtenirA() {
		// TODO - implement Date.obtenirA
		return this.a;
	}
	public int getPublicHoliday() {
		// TODO - implement Date.obtenirA
		return this.PublicHoliday;
	}
	
	

	public String obtenirLaRepresentationTexte() {
		// TODO - implement Date.obtenirLaRepresentationTexte
		// � compl�ter
		return (this.j + "/" + this.m + "/" + this.a);
	}
}