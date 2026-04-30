package ejercicio;

public class Rectangle {

	private static final int CONSTANTE = 2;
	private int ancho;
	private int alto;
	
	public Rectangle(int ancho, int alto) {
		this.ancho = ancho;
		this.alto = alto;
	}
	
	 public int surface() {
	        if (ancho < 0 || alto < 0) return -1;
	        if (ancho == 0 || alto == 0) return 0;
	        return ancho * alto;
	    }

	    public int perimeter() {
	        if (ancho < 0 || alto < 0) 
	        	return -1;
	        if (ancho == 0 || alto == 0) 
	        	return 0;
	        
	        return CONSTANTE * ancho + 2 * alto;
	    }
}
