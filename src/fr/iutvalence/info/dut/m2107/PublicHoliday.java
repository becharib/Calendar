package fr.iutvalence.info.dut.m2107;


public enum PublicHoliday {
	newYear(1,1,"newYear"),
	easterMonday(28,3,"easterMonday"),
	laborDay(1,5,"laborDay"),
	ascensionDay(5,5,"ascensionDay"),
	whitMonday(16,5,"whitMonday"),
	nationalDay(14,7,"nationalDay"),
	allSaintsDay(1,11,"allSaintsDay"),
	armistice(11,11,"armistice"),
	christmas(25,12,"christmas");

	int day;
	int month;
	private String name;

	PublicHoliday(int day, int month, String name){
		this.day = day;
		this.month = month;
		this.name = name;
	}

	public static String getPublicHoliday(int d, int m){
		for (PublicHoliday pH : PublicHoliday.values()) {
			if ((d==pH.day)&&(m==pH.month))
				return pH.name;
		}
		return null;
	}

	public String getName(){
		return this.name();
	}
}