package fr.iutvalence.info.dut.m2107;

import fr.iutvalence.info.dut.m2107.Month;

public class Year {
	public static final int LENGTH=12;
	private int num;
	private Month[] year = new Month[LENGTH];
	
	
	public Year(int numero){
		this.num=numero;
		int i=0;
		int k=1;
		for(k=1;k < LENGTH+1;k++){
			
			year[i] = new Month(k,this.num);
			System.out.println(year[i]);
			i++;
		
		}
	}
	public Month[] getYear() {
		return year;
	}

}
