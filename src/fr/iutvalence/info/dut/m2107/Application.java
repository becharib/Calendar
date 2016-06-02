package fr.iutvalence.info.dut.m2107;
import java.util.Scanner;

public class Application {
	public static final int beginYear=2016;
	public static final int endYear=2023;

	public static void main(String[] args){
		
		Calendrier calendar1 = new Calendrier(beginYear,endYear);

		System.out.printf("\nWhat do you want to do ?");
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

				System.out.printf("Wich Month ? Exemple: 11");
				String monthString = sc.nextLine();
				int month = Integer.parseInt(monthString);

				System.out.printf("Wich Day ? Exemple: 2");
				String dayString = sc.nextLine();
				int day = Integer.parseInt(dayString);

				System.out.printf("Please enter a name.");
				String name = sc.nextLine();
				System.out.printf("Please enter a place.");
				String place = sc.nextLine();
				Evenement event = new Evenement(name,place);

				Date date = calendar1.getYear(year).getMonths(month).getDay(day); 
				date.addEvent(event);
				break;
			case "changeEvent":
				break;
			case "deleteEvent":
				break;
			}
		}

		calendar1.showCalendar();
		sc.close();

	}
}
