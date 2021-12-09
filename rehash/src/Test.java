
public class Test {

	public static void main(String[] args) {
		Hash <String> h= new Hash <String> (11);
		h.insert(10, "10");   //10
		h.insert(3, "3");     //2
		h.insert(7, "7");   
		h.insert(5, "5");   
		h.insert(15, "15");  
		h.insert(22, "22");
		System.out.println(h);
		h.insert(33, "33");
		System.out.println(h);
		
		//System.out.println(h.search(5));
		//System.out.println(h.search(22));

	
		//h.remove(10);
		//System.out.println(h);
		//System.out.println(h.metodoCuadrado(7559));
		//System.out.println(h.cantnumeros(7559));
		
		//System.out.println(h.metodoPliegue(3242416));
		//System.out.println(h.metodoPliegue(20123876));
		
	}
}
