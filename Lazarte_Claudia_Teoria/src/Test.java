import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		//Aquí se debe definir un contenedor (ArrayList) de objetos Impuesto
		
		ArrayList <Impuesto> ArrayList = new ArrayList<Impuesto>();
		ArrayList.add(new Factura ("libro", 7, 200.5));
		ArrayList.add(new Factura("cuaderno", 2, 8));
		ArrayList.add(new Inmueble("Calle Peru 12", 3, 700000));
		ArrayList.add(new Inmueble("Calle Peru 13", 3, 500000));

		System.out.println("mayorImpuesto: ");
		System.out.println(mayorImpuesto(ArrayList));
		
		System.out.println("montoTotal: ");
		System.out.println(montoTotal(ArrayList));
		
			
		/* Aquí se debe de implementar el método genérico
 			mayorImpuesto
 		que devuelva el inmueble por el que el propietario paga mas impuestos*/
		
		/* Aquí se debe de implementar el método genérico
			montoTotal
 		que devuelva el monto total de impuestos pagados de los objetos Impuesto
		 */
	}
	
	public static <T extends Impuesto <T>> Impuesto <T> mayorImpuesto(ArrayList<T> arreglo){
		T max = arreglo.get(0);
		for (int i=0; i<arreglo.size(); i++ ) {
			if (arreglo.get(i) instanceof Impuesto) {
				if (arreglo.get(i).devImpuesto() > max.devImpuesto())
					max=arreglo.get(i);
				
			}	
		}
		return max;
	}
	
	public static < T extends Impuesto <T>> double montoTotal(ArrayList<T> arreglo){
		double a=0;
		for (T x:arreglo)
			a+=x.devImpuesto();
		return a;
	}
	
}
