
public abstract class Jugador implements Comparable<Jugador> {
	private String pseudonimo;
	private double sueldoBasico;

	public Jugador(String pseudonimo,double sueldoBasico ) {
		this.pseudonimo=pseudonimo;
		this.sueldoBasico=sueldoBasico;
	}
	
	public abstract double pagoSueldo();

	@Override
	public String toString() {
		return	"\nPseudonimo: "+ getPseudonimo() 
				+ "\nSueldo: "+ pagoSueldo() ;
	}

	public String getPseudonimo() {
		return pseudonimo;
	}

	public void setPseudonimo(String pseudonimo) {
		this.pseudonimo = pseudonimo;
	}

	public double getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;

	}
	
	public int compareTo(Jugador o) {
		if (pagoSueldo() > o.pagoSueldo()) 
			return 1;
		if (pagoSueldo() < o.pagoSueldo()) 
			return -1;
		return 0;
		
	}
	
	

}
