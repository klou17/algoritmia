import java.util.Scanner;

public class FrecuenciasCardiaca {
	private String nombre;
	private String apellido;
	private Fecha fnac;
	Scanner sc = new Scanner(System.in);
	public FrecuenciasCardiaca(String nombre,String apellido,Fecha fnac) {
		this.nombre="";
		this.apellido="";
	}
	public void setNombre(String n) {
		n = sc.nextLine();
		this.nombre=n;
    }
    public void setApellido(String a) {
    	a= sc.nextLine();
    	this.apellido=a;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    } 
    public int calculaEdad(Fecha n) {
    	int edad = 2020-n.getAnio();
    	return edad;
    }
    public int frecMax(Fecha n) {
    	int frec = 220-(2020-n.getAnio());
      	return frec;
    }
    public void frecEsp(Fecha n) {
    	int f= frecMax(n);
     	double rangoMin=0.2*f;
    	double rangoMax=0.85*f;
    	System.out.println("De "+rangoMin+" a "+rangoMax);
    }
 }
