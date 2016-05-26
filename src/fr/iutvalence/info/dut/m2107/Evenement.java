package fr.iutvalence.info.dut.m2107;
import java.util.Date;

public class Evenement {

	String place;
	int hour;

	public Evenement(String place, int hour) {
		this.place=place;
		this.hour=hour;
	}
	
	public static void showEvent(Evenement event){
		System.out.printf("Place: %s",event.place);
		System.out.printf(" ");
		System.out.printf("Place: %d",event.hour);
		
	}

}