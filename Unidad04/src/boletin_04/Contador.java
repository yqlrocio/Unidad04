package boletin_04;

public class Contador {
	private int cont;
	
	Contador(int cont) {
		this.cont = cont;
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		if (cont >= 0) {
			this.cont = cont;
		}
	}
	
	public void increase(int cont) {
		this.cont++;
	}
	
	public void decrease(int cont) {
		this.cont--;
		
		if (this.cont < 0) {
			this.cont = 0;
		}
	}
	
	public String toString() {
		String chain = "Valor del contador: " + cont;
		return chain;
	}
}