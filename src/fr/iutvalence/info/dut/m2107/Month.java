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
			  this.num = 1;
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
			  this.num = 2;
			  this.month = new Date[this.day+1];
			  this.name="February";
		    break;
		  case 3:
			  this.day=31;
			  this.num = 3;
			  this.month = new Date[this.day+1];
			  this.name="March";
		    break;
		  case 4:
			  this.day=30;
			  this.num = 4;
			  this.month = new Date[this.day+1];
			  this.name="April";
			  break;
		  case 5:
			  this.day=31;
			  this.num = 5;
			  this.month = new Date[this.day+1];
			  this.name="May";;
		    break;
		  case 6:
			  this.day=30;
			  this.num = 6;
			  this.month = new Date[this.day+1];
			  this.name="June";
			  break;
		  case 7:
			  this.day=31;
			  this.num = 7;
			  this.month = new Date[this.day+1];
			  this.name="July";
		    break;
		  case 8:
			  this.day=31;
			  this.num = 8;
			  this.month = new Date[this.day+1];
			  this.name="August";
		    break;
		    
		  case 9:
			  this.day=30;
			  this.num = 9;
			  this.month = new Date[this.day+1];
			  this.name="September";
		    break;
		  case 10:
			  this.day=31;
			  this.num = 10;
			  this.month = new Date[this.day+1];
			  this.name="October";
		    break;
		  case 11:
			  this.day=30;
			  this.num = 11;
			  this.month = new Date[this.day+1];
			  this.name="November";
		    break;
		  case 12:
			  this.day=31;
			  this.num = 12;
			  this.month = new Date[this.day+1];
			  this.name="December";
		    break;
		}
		
	}
	

	public static void showMonth(Month month){
		System.out.println("Month: "+month.name);
		for(int i=1;i<=month.day; i++){
			month.month[i]= new Date(i,month.num,month.year);
			Evenement event = month.month[i].getEvent();
			if (event==null){
				if (month.month[i].isPublicHoliday())
					System.out.println("Day " + i  + " " +PublicHoliday.getPublicHoliday(month.month[i].getDay(),month.month[i].getMonth()));
				else 
					System.out.println("Day " + i + " ");
			}
			else{
				if (month.month[i].isPublicHoliday())
					System.out.println("Day " + i + "[Event:" + event.showEvent() +"]" + PublicHoliday.getPublicHoliday(month.month[i].getDay(),month.month[i].getMonth()));
				else 
					System.out.println("Day " + i + "[Event: " + event.showEvent() + "]");
			}
				
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
	
	public Date[] getDate(){
		return this.month;
	}


	



}
