
public class Producto implements Comparable<Producto> {
	private String descripcion;
	private int stock;
	private double precio; 

	public Producto(String descripcion, double precio, int stock){
		this.descripcion= descripcion;
		this.stock=stock;
		this.precio=precio;
	}
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public String toString(){ 
		return getDescripcion()+" "+ + getPrecio()+" " +getStock();
	}


	@Override
	public int compareTo(Producto o) {
		if (getStock() > o.getStock()) 
			return 1;
		if (getStock() < o.getStock()) 
			return -1;
		return 0;
	}	

}
