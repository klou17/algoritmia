
public class Producto implements Comparable<Producto>{
	private String descripcion;       
	private String procedencia;   
	private int precio;     
	
    public Producto(String desc,String proc, int prec) {    
    	this.descripcion = desc;    
    	this.procedencia = proc;    
    	this.precio = prec; 
    }

	@Override
	public String toString() {
		return getDescripcion()+
				"\nProcedencia: " + getProcedencia()+ 
				"\nPrecio: " + getPrecio();
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public int compareTo(Producto p) {
		if (getPrecio() > p.getPrecio()) 
			return 1;
		if (getPrecio() < p.getPrecio()) 
			return -1;
		return 0;
	}

}
