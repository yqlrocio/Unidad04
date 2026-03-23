package boletin_04;

public class Fecha {
	private int day;
	private int month;
	private int year;
	
	Fecha(){
		this.day = 1;
		this.month = 1;
		this.year = 1400;
	}
	
	Fecha(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public boolean isLeapYear(int year) {
		//The boolean that will tell if the year introduced is a leap year or not
		boolean leapYear = false;
		
		/*
		 * A leap year happens when it is divisible by four
		 * If the year is divisble by 100, it is not a leap year, except if it is divisible by 400 too
		 */
		if ((year%4 == 0 && year%100 != 0) || year%400 == 0) {
			leapYear = true;
		}
		
		return leapYear;
	}
	
	public boolean correctDate(int day, int month, int year) {
		//The boolean that will tell if the date is in a correct format or not
		boolean correctDate = true;
		
		if (day > 31 || month > 12 || year < 0) {
			correctDate = false;
		}
		
		return correctDate;
	}
	
	public void nextDay(int day, int month, int year) {
		//Increase the date one day
		this.day++;
		
		if (day == 29 && month == 2 && !(isLeapYear(year))) {
			this.day = 1;
			this.month = 3;
		} else if (day == 31) {
			this.day = 1;
			this.month++;
		} else if (day == 31 && month == 12) {
			this.day = 1;
			this.month = 1;
			this.year++;
		}
	}
	
	public String toString() {
		//The string that will contain the day
		String day;
		
		//The String that will contain the month
		String month;
		
		//The chain that will contain the full date
		String date;
		
		//If the day or the month only contain one number, add a cero just in front of them
		if (this.day < 10) {
			day = "0" + this.day;
		} else {
			day = String.valueOf(this.day);
		}
		
		if (this.month < 10) {
			month = "0" + this.month;
		} else {
			month = String.valueOf(this.month);
		}
		
		date = day + "-" + month + "-" + year;
		
		return date;
	}
}