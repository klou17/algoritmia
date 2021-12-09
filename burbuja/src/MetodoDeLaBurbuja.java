import java.util.Scanner;

public class MetodoDeLaBurbuja 
{
	static Scanner sc = new Scanner(System.in);
	public static int[] llenado (int[] arreglo) {
		int [] array =arreglo;
		for(int i = 0; i < arreglo.length; i++){
			System.out.print("Ingrese valor "+ (i+1)+ " :");
			array[i]= sc.nextInt();
		}
		return array;
	}
    public static int[] burbuja(int[] arreglo)
    {
      int auxiliar;
      int[] arregloOrdenado;
      for(int i = 2; i < arreglo.length; i++)
      {
        for(int j = 0;j < arreglo.length-i;j++)
        {
          if(arreglo[j] > arreglo[j+1])
          {
            auxiliar = arreglo[j];
            arreglo[j] = arreglo[j+1];
            arreglo[j+1] = auxiliar;
          }   
        }
      }
      arregloOrdenado = arreglo;
      return arregloOrdenado;
    }
    
    public static int[] insercionDirecta(int arr[]){                                            
    	int[] array=arr;
    	int j, aux;
    	for (int p = 1; p < array.length; p++){ // desde el segundo elemento hasta
        	aux = array[p];           // el final, guardamos el elemento y
        	j = p - 1;            // empezamos a comprobar con el anterior
        	while ((j >= 0) && (aux < array[j])){ // mientras queden posiciones y el                                
        									// valor de aux sea menor que los
        		array[j + 1] = array[j];   // de la izquierda, se desplaza a
        		j--;               // la derecha
        	}
        	array[j + 1] = aux;       // colocamos aux en su sitio
        }
    	return array;
    }
    
    
    public static int binariaRecur(int[] arreglo, int valor){
		return binariaRecur(arreglo, valor, 0, arreglo.length-1);
	}
		
	private static int binariaRecur(int[] arreglo, int valor, int inf, int sup){
		int mitad = (inf+sup)/2;
		if ((inf >= sup) && (arreglo[inf] != valor))
			return -1;
		else if (arreglo[mitad] == valor)
			return mitad;
		else if (valor > arreglo[mitad])
			return binariaRecur (arreglo, valor, mitad+1, sup);
		return binariaRecur (arreglo, valor, inf, mitad-1);
	}
    
    public static void print (int[] arreglo) {
    	for(int i = 0; i < arreglo.length; i++){
    		System.out.print(arreglo[i] + " ");
    	}
    }
    
    public static void main(String[] args) {
		//int[] arregloOrdenado = burbuja(llenado(new int[5]));
		int[] arregloOrdenado = insercionDirecta(llenado(new int[5]));
		print (arregloOrdenado);
		System.out.print("Valor a buscar: ");
		int val = sc.nextInt();
		int b= binariaRecur (arregloOrdenado,val);
		if (b != -1)
			System.out.print("encontrado");
		else
			System.out.print("no encontrado");
    }
}