
public class Factura implements Impuesto {

	private String descripcionPieza;
	private int cantidad;
	private double precioPorArticulo;
	
	public Factura(String descripcionPieza, int cantidad, double precioPorArticulo) {
		setDescripcionPieza(descripcionPieza);
		setCantidad(cantidad);
		setPrecioPorArticulo(precioPorArticulo);
	}
	
	public String getDescripcionPieza() {
		return descripcionPieza;
	}
	
	public void setDescripcionPieza(String descripcionPieza) {
		this.descripcionPieza = descripcionPieza;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public double getPrecioPorArticulo() {
		return precioPorArticulo;
	}
	
	public void setPrecioPorArticulo(double precioPorArticulo) {
		this.precioPorArticulo = precioPorArticulo;
	}
	
	public String toString() {
		return "Factura: " + getDescripcionPieza() +
		", "+ getCantidad() + ", " + getPrecioPorArticulo();
	}

	public double devImpuesto() {
		return (getCantidad()*getPrecioPorArticulo()*18)/100; //calcula 18%
	}

	
}
