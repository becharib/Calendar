package fr.iutvalence.info.dut.m2107;
import java.util.Scanner;

import fr.iutvalence.info.dut.m2107.swing.MainFrame;

public class Application {
	public static final int beginYear=2016;
	public static final int endYear=2023;
	
	public static void main(String[] args){
		
		
		Calendrier Calendar1 = new Calendrier(beginYear,endYear);
		Calendar1.showCalendar();
		new MainFrame();

	}
}
