package fr.iutvalence.info.dut.m2107;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Application {
	
	public static void main(String[] args){

		Scanner sc1 = new Scanner(System.in);
		
		System.out.printf("Year ? Exemple : 2016 \n");
		String yearString = sc1.nextLine();
		int year = Integer.parseInt(yearString); 
		
		System.out.printf("Month ? Exemple : July \n");

		Scanner sc2 = new Scanner(System.in);
		String month = sc2.nextLine();
		
		System.out.printf("[%s,%d]\n", month, year);
		new Month(month, year);
	}

}