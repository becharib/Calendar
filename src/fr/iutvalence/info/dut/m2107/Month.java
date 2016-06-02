package fr.iutvalence.info.dut.m2107;

public class Month {
	private int day;
	private String name;
	private int year;
	private int num;
	private Date[] month;
	
	public Month(int num, int year){
		this.year=year;
		
		switch (num)
		{
		  case 1:
			  this.day=31;
			  this.month = new Date[this.day+1];
			  this.name="January";
		    break;
		  case 2:
			  if(((year%4 == 0)&&(year%100 != 0))||(year%400 ==0)){
				  this.day=29;  
			  }
			  else{
				  this.day=28;
			  }
			 
			  this.month = new Date[this.day+1];
			  this.name="February";
		    break;
		  case 3:
			  this.day=31;
			  this.month = new Date[this.day+1];
			  this.name="March";
		    break;
		  case 4:
			  this.day=30;
			  this.month = new Date[this.day+1];
			  this.name="April";
			  break;
		  case 5:
			  this.day=31;
			  this.month = new Date[this.day+1];
			  this.name="May";;
		    break;
		  case 6:
			  this.day=30;
			  this.month = new Date[this.day+1];
			  this.name="June";
			  break;
		  case 7:
			  this.day=31;
			  this.month = new Date[this.day+1];
			  this.name="July";
		    break;
		  case 8:
			  this.day=31;
			  this.month = new Date[this.day+1];
			  this.name="August";
		    break;
		    
		  case 9:
			  this.day=30;
			  this.month = new Date[this.day+1];
			  this.name="September";
		    break;
		  case 10:
			  this.day=31;
			  this.month = new Date[this.day+1];
			  this.name="October";
		    break;
		  case 11:
			  this.day=30;
			  this.month = new Date[this.day+1];
			  this.name="November";
		    break;
		  case 12:
			  this.day=31;
			  this.month = new Date[this.day+1];
			  this.name="December";
		    break;
		}
		
	}
	

	public static void showMonth(Month month){
		System.out.println("Month: "+month.name);
		for(int i=1;i<=month.day;i++){
			month.month[i]= new Date(i,month.num,month.year);
			if(month.month[i].isPublicHoliday()==true)
				System.out.println("Day " + i + "[Event:  ]" + "Public Holiday");
			else
				System.out.println("Day " + i + "[Event:  ]");
		}
		System.out.println("\n******************************");
	}
	
	public static int getNum(Month month){
		return month.num;
	}
	
	public static Date getDay(Month month, int day){
			return month.month[day];
	}

	public String getName() {
		return this.name;
	}
	
	public int getDay() {
		return day;
	}


	



}
