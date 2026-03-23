package boletin_04;

public class MainHora {

	public static void main(String[] args) {
		Hora clock = new Hora(23, 48, 59);

		//Increase the time one second
		clock.increaseTime(clock.getHour(), clock.getMinute(), clock.getSecond());
		
		//Show it through the console
		System.out.println(clock.toString());
	}

}