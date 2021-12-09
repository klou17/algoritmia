import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese datos: ");
		Fecha fecha=new Fecha(04,02,2001);
		FrecuenciasCardiaca persona=new FrecuenciasCardiaca("Nikol","Lazarte",fecha);
		System.out.println("Nombre: ");
		persona.setNombre("");
		System.out.println("Apellido: ");
		persona.setApellido("");
		System.out.println("Fecha Nacimiento: ");
		fecha.setDia(3);
		fecha.setMes(3);
		fecha.setAnio(2000);
		System.out.println("**************************************");
		System.out.println("DATOS DE LA PERSONA: ");
		System.out.println("Nombre: "+persona.getNombre());
		System.out.println("Apellido: "+persona.getApellido());
		System.out.println("Fecha Nacimiento: "+fecha.getDia()+"/"+fecha.getMes()+"/"+fecha.getAnio());
		System.out.println("Edad: "+persona.calculaEdad(fecha));
		System.out.println("Frecuencia Cardiaca Max.: "+persona.frecMax(fecha));
		System.out.println("Frecuencia Cardiaca Esperada: ");
		persona.frecEsp(fecha);
	}

}
