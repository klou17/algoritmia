

public class Pequenho extends Contribuyente {
	
	private double obtenerPago() {
		if (this.getIngresos()<=5000)
			return 20;
		else
			return 60;
	}

	@Override
	public String toString() {
		return "Pequenho:" + super.toString();
	}
	
	
	

}
