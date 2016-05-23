package fr.iutvalence.info.dut.m2107;

public class Month {
	private int day;
	private static String name;
	private int year;
	private int num;
	private Date[] month;
	
	public Month(String ActualMonth, int num, int annee){
		int k = 1;
		this.name=ActualMonth;
		this.year=annee;
		
		switch (ActualMonth)
		{
		  case "January":
			  this.day=31;
			  this.month = new Date[this.day];
			  this.num=1;
		    break;
		  case "February":
			  this.day=29;
			  this.month = new Date[this.day];
			  this.num=2;
		    break;
		  case "March":
			  this.day=31;
			  this.month = new Date[this.day];
			  this.num=3;
		    break;
		  case "April":
			  this.day=30;
			  this.month = new Date[this.day];
			  this.num=4;
			  break;
		  case "May":
			  this.day=31;
			  this.month = new Date[this.day];
			  this.num=5;
		    break;
		  case "June":
			  this.day=30;
			  this.month = new Date[this.day];
			  this.num=6;
			  break;
		  case "July":
			  this.day=31;
			  this.month = new Date[this.day];
			  this.num=7;
		    break;
		  case "August":
			  this.day=31;
			  this.month = new Date[this.day];
			  this.num=8;
		    break;
		    
		  case "September":
			  this.day=30;
			  this.month = new Date[this.day];
			  this.num=9;
		    break;
		  case "October":
			  this.day=31;
			  this.month = new Date[this.day];
			  this.num=10;
		    break;
		  case "November":
			  this.day=30;
			  this.month = new Date[this.day];
			  this.num=11;
		    break;
		  case "December":
			  this.day=31;
			  this.month = new Date[this.day];
			  this.num=12;
		    break;
		}
		
		
		for(int i=1;i<this.day;i++){
			month[i]= new Date(i,this.num,this.year);
			System.out.println(month[i]);
		}
		
		
	}
		

	 
	/*January,                 	
	February,
	March,                 
	April,
    May,
	June,
	July,
    August,       
	September,
	October,
	November,
	December;
*/

}
