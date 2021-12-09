
public class EmpleadoAsalariado extends Empleado {
	private double salarioSemanal;

	public EmpleadoAsalariado(String primerNombre, String apellidoPaterno,
			String numeroSeguroSocial,double salarioSemanal) {
		super(primerNombre, apellidoPaterno, numeroSeguroSocial);
		setSalarioSemanal(salarioSemanal);	
	}

	public double getSalarioSemanal() {
		return salarioSemanal;
	}

	public void setSalarioSemanal(double salarioSemanal) {
		if (salarioSemanal  >=  0)
			this.salarioSemanal = salarioSemanal;
		else
			this.salarioSemanal = 0;
	}
	
	public String toString() {
		// return String.format("Empleado Asalariado: %s\n%s: $%,.2f", 
		// super.toString(), "salario semanal", getSalarioSemanal());	
		return "Empleado Asalariado: "+ super.toString() + 
				"\nSalario Semanal: $" + getSalarioSemanal();
	}

	@Override
	public double obtenerMontoPago() {
		return getSalarioSemanal();
	}

	

}
