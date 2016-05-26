package fr.iutvalence.info.dut.m2107;

import fr.iutvalence.info.dut.m2107.Month;

public class Year {
	public static final int LENGTH=12;
	private int num;
	private Month[] year = new Month[LENGTH];
	
	
	public Year(int numero){
		this.num=numero;
		int i=0;
		for(int k=1;i < LENGTH;k++){
			year[i] = new Month(k,this.num);
		
		}
	}
	public Month[] getYear() {
		return year;
	}

}
