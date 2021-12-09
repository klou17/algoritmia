
import HashCerrado.HashLink;
import hashAbierto.Hash;


public class Test {

	public static void main(String[] args) {
		HashLink <String> h= new HashLink <String> (15);
		//try {
		h.insert(10, "Carlos Lopez");  
		h.insert(3, "Juan fern");     
		h.insert(7, "rosa fernan");   
		h.insert(5, "Paty Vazquez");   
		h.insert(15, "maria paredes");  
		h.insert(22, "sofia arenas");
		h.insert(25, "juan marquez");
		h.insert(10, "sofia arenas");
		System.out.println(h);
		System.out.println(h.search(5));
		System.out.println(h.search(22));
		h.remove(5);
		System.out.println(h);
	
		//h.remove(10);
		//System.out.println(h);
		//System.out.println(h.metodoCuadrado(7559));
		//System.out.println(h.cantnumeros(7559));
		
		//System.out.println(h.metodoPliegue(3242416));
		//System.out.println(h.metodoPliegue(20123876));
		
	}
}
