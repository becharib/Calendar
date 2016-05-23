public class Date {

	public int jDefaut = 1;
	public int mDefaut = 1;
	public int aDefaut = 2000;
	private int j;
	private int m;
	private int a;

	public Date() {
		// TODO - implement Date.Date
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param j
	 * @param m
	 * @param a
	 */
	public Date(int j, int m, int a) {
		// TODO - implement Date.Date
		throw new UnsupportedOperationException();
		this.j = j;
		this.m = m;
		this.a = a;
	}

	public int obtenirJ() {
		// TODO - implement Date.obtenirJ
		throw new UnsupportedOperationException();
		return this.j;
	}

	public int obtenirM() {
		// TODO - implement Date.obtenirM
		throw new UnsupportedOperationException();
		return this.m;
	}

	public int obtenirA() {
		// TODO - implement Date.obtenirA
		throw new UnsupportedOperationException();
		return this.a;
	}

	public String obtenirLaRepresentationTexte() {
		// TODO - implement Date.obtenirLaRepresentationTexte
		throw new UnsupportedOperationException();
		systeme.out.println(this.j + "/" + this.m + "/" + this.a);
	}

}