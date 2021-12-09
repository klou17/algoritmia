import java.util.Scanner;

public class Triangulo {
	private Coordenada esquina1;
	private Coordenada esquina2;
	private Coordenada esquina3;
	Scanner sc = new Scanner(System.in);

	public Triangulo(Coordenada c1, Coordenada c2, Coordenada c3) {
		setEsquina1(c1);
		setEsquina2(c2);
		setEsquina3(c3);
	}
	
	public void setEsquina1 (Coordenada c) {
		this.esquina1=c;
	}
	
	public void setEsquina2 (Coordenada c) {
		this.esquina2=c;
	}
	
	public void setEsquina3 (Coordenada c) {
		this.esquina3=c;
	}
	
	public Coordenada getEsquina1() {
		return esquina1;
	}
	
	public Coordenada getEsquina2() {
		return esquina2;
	}
	
	public Coordenada getEsquina3() {
		return esquina3;
	}
	public String tipoTriangulo() {
		return "(["+ getEsquina1()+ "], ["+getEsquina2()+"], ["+getEsquina3()+"])";
	}

}
