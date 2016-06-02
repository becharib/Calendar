package fr.iutvalence.info.dut.m2107;
import java.util.Scanner; 

import fr.iutvalence.info.dut.m2107.swing.MainFrame;

public class Application {
	public static final int beginYear=2016;
	public static final int endYear=2023;
	
	public static void main(String[] args){
		
		
		Calendrier calendar1 = new Calendrier(beginYear,endYear);
		Evenement event = new Evenement("Anniv","Valence");
		Year y = calendar1.getYear(2018);
		Month m = y.getMonths()[3];
		Date d = Month.getDay(m, 3);
		//Date d = new Date(2,2,2017);
		Date date1 = new Date(1,1,2020);
		date1.addEvent(event);
		
		/*System.out.printf("\nWhat do you want to do ?");
		System.out.printf("[showCalendar] [changeEvent]");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		switch (str){
		case "showCalendar":
			calendar1.showCalendar();
		case "changeEvent":
			System.out.printf("[addEvent] [changeEvent] [deleteEvent]");
			str = sc.nextLine();
			switch (str){
			case "addEvent":
				System.out.printf("Wich Year ? Exemple: 2016");
				String yearString = sc.nextLine();
				int year = Integer.parseInt(yearString);
				
				System.out.printf("Wich Month ? Exemple: January");
				String monthString = sc.nextLine();
				int month = Integer.parseInt(monthString);
				
				System.out.printf("Wich Day ?");
				String dayString = sc.nextLine();
				int day = Integer.parseInt(dayString);
				
				System.out.printf("Please enter a name.");
				String name = sc.nextLine();
				System.out.printf("Please enter a place.");
				String place = sc.nextLine();
				Evenement event = new Evenement(name,place);
				
				Year y = calendar1.getYear(year);
				Month m = y.getMonths()[month];
				Date d = m.getDate()[day]; 
				
				d.addEvent(event);
			}
		}*/
		
		calendar1.showCalendar();
		new MainFrame();


	}
}
