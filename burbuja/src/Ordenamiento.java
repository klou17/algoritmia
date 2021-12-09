import java.util.ArrayList;
import java.util.Scanner;

public class Ordenamiento 
{
	static Scanner sc = new Scanner(System.in);
	public static ArrayList llenado (ArrayList<Integer> array) {
		//int [] array =arreglo;
		//Integer num=0;
		/*for(int i = 0; i < arreglo.length; i++){
			System.out.print("Ingrese valor "+ (i+1)+ " :");
			num = sc.nextInt();
			array[i]=num;
		}
		return array;*/
		
		Integer num =0;
		ArrayList<Integer> arr=array; 
		for (int i=0; i< arr.size(); i++) {
			System.out.print("Ingrese valor "+ (i+1)+ " :");
			num = sc.nextInt();
			arr.add(num);
		}
		return arr;
	}
	
    public static int[] burbuja(int[] arreglo){
    	int[] array= arreglo;
    	for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1; j++) {  
            	if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j + 1];
                    arreglo[j + 1] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
    	}
    	return array;
    }
    
    public static void binaria (int[] arreglo, int val) {
    	for(int i = 0; i < arreglo.length; i++){
    		if (arreglo[i] == val)
    			System.out.print("elemento encontrado ");
    		else 
    			System.out.print("elemento no encontrado ");	
    	}
    }
    

	public static void main(String[] args) 
    {
    	//Scanner sc = new Scanner(System.in);
		//System.out.print("Cantidad de elementos: ");
		//int nele = sc.nextInt();
		//int []  arreglo = new int[3];
		ArrayList arr= new ArrayList(3);
		ArrayList a=arr;
		a = llenado (arr);
		arr.toString();
		//int [] arregloOrdenado = burbuja(arreglo);
		//System.out.print(arregloOrdenado);
		//System.out.print("Valor a buscar: ");
		//int val = sc.nextInt();
		//binaria (arregloOrdenado,val);
    }
}
