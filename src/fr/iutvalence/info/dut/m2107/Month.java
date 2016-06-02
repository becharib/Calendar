package fr.iutvalence.info.dut.m2107;

/**
 * Class to defin a Month with :
 * -a table of days (month)
 * -the number of the current month (num)
 * -the year of the current month(year)
 * -the name of the month (name)
 * -the number of days of the  Month (nbDay)
 * @author William
 *
 */

public class Month {
	private int nbDay;
	private String name;
	private int year;
	private int num;
	private Date[] month;
	
	/**
	 * 
	 * Constructor to set the year of the Month and the other attributes with a switch
	 * to have the corresponding number of days, number of the month, name, and table for each Month
	 */
	public Month(int num, int year){
		this.year=year;

		switch (num)
		{
		case 1:
			this.nbDay=31;
			this.num = 1;
			this.month = new Date[this.nbDay+1];
			this.name="January";
			break;
		case 2:
			/**
			 * the if to set the right number of days of the current month
			 * if his year is a leap year or not
			 */
			if(((year%4 == 0)&&(year%100 != 0))||(year%400 ==0)){
				this.nbDay=29;  
			}
			else{
				this.nbDay=28;
			}
			this.num = 2;
			this.month = new Date[this.nbDay+1];
			this.name="February";
			break;
		case 3:
			this.nbDay=31;
			this.num = 3;
			this.month = new Date[this.nbDay+1];
			this.name="March";
			break;
		case 4:
			this.nbDay=30;
			this.num = 4;
			this.month = new Date[this.nbDay+1];
			this.name="April";
			break;
		case 5:
			this.nbDay=31;
			this.num = 5;
			this.month = new Date[this.nbDay+1];
			this.name="May";;
			break;
		case 6:
			this.nbDay=30;
			this.num = 6;
			this.month = new Date[this.nbDay+1];
			this.name="June";
			break;
		case 7:
			this.nbDay=31;
			this.num = 7;
			this.month = new Date[this.nbDay+1];
			this.name="July";
			break;
		case 8:
			this.nbDay=31;
			this.num = 8;
			this.month = new Date[this.nbDay+1];
			this.name="August";
			break;

		case 9:
			this.nbDay=30;
			this.num = 9;
			this.month = new Date[this.nbDay+1];
			this.name="September";
			break;
		case 10:
			this.nbDay=31;
			this.num = 10;
			this.month = new Date[this.nbDay+1];
			this.name="October";
			break;
		case 11:
			this.nbDay=30;
			this.num = 11;
			this.month = new Date[this.nbDay+1];
			this.name="November";
			break;
		case 12:
			this.nbDay=31;
			this.num = 12;
			this.month = new Date[this.nbDay+1];
			this.name="December";
			break;
		}

		for(int i=1;i<=this.nbDay;i++){
			this.month[i] = new Date(i,this.num,this.year);
		}
	}


	public void showMonth(){
		System.out.println("Month: "+this.name);

		for(int i=1;i<=this.nbDay; i++){

			Evenement event = this.month[i].getEvent();

			if (event==null){
				if (this.month[i].isPublicHoliday())
					System.out.println("Day " + i  + " " +PublicHoliday.getPublicHoliday(this.month[i].getDay(),this.month[i].getMonth()));
				else 
					System.out.println("Day " + i + " ");
			}
			else{
				if (this.month[i].isPublicHoliday())
					System.out.println("Day " + i + event.showEvent() + PublicHoliday.getPublicHoliday(this.month[i].getDay(),this.month[i].getMonth()));
				else 
					System.out.println("Day " + i + event.showEvent() );
			}

		}
		System.out.println("\n******************************");
	}
	
	/**
	 * 
	 * get the number of the current month
	 */

	public int getNum(){
		return this.num;
	}
	/**
	 * 
	 * get a day 
	 */

	public Date getDay(int day){
		return this.month[day];
	}
	/**
	 * 
	 * get the name of the current month
	 */

	public String getName() {
		return this.name;
	}
/**
 * 
 * get the table of dates
 */
	public Date[] getDate(){
		return this.month;
	}

	public int getNbDay() {
		return nbDay;
	}





}
