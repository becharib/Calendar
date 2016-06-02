package fr.iutvalence.info.dut.m2107;

/**
 * Class to defin the event of a day with a name and a place
 * @author William
 *
 */
public class Evenement {

	String name;
	String place;
	/**
	 * 
	 * Constructor to set an event with a name and a place
	 */
	public Evenement(String name, String place) {
		this.name=name;
		this.place=place;
	}

	/**
	 * 
	 * get the description of the current event
	 */
	public String showEvent(){
		return ("[Event: "+this.name + " Place: "+this.place+"]");

	}

}