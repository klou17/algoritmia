
public class Nacional extends Jugador {
	private int meses;

	public Nacional(String pseudonimo,double sueldoBasico,int meses) {
		super(pseudonimo, sueldoBasico);
		setMeses(meses);
		
	}
	private double bonificTiempo() {
		int p=0;
		if (getMeses()==12)
			p=5/100;
		else
			if (getMeses()>12)
				p=10/100;
			else p=1;
		return super.getSueldoBasico()*p;
	}
	public int getMeses() {
		return meses;
	}
	public void setMeses(int meses) {
		if (meses >=  0)
			this.meses = meses;
		else
			this.meses =0;
	}
	@Override
	public String toString() {
		return "Jugador Nacional: " + 
				super.toString()+
				"\nNro. Meses: "+getMeses();
				
	}
	@Override
	public double pagoSueldo() {
		return bonificTiempo()*super.getSueldoBasico();
	}
		
	

}
