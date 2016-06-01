package fr.iutvalence.info.dut.m2107;

public class Evenement {

	String place;
	int hour;

	public Evenement(String place, int hour) {
		this.place=place;
		this.hour=hour;
	}
	
	public static void showEvent(Evenement event){
		System.out.printf("\nPlace: "+event.place+"Hour: %d"+event.hour);
		
	}

}