import java.util.Scanner;

public class Fecha {
	private int dia;
    private int mes;
    private int anio;
    Scanner sc = new Scanner(System.in);
	public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
	public void setDia(int d) {
		do {
			System.out.println("Dia: ");
			d = sc.nextInt();
		}while ((d<1) || (d>31)); //validar dias
		this.dia=d;
    }
    public void setMes(int m) {
    	do {
    		System.out.println("Mes: ");
			m = sc.nextInt();
		}while ((m<1) || (m>12));
    	this.mes=m;
    }
    public void setAnio(int a) {
    	do {
    		System.out.println("Año: ");
			a = sc.nextInt();
		}while ((a<1900) || (a>2020));
    	this.anio=a;
    }
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAnio() {
        return anio;
    }

}
