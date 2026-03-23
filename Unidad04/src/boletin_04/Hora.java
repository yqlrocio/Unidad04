package boletin_04;

public class Hora {
	private int hour;
	private int minute;
	private int second;
	
	Hora(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	Hora(){
		this.hour = 00;
		this.minute = 00;
		this.second = 00;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	
	//This method allows the user to increase the time only one second
	public void increaseTime(int hour, int minute, int second) {
		
		//We increase the seconds
		second++;
		
		//If the value of the seconds now equals 60, we will increase the minutes and restart the seconds
		if (second == 60) {
			this.second = 00;
			this.minute++;
		} else if (minute == 60) {
			this.minute = 00;
			this.hour++;
		} else if (hour == 24) {
			this.hour = 00;
		}
	}
	
	public String toString() {
		String chain = "La hora después de incrementarla un segundo es: " + hour + ":" + minute + ":" + second;
		return chain;
	}
}

	