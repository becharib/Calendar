package fr.iutvalence.info.dut.m2107;

import fr.iutvalence.info.dut.m2107.Month;
/**
 * Class to define a Year as a table of 12 Month(year) and a number(num)
 *
 */
public class Year {
	public static final int LENGTH=12;
	private int num;
	private Month[] year = new Month[LENGTH];

/**
 * 
 * Constructor to set the number of the year and the table of months
 */
	public Year(int numero){
		this.num=numero;
		for(int k=1,i=0;k < LENGTH+1;k++,i++){
			year[i] = new Month(k,this.num);	
		}
	}
	/**
	 * 
	 * get a month
	 */
	public Month getMonths(int m) {
		return this.year[m-1];
	}
	/**
	 * 
	 * get the number of the year
	 */
	public int getNum(){
		return this.num;
	}
	
	/**
	 * 
	 * get the table of Months
	 */
	public Month[] getMonthTab(){
		return this.year;
	}
/**
 * Print the number of the current year and each month
 */
	public void showYear(){
		System.out.println("Year: "+this.num);
		for(int i=0; i<LENGTH; i++){
			year[i].showMonth();
		}
	}

}
