import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cTri=-1;

		while(cTri<0) { //valida nro positivo para triangulos
			System.out.print("Ingrese nro. de triangulos: ");
			cTri = sc.nextInt();
		}
		
		Triangulo [] tri= new Triangulo [cTri];
		String [] tipoTri=new String [cTri];
		
		for (int i=0; i<cTri; i++){
			Coordenada co1=new Coordenada(0,0);
			Coordenada co2=new Coordenada(0,0);
			Coordenada co3=new Coordenada(0,0);
			tri[i]= new Triangulo (co1,co2,co3);
			System.out.println("Triangulo "+(i+1));
			System.out.println("Ingrese Coordenadas: ");
			System.out.print("Coordenada 1: ");
			co1.setX(0); co1.setY(0);
			System.out.print("Coordenada 2: ");
			co2.setX(0); co2.setY(0);
			System.out.print("Coordenada 3: ");
			co3.setX(0); co3.setY(0);
			if (Tipo.esIsosceles(tri[i])==true)
				tipoTri[i]= "Isosceles";
			else if (Tipo.esEquilatero(tri[i])==true)
				tipoTri[i]= "Equilatero";
			else
				tipoTri[i]= "Escaleno";	
		}
		Principal.mostrar(cTri,tri,tipoTri);
		Principal.cantidadPorTipo(cTri, tipoTri);

	}
	
	public static void mostrar(int cTri,Triangulo[] tri, String[] tipoTri) {
		System.out.println("     Pos                  Triangulo                           Tipo");
		for (int i=0; i<cTri; i++)
			System.out.println("    "+(i+1)+"         "+tri[i].tipoTriangulo()+"      "+tipoTri[i]);
		
	}
	
	public static void cantidadPorTipo(int cTri, String[] tipoTri) {
		int equi=0;
		int iso=0;
		int esca=0;
		for (int i=0; i<cTri; i++) {
			if (tipoTri[i]=="Equilatero")
				equi+=1;
			else if (tipoTri[i]=="Isosceles")
				iso+=1;
			else esca+=1;
		}
		
		System.out.println("Triangulos Equilatero : "+equi);
		System.out.println("Triangulos Isosceles  : "+iso);
		System.out.println("Triangulos Escaleno   : "+esca);
		
	}

}
