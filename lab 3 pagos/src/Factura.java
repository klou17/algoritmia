
public class Factura implements PorPagar {
	private int cantidad;
	private String numeroPieza, descripcionPieza ;
	private double precioPorArticulo;
	
	public Factura(String numeroPieza, String descripcionPieza, int cantidad, double precioPorArticulo) {
		/*this.precioPorArticulo=precioPorArticulo;
		this.cantidad=cantidad;  //si pusiera esto aceptaria negativos
		this.numeroPieza=numeroPieza;
		this.descripcionPieza=descripcionPieza;*/
		
		//setNumeroPieza(numeroPieza) modifica valor de ese atributo
		
		setNumeroPieza(numeroPieza);
		setCantidad(cantidad); //los uso cuando hay validaciones dentro de sets
		setPrecioPorArticulo(precioPorArticulo);
		setDescripcionPieza(descripcionPieza); 
	}
	
	public double obtenerMontoPago(){
		return getCantidad() * getPrecioPorArticulo();
	}
	
	@Override
	public String toString() {
		return "Factura: "+ getNumeroPieza() + ","+ getDescripcionPieza() + ","
				+ getCantidad()+ ","+ getPrecioPorArticulo() ;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		if (cantidad  >=  0)
			this.cantidad = cantidad;
		else
			this.cantidad =0;
	}

	public String getNumeroPieza() {
		return numeroPieza;
	}

	public void setNumeroPieza(String numeroPieza) {
		this.numeroPieza = numeroPieza;
	}

	public String getDescripcionPieza() {
		return descripcionPieza;
	}

	public void setDescripcionPieza(String descripcionPieza) {
		this.descripcionPieza = descripcionPieza;
	}

	public double getPrecioPorArticulo() {
		return precioPorArticulo;
	}

	public void setPrecioPorArticulo(double precioPorArticulo) {
		if (precioPorArticulo  >=  0)
			this.precioPorArticulo = precioPorArticulo;
		else
			this.precioPorArticulo =0;
	}

}
