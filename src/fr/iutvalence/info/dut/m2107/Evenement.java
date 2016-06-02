package fr.iutvalence.info.dut.m2107;

public class Evenement {

	String name;
	String place;

	public Evenement(String name, String place) {
		this.name=name;
		this.place=place;
	}
	
	public String showEvent(){
		return ("\n name: %d"+this.name + "Place: "+this.place);
		
	}

}