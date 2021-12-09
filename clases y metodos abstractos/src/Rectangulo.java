
public class Rectangulo extends Figura {
	private double largo;
	private double ancho;
	
	public Rectangulo( double l, double a ){
		super("rectangulo");
		this.largo = l;
		this.ancho = a;
	}
	
	public double area() {
		return this.largo * this.ancho;
	}
}
