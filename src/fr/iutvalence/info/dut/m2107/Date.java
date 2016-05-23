package fr.iutvalence.info.dut.m2107;

public class Date {

	public int jDefaut = 1;
	public int mDefaut = 1;
	public int aDefaut = 2000;
	private int j;
	private int m;
	private int a;
	private Evenement event;

	public Date() {
		// TODO - implement Date.Date
		this.j=jDefaut;
		this.m=mDefaut;
		this.a=aDefaut;
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

	public String obtenirLaRepresentationTexte() {
		// TODO - implement Date.obtenirLaRepresentationTexte
		// � compl�ter
		return (this.j + "/" + this.m + "/" + this.a);
	}
}