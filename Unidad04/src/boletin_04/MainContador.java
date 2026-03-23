package boletin_04;

public class MainContador {

	public static void main(String[] args) {
		Contador count = new Contador(0);

		//Increase the count
		count.increase(count.getCont());
		
		System.out.println(count.toString());
		
		//Decrease the count
		count.decrease(count.getCont());
		
		System.out.println(count.toString());
		
		//Decrease it again
		count.decrease(count.getCont());
		
		System.out.println(count.toString());
	}

}