import java.util.Scanner;

public class PerfilMedico {
	private String nombre;
	private String apellido;
	private String sexo;
	private double altura;
	private double peso;
	private Fecha fnac;
	Scanner sc = new Scanner(System.in);
	public PerfilMedico() {
		this.nombre="";
		this.apellido="";
		this.sexo="";
		this.altura=0;
		this.peso=0;
	}
	public void setNombre(String n) {
		n = sc.nextLine();
		this.nombre=n;
    }
    public void setApellido(String a) {
    	a= sc.nextLine();
    	this.apellido=a;
    }
    public void setSexo(String s) {
    	s= sc.nextLine();
    	this.sexo=s;
    }
    public void setAltura(double alt) {
    	alt= sc.nextInt();
    	this.altura=alt/100; //de cm a m
    }
    public void setPeso(double p) {
    	p= sc.nextDouble();
    	this.peso=p;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getSexo() {
        return sexo;
    }
    public double getAltura() {
        return altura;
    }
    public double getPeso() {
        return peso;
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
    public void bmi(double pe, double al) {
    	double imc =pe/(al*al);
    	System.out.println("\nVALORES DE BMI");
        System.out.println("Bajo peso: menos de 18.5");
        System.out.println("Normal:    entre 18.5 y 24.9");
        System.out.println("Sobrepeso: entre 25 y 29.9");
        System.out.println("Obeso      30 o mas");
        System.out.println("BMI del paciente= "+imc);
    	if (imc<18.5)
    		System.out.println("Situacion: Bajo de peso");
    	else
    		if (imc<=24.9)
        		System.out.println("Situacion: Normal");
    		else
    			if (imc<=29.9)
            		System.out.println("Situacion: Sobrepeso");
    			else
    				System.out.println("Situacion: Obeso");
    }
 }
