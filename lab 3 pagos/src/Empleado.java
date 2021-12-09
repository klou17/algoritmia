
public abstract class Empleado implements PorPagar, Comparable<Empleado>  {
	private String primerNombre;
	private String apellidoPaterno;
	private String numeroSeguroSocial;

	public Empleado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial) {
		super(); //llama a object
		this.primerNombre=primerNombre;
		this.apellidoPaterno=apellidoPaterno;
		this.numeroSeguroSocial=numeroSeguroSocial;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getNumeroSeguroSocial() {
		return numeroSeguroSocial;
	}

	public void setNumeroSeguroSocial(String numeroSeguroSocial) {
		this.numeroSeguroSocial = numeroSeguroSocial;
	}

	@Override
	public String toString() {
		return "\nNombre y apellido: "+ primerNombre + " " + apellidoPaterno	
		+ "\nNSS: "+ numeroSeguroSocial;
	}
	
	public int compareTo(Empleado o) {
		if (obtenerMontoPago() > o.obtenerMontoPago()) 
			return 1;
		if (obtenerMontoPago() < o.obtenerMontoPago()) 
			return -1;
		return 0;
		
	}

}
