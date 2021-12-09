
import HashCerrado.HashLink;
import hashAbierto.Hash;


public class Test {

	public static void main(String[] args) {
		Hash <String> h= new Hash <String> (15); //17
		h.insert(10, "Carlos Lopez");  
		h.insert(3, "Juan fern");     
		h.insert(7, "rosa fernan");   
		h.insert(5, "Paty Vazquez");   
		h.insert(15, "maria paredes");  
		h.insert(22, "sofia arenas");
		h.insert(24, "ale zu");
		h.insert(8, "pow pow");
		h.insert(39, "julio guzman");
		System.out.println(h);

		System.out.println(h.search(5));
		System.out.println(h.search(22));
		System.out.println(h.search(39));
		System.out.println(h.calculoFC());
		
		
		
		
				//System.out.println(h.calculoFC());
	
		//h.remove(10);
		//System.out.println(h);
		//System.out.println(h.metodoCuadrado(7559));
		//System.out.println(h.cantnumeros(7559));
		
		//System.out.println(h.metodoPliegue(3242416));
		//System.out.println(h.metodoPliegue(20123876));
		
	}
}
