import java.util.Scanner;
public class Maxi {
	public static void main (String[] args) { 	
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese cantidad de elementos: ");
		int nele = sc.nextInt();
		int[]  array = new int[nele];
		for (int i=0; i<nele; i++){
			System.out.print("Ingrese valor: ");
			int num = sc.nextInt();
			array[i]=num;
		}
		int a=0,m=0;
		while (a<nele){
			if (array[a]>m)
			m = array[a]; 
			++a; 
		}
		System.out.println("Maximo: "+ m);
	}
}
