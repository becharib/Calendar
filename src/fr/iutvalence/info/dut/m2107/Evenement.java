package fr.iutvalence.info.dut.m2107;

/**
 * Class to define the event of a day with a name and a place
 * 
 *
 */
public class Evenement {

	/** Name of the Event **/
	String name;
	/** Place of the Event **/
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
		return ("[Event: "+this.name + "Place: " + this.place+ "]");

	}

}