package fr.iutvalence.info.dut.m2107;

public class Evenement {

	String place;
	String date;

	public Evenement(String place, String date) {
		this.place=place;
		this.date=date;
		this.showEvent();
	}
	
	public void showEvent(){
		System.out.printf("Place: %s",this.place);
		System.out.printf(" ");
		System.out.printf("Date: %s",this.date);
	}

}