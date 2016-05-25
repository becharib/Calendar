package fr.iutvalence.info.dut.m2107;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Application {
	
	public static void main(String[] args){

		Scanner sc1 = new Scanner(System.in);
		System.out.printf("What do you want to do?\n");
		System.out.printf("[showMonth] [addEvent]\n");
		
		String answer = sc1.nextLine();
		
		switch (answer)
		{
		  case "showMonth":
			  Calendrier.showMonth();
		    break;
		    
		  case "addEvent":
			  System.out.printf("Entrez un lieu.\n");
			  String lieu = sc1.nextLine();
			  System.out.printf("Entrez une date.\n");
			  String date = sc1.nextLine();
			  Evenement event=new Evenement(lieu,date);
			  //Evenement.showEvent(event);
			  //System.out.println(event);
		    break;
		}

	}
}