
public class EmpleadoPorComision extends Empleado {
	private int ventasBrutas;
	private double tarifaComision;
	
	public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial) {
		super(primerNombre, apellidoPaterno, numeroSeguroSocial);
		setVentasBrutas(ventasBrutas);
		setTarifaComision(tarifaComision);
	}

	public int getVentasBrutas() {
		return ventasBrutas;
	}

	public void setVentasBrutas(int ventasBrutas) {
		this.ventasBrutas = ventasBrutas;
	}

	public double getTarifaComision() {
		return tarifaComision;
	}

	public void setTarifaComision(double tarifaComision) {
		this.tarifaComision = tarifaComision;
	}

	@Override
	public double obtenerMontoPago() {
		// TODO Auto-generated method stub
		return getVentasBrutas()*getTarifaComision();
	}
	
	public String toString() {
		// return String.format("Empleado Asalariado: %s\n%s: $%,.2f", 
		// super.toString(), "salario semanal", getSalarioSemanal());	
		return "Empleado por Comision: "+ super.toString() +
				"\nVentas Brutas: $" + getVentasBrutas()+
				"\nTarifa Comision: $" + getTarifaComision();
	}
}
