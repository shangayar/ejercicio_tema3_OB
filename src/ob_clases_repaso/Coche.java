package ob_clases_repaso;

public class Coche {
	private int puerta;
	
	public Coche(int puerta) {
		this.puerta = puerta;
	}
	public int agregaPuerta() {
		
		int nuevaPuerta = this.puerta+1;
		this.puerta = nuevaPuerta;
		
		return nuevaPuerta;
	}
	public void mostrarPuertas() {
		System.out.println(this.puerta);
	}
	
	

}
