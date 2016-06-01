package fr.iutvalence.info.dut.m2107;

import fr.iutvalence.info.dut.m2107.Month;

public class Year {
	public static final int LENGTH=12;
	private int num;
	private Month[] year = new Month[LENGTH];
	
	
	public Year(int numero){
		this.num=numero;
		for(int k=1,i=0;k < LENGTH+1;k++,i++){
			year[i] = new Month(k,this.num);	
		}
	}
	public Month[] getYear() {
		return year;
	}
	
	public void showYear(){
		System.out.println("Year: "+num);
		for(int i=0; i<LENGTH; i++){
			Month.showMonth(year[i]);
		}
	}

}
