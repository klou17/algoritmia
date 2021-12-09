
public class Inmueble implements Impuesto{
	private String calle;
	private int numero;
	private double precio;
	
	public Inmueble(String calle, int numero, double precio) {
		setPrecio(precio);
		setCalle(calle);
		setNumero(numero);
	}

	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String toString() {
		return getCalle()+" "+getNumero();
	}
@Override
	public double devImpuesto() {
		double pre;
		if (getPrecio() > 60000)
			pre=getPrecio()*20/100; //calcula 20%
		else
			pre=getPrecio()*10/100; //calcula 10%
		
		return pre;
	}

	
}
