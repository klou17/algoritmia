
public class EmpleadoBaseMasComision extends EmpleadoPorComision {
	private double salarioBase;
	
	public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial) {
		super(primerNombre, apellidoPaterno, numeroSeguroSocial);
		setSalarioBase(salarioBase);
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	@Override
	public double obtenerMontoPago() {
		// TODO Auto-generated method stub
		return getSalarioBase()+ (super.getTarifaComision()*super.getVentasBrutas());
	}

	public String toString() {
		// return String.format("Empleado Asalariado: %s\n%s: $%,.2f", 
		// super.toString(), "salario semanal", getSalarioSemanal());	
		return "Empleado Base Mas Comision: "+ super.toString() +
				"\nSalario Base: $" + getSalarioBase();

	}
}
