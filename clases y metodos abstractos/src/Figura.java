
public abstract class Figura {
	private String nombre;
	abstract public double area();
		// Este constructor no puede ser invocado directamente,
		// sólo lo usan las clases derivadas
	public Figura( String n ) {
		this.nombre = n;
	}
	
	final public double compArea( Figura b ) {
		return area() - b.area();
	}
	
	final public String toString() {
		return this.nombre + " de area " + area();
	}
	
}