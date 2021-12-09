import java.util.ArrayList;

public class TestPrincipal {

	public static void main(String[] args) {
		/*PorPagar [] objPorPagar= new PorPagar[4];
		PorPagar f1 = new Factura ("1", "Artic 1", 10, 2.30);
		Factura f2 = new Factura ("2", "Artic 2", 5, 8.2);
		
		PorPagar e1= new EmpleadoAsalariado ("Juan", "Torres", "CQ34", 1000);
		EmpleadoAsalariado e2=new EmpleadoAsalariado ("Maria", "Luque", "CQ35", 1000);
		
		objPorPagar [0]=f1;
		objPorPagar [1]=f2;
		objPorPagar [2]=e1;
		objPorPagar [3]=e2;
		
		for (PorPagar obj : objPorPagar)
			System.out.println(obj+" Pago: "+ obj.obtenerMontoPago());
		///	
		System.out.println("Factura: "+f1.obtenerMontoPago());
		System.out.println(f1);
		////
		
		//System.out.println("Empleado: $"+f2.obtenerMontoPago());
		System.out.println(e1); */
		
		ArrayList <Caja <Producto>> listaProd = new ArrayList <Caja<Producto>>();
		listaProd.add(new Caja<Producto>(new Producto("lampa","China", 200)));
		listaProd.add(new Caja<Producto>(new Producto("ladrillo","China", 50)));
		listaProd.add(new Caja<Producto>(new Producto("cemento","China", 250)));
		listaProd.add(new Caja<Producto>(new Producto("paleta","India", 30)));
		listaProd.add(new Caja<Producto>(new Producto("tiner","China", 20)));
		
		ArrayList <Caja <Producto>> procedencia = new ArrayList <Caja<Producto>>();
		procedencia.add(new Caja<Producto>(new Producto("case","China", 200)));
		procedencia.add(new Caja<Producto>(new Producto("celular","China", 50)));
		procedencia.add(new Caja<Producto>(new Producto("silla","Peru", 250)));
		procedencia.add(new Caja<Producto>(new Producto("mesa","China", 30)));
		procedencia.add(new Caja<Producto>(new Producto("cargador","Chile", 20)));
		System.out.println("Productos de China");
		buscaProcedencia(listaProd, procedencia,"China");
		
		
		ArrayList <String> cadenas = new ArrayList <String>();
		cadenas.add("zampa");
		cadenas.add("ladrillo");
		cadenas.add("cemento");
		cadenas.add("paleta");
		cadenas.add("tiner");
		//System.out.print("Cadena mayor:");
		//System.out.println(mayorElemento(cadenas));
		
		ArrayList <Producto> productos = new ArrayList <Producto>();
		productos.add(new Producto("lampa","China", 200));
		productos.add(new Producto("ladrillo","China", 50));
		productos.add(new Producto("Cemento","China", 250));
		productos.add(new Producto("paleta","China", 30));
		productos.add(new Producto("tiner","China", 20));
		//System.out.print("Producto de mayor precio: ");
		//System.out.println(mayorElemento(productos).getDescripcion());
	}
	
	public static <T extends Comparable <T>> void buscaProcedencia(ArrayList<Caja <Producto>> listaProd, ArrayList<Caja <Producto>> procedencia,String pais) {
		listaProd.addAll(procedencia);

		for (int i=0; i<listaProd.size(); i++) {
			if (listaProd.get(i).dame().getProcedencia() != pais)
				listaProd.remove(i); 
		}
		
		for (int i=0; i<listaProd.size();i++)
			System.out.println(listaProd.get(i).dame().getDescripcion());
		}
	
	public static <T extends Comparable <T>> T mayorElemento(ArrayList<T> arreglo){
		T max = arreglo.get(0);
		for (T obj: arreglo ) {
			if (obj.compareTo(max) > 0)
				max=obj;		
		}
		return max;
	}
	
	public static <T> boolean buscaElemento (ArrayList<T> arreglo, T elemento){
		T busEle = arreglo.get(0);
		boolean a= true;
		if (busEle instanceof Factura) {
			for (T obj: arreglo) {
				if (elemento.equals(((Factura) obj).getNumeroPieza()))
					a= true;
			}
		} else a= false;
		
		if (busEle instanceof Empleado) {
			for (T obj: arreglo) {
				if (elemento.equals(((Empleado) obj).getApellidoPaterno()))
					a= true;
			}
		} else a=false;
		
		return a;
	}
	
	//método genérico imprime elementos guardados en cajas almacenadas en un ArrayList
	public static <T extends Comparable<T>> void imprime (ArrayList <T> b) {
		System.out.println(b);
	}

}
