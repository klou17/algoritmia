import excepciones.*;

public class TestAVL {
	public static void main(String[] args) {
		AVL <Integer> b= new AVL <Integer> ();
		try {
			b.insert(20);
			System.out.println(b);
			b.insert(11);
			System.out.println(b);
			b.insert(38);
			System.out.println(b);
			b.insert(6);
			System.out.println(b);
			b.insert(18);
			System.out.println(b);
			b.insert(26);
			System.out.println(b);
			b.insert(45);
			System.out.println(b);
			b.insert(14);
			System.out.println(b);
			b.insert(31);
			System.out.println(b);
			b.insert(43);
			System.out.println(b);
			b.insert(52);
			System.out.println(b);
			b.insert(40);
			System.out.println(b);
			b.insert(29);
			System.out.println(b);
			b.insert(57);
			System.out.println(b);
			b.insert(48);
			System.out.println(b);
			b.insert(12);
			System.out.println(b);
			b.insert(47);
			System.out.println(b);
			b.remove(20);
			System.out.println(b);
		}
		
		catch (ItemDuplicated e ) { //si hay alguna excepcion en el try
			System.out.println(e.getMessage());
		} 
		catch (ItemNotFound e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
