package ejercicios_parte1;

public class PrincipalArticulo {

	public static void main(String[] args) {
		
			Articulo articulo1 = new Articulo ("Pijama", 10.0, 21, 50); 
			Articulo articulo2 = new Articulo ("", -20.0, 210, -5); 
			
			System.out.println(articulo1);
			
			mostrar(articulo1);
			mostrar(articulo2);
			
			articulo1.setPrecio(-15.0); 
			articulo1.setCuantosQuedan(49); 

	}

}
