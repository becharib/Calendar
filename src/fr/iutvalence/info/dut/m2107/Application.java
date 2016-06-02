package fr.iutvalence.info.dut.m2107;
import java.util.Scanner;

import fr.iutvalence.info.dut.m2107.swing.MainFrame;

public class Application {
	
	static int endYear;
	
	public static void main(String[] args){
		
		Scanner sc1 = new Scanner(System.in);
		System.out.printf("Please enter a end Year\n");
		endYear=sc1.nextInt();
		Calendrier Calendar1 = new Calendrier(2016,endYear);
		Calendar1.showCalendar();
		new MainFrame();
		sc1.close();
		
		/*System.out.printf("What do you want to do?\n");
		System.out.printf("[showMonth] [addEvent]\n");
		
		String answer = sc1.nextLine();
		
		switch (answer)
		{
		  case "showMonth":
			  Calendrier.createMonth();
		    break;
		    
		  case "addEvent":
			  System.out.printf("Choose a place:\n");
			  String lieu = sc1.nextLine();
			  System.out.printf("Choose an hour:\n");
			  String hourString = sc1.nextLine();
			  int hour =  Integer.parseInt(hourString);
			  System.out.printf("Choose a day: Example: 10\n");
			  String dayString = sc1.nextLine();
			  int day =  Integer.parseInt(dayString);
			  System.out.printf("Choose a month: Example: July\n");
			  String monthString = sc1.nextLine(); 
			  System.out.printf("Choose a year: Example: 2016\n");
			  String yearString = sc1.nextLine();
			  int year =  Integer.parseInt(yearString);
			  Month month = new Month(monthString,year);
			  Date date = new Date(day, Month.getNum(month), year);
			  Evenement event=new Evenement(lieu,hour);
			  
			  Date.addEvent(date,event);
			  
			  Evenement.showEvent(Date.getEvent(date));
			  
			  //Evenement.showEvent(event);
			  //System.out.println(event);
		    break;
		}*/

	}
}
