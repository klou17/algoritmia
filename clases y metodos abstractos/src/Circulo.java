
public class Circulo extends Figura {
	static final private double PI = 3.141592653;
	private double radio;
	
	public Circulo( double r ) {
		super("circulo");
		this.radio = r;
	}
	
	public double area() {
		return PI * Math.pow(this.radio, 2); //radio*radio
	}
}