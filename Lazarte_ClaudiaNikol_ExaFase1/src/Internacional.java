
public class Internacional extends Jugador{
	private int referencias;
	
	public Internacional(String pseudonimo,double sueldoBasico, int referencias) {
		super(pseudonimo, sueldoBasico);
		this.referencias=referencias;
	}

	public double bonificReferencias()  {
		return getReferencias()*super.getSueldoBasico()/100;
	}
	
	public int getReferencias() {
		return referencias;
	}

	public void setReferencias(int referencias) {
		this.referencias = referencias;
	}

	@Override
	public String toString() {
		return "Jugador Internacional: " + 
				super.toString()+
				"\nNro. Referencias: "+getReferencias();
	}

	@Override
	public double pagoSueldo() {
		return bonificReferencias()*super.getSueldoBasico();
	}

	
	

}
