package fr.iutvalence.info.dut.m2107;
import java.util.Scanner;

public class Application {
	
	static Calendrier calendrier;
	
	public static final int beginYear=2016;
	public static final int endYear=2023;

	public static void main(String[] args){
		
		calendrier = new Calendrier(beginYear,endYear+1);
		
		System.out.printf("\n What do you want to do ? ");
		System.out.printf("[showCalendar] [changeEvent] ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		switch (str){
		case "showCalendar":
			calendrier.showCalendar();
		case "changeEvent":
			System.out.printf("[addEvent] [changeEvent] [deleteEvent] ");
			str = sc.nextLine();
			switch (str){
			case "addEvent":
				System.out.printf("Which Year ? Exemple: 2016 ");
				String yearString = sc.nextLine();
				int year = Integer.parseInt(yearString);

				System.out.printf("Which Month ? Exemple: 11 ");
				String monthString = sc.nextLine();
				int month = Integer.parseInt(monthString);

				System.out.printf("Which Day ? Exemple: 2 ");
				String dayString = sc.nextLine();
				int day = Integer.parseInt(dayString);

				System.out.printf("Please enter a name. ");
				String name = sc.nextLine();
				System.out.printf("Please enter a place. ");
				String place = sc.nextLine();
				Evenement event = new Evenement(name,place);

				Date date = calendrier.getYear(year).getMonths(month).getDay(day); 
				date.addEvent(event);
				break;
			case "changeEvent":
				break;
			case "deleteEvent":
				break;
			}
		}

		calendrier.showCalendar();
		sc.close();

	}
}
