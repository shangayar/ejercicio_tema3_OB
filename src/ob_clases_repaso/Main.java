package ob_clases_repaso;

public class Main {

	public static void main(String[] args) {
		System.out.println(suma(2,5,6));
		
		Coche miAuto = new Coche(4);
		//mostramos las puertas originales
		miAuto.mostrarPuertas();
		//agregamos una puerta
		miAuto.agregaPuerta();
		//mostramos con la puerta agregada
		miAuto.mostrarPuertas();		

	}
	//Método de tres parámetros
	public static int suma(int a, int b, int c) {
		return a+b+c;
	}

}



