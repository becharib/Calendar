package fr.iutvalence.info.dut.m2107;

public class Evenement {

	String place;
	String name;

	public Evenement(String place, String name) {
		this.place=place;
		this.name=name;
	}
	
	public static void showEvent(Evenement event){
		System.out.printf("\nPlace: "+event.place+"name: %d"+event.name);
		
	}

}