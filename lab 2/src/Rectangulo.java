import java.util.*;
public class Rectangulo{
	private Coordenada esquina1;
	private Coordenada esquina2;
	Scanner sc = new Scanner(System.in);
	
	public Rectangulo(Coordenada c1, Coordenada c2) {
		setEsquina1(c1);
		setEsquina2(c2);
	}
	
	public void setEsquina1 (Coordenada c) {
		this.esquina1=c;
	}
	
	public void setEsquina2 (Coordenada c) {
		this.esquina2=c;
	}
	
	public Coordenada getEsquina1() {
		return esquina1;
	}
	
	public Coordenada getEsquina2() {
		return esquina2;
	}
	
	public String toString() {
		return "(["+ getEsquina1()+ "], ["+getEsquina2()+"])";
	}
	
	public double calculoArea(Coordenada c2, Coordenada c3) {
		double a= (c2.getX()-c3.getX()) * (c2.getY()-c3.getY());
		return Math.abs(a);
		
	}
	
	


	
	
}
