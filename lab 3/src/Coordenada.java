import java.math.BigDecimal;
import java.text.DecimalFormat;

import java.util.*;
public class Coordenada {
	private double x,y;
	Scanner sc = new Scanner(System.in);
	public Coordenada() {	
		x=0;
		y=0;
	}
	
	public Coordenada(double x, double y){
		this.x=x;
		this.y=y;
	}
		
	public Coordenada(Coordenada c ){ //Constructor
		x=c.getX();
		y=c.getY();
	}
		
	void setX(double x) {
		x = sc.nextDouble();
		this.x=x;
	}
	
	void setY(double y){
		y = sc.nextDouble();
		this.y=y;
	}
		
	double getX(){
		return x;
	}
	
	double getY(){
		 return y;
	}
	
	double distancia(Coordenada c){ //método de instancia que calcula la distancia euclideana
		double dis= (Math.pow(x,2))+(Math.pow(y,2));
		return Math.sqrt(dis);
	}
	
	public static double distancia(Coordenada c1, Coordenada c2){ //distancia euclideana
		double dis= Math.pow((c2.getX()-c1.getX()),2) + Math.pow((c2.getY()-c1.getY()),2);
		return Math.sqrt(dis);	
	}
		
	public String toString(){ //método que devuelve los valores de una coordenada en determinado formato
		 return getX()+" , "+getY();
	}
}
