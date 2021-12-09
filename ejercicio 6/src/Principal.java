import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese datos: ");
		Fecha fecha=new Fecha(04,02,2001);
		PerfilMedico persona=new PerfilMedico();
		System.out.println("Nombre: ");
		persona.setNombre("");
		System.out.println("Apellido: ");
		persona.setApellido("");
		System.out.println("Sexo: ");
		persona.setSexo("");
		System.out.println("Altura (en cm): ");
		persona.setAltura(0);
		System.out.println("Peso: ");
		persona.setPeso(0);
		System.out.println("Fecha Nacimiento: ");
		fecha.setDia(3);
		fecha.setMes(3);
		fecha.setAnio(2000);
		System.out.println("**************************************");
		System.out.println("DATOS DE LA PERSONA: ");
		System.out.println("Nombre: "+persona.getNombre());
		System.out.println("Apellido: "+persona.getApellido());
		System.out.println("Sexo: "+persona.getSexo());
		System.out.println("Altura: "+persona.getAltura()+"m");
		System.out.println("Peso: "+persona.getPeso()+"kg");
		System.out.println("Fecha Nacimiento: "+fecha.getDia()+"/"+fecha.getMes()+"/"+fecha.getAnio());
		System.out.println("Edad: "+persona.calculaEdad(fecha)+" años");
		System.out.println("Frecuencia Cardiaca Max.: "+persona.frecMax(fecha));
		System.out.println("Frecuencia Cardiaca Esperada: ");
		persona.frecEsp(fecha);
		System.out.println("Indice de Masa Corporal (BMI):");
		persona.bmi(persona.getPeso(),persona.getAltura());
	}

}
