import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int cRec=-1, opc =-1;
		Coordenada c1=new Coordenada (1,1);
		Coordenada c2=new Coordenada (1,1);
		Coordenada c3=new Coordenada (1,1);
		Coordenada c4=new Coordenada (1,1);
		Rectangulo rectanguloA=new Rectangulo(c1,c2);
		Rectangulo rectanguloB=new Rectangulo(c3,c4);
		ContainerRectangulo conta=new ContainerRectangulo();

		System.out.println("*****************MENU******************");
		System.out.println("1. COMPARACION DE DOS RECTANGULOS");
		System.out.println("2. INFO DE n RECTANGULOS (coordenadas, dist. euclidiana, area)");
		System.out.println("***************************************");
		
		while ((opc !=1) && (opc !=2) ) {
			System.out.print("Ingrese opcion 1 o 2: ");
			opc = sc.nextInt(); 
		}
		
		if (opc==1){
			System.out.print("Ingrese una esquina del 1er rectángulo: ");
			c1.setX(0); c1.setY(0);
			System.out.print("Ingrese la esquina opuesta del 1er rectángulo: ");
			c2.setX(0); c2.setY(0);
			System.out.print("Ingrese una esquina del 2do rectángulo: ");
			c3.setX(0); c3.setY(0);
			System.out.print("Ingrese la esquina opuesta del 2do rectángulo: ");
			c4.setX(0); c4.setY(0);
			
			System.out.println("Rectangulo A= "+rectanguloA.toString());
			System.out.println("Rectangulo B= "+rectanguloB.toString());
			
			if(Verificador.esSobrePos(rectanguloA, rectanguloB)==true) {
				System.out.println("Rectangulos A y B se sobreponen");
				System.out.print("Area de sobreposicion= ");
				System.out.println(Principal.rectanguloSobre(rectanguloA, rectanguloB)); 
			}
			else if (Verificador.esJunto(rectanguloA, rectanguloB)==true)
				System.out.println("Rectangulos A y B se juntan");
			
			else 
				System.out.println("Rectangulos A y B son disjuntos"); 
		}	
		else  {
			while(cRec<0) { //valida nro positivo para rectangulos
				System.out.print("Ingrese nro. de rectangulos: ");
				cRec = sc.nextInt();
			} 
			conta.addRectagulo(cRec);
			conta.toString();
		}	
	}
	
	public static double rectanguloSobre(Rectangulo r1, Rectangulo r2){
		// rectangulo r1= a1 y b1    rectangulo r2= a2 y b2
		Coordenada a1= r1.getEsquina1();
		Coordenada b1= r1.getEsquina2();
		Coordenada a2= r2.getEsquina1();
		Coordenada b2= r2.getEsquina2();
		double r1xmi,r1xma,r2xmi,r2xma;
		double r1ymi,r1yma,r2ymi,r2yma;
		double r3xmi,r3xma,r3ymi,r3yma;
		
		if(a1.getX() < b1.getX()) { //el x min y max de rectangulo 1 
			r1xmi=a1.getX();
			r1xma=b1.getX();}	
		else {
			r1xmi=b1.getX();
			r1xma=a1.getX();}
		
		if(a2.getX() < b2.getX()) { //el x min y max de rectangulo 2 
			r2xmi=a2.getX();
			r2xma=b2.getX();}	
		else {
			r2xmi=b2.getX();
			r2xma=a2.getX();}
		
		if(a1.getY() < b1.getY()) { //el y min y max de rectangulo 1 
			r1ymi=a1.getY();
			r1yma=b1.getY();}	
		else {
			r1ymi=b1.getY();
			r1yma=a1.getY();}
		
		if(a2.getY() < b2.getY()) { //el y min y max de rectangulo 2 
			r2ymi=a2.getY();
			r2yma=b2.getY();}	
		else {
			r2ymi=b2.getY();
			r2yma=a2.getY();}
		
		if (r1xmi>r2xmi) //2 3
			r3xmi=r1xmi;
		else r3xmi=r2xmi; //3
		
		if (r1xma>r2xma) // 7 6
			r3xma=r2xma;// 6
		else r3xma=r1xma; 
		
		if (r1ymi>r2ymi)// 1 2
			r3ymi=r1ymi;
		else r3ymi=r2ymi; //2
		if (r1yma>r2yma)// 4 3
			r3yma=r2yma; //3
		else r3yma=r1yma;
		
		return Math.abs((r3xma-r3xmi)*(r3yma-r3ymi));	//3* 1
	}
}