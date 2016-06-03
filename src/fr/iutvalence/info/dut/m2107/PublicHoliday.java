package fr.iutvalence.info.dut.m2107;

/**
 * 
 * Enumeration of the differents Public Holidays
 *
 */
public enum PublicHoliday {
	newYear(1,1,"NewYear"),
	easterMonday(28,3,"EasterMonday"),
	laborDay(1,5,"LaborDay"),
	ascensionDay(5,5,"AscensionDay"),
	whitMonday(16,5,"whitMonday"),
	nationalDay(14,7,"NationalDay"),
	allSaintsDay(1,11,"AllSaintsDay"),
	armistice(11,11,"Armistice"),
	christmas(25,12,"Christmas");
	
	/** Num of the day **/
	int day;
	/** Num of the month **/
	int month;
	/** Name of the Holiday **/
	private String name;

	/**
	 * Create a new Public Holiday
	 * @param day
	 * @param month
	 * @param name
	 */
	PublicHoliday(int day, int month, String name){
		this.day = day;
		this.month = month;
		this.name = name;
	}

	/**
	 * Return the Name of the Public Holiday related to the day and the month passed in parameters
	 * Return null if not exists
	 * @param d
	 * @param m
	 * @return
	 */
	public static String getPublicHoliday(int d, int m){
		for (PublicHoliday pH : PublicHoliday.values()) {
			if ((d==pH.day)&&(m==pH.month))
				return pH.name;
		}
		return null;
	}
}