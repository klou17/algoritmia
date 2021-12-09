import diccionario.*;
import excepciones.*;

public class TestDictionary {

	public static void main(String[] args) {
		//BSTree <Integer> b= new BSTree <Integer>();
		BSTDictionary<String,String> b= new BSTDictionary<String,String> ();
		BSTDictionary<Integer,String> x= new BSTDictionary<Integer,String> ();
		BSTDictionary<Integer,Person> z= new BSTDictionary<Integer,Person> ();
		Person p1 = new Person("Nikol", "Lazarte", "Los Arces 12", 97473832);
		Person p2 = new Person("Josue", "Alvaz", "Peru 34",974733484);
		Person p3 = new Person("Nicolas", "Ticona", "Puno 78", 3733892);
		Person p4 = new Person("Jose", "Gomez", "Los Arboles 134", 3837727);	
		Person p5 = new Person("Ale", "Zuñia", "Los Rojos 98",9732939);
		try {
			b.insert("ONU", "Org. Naciones Unidas");
			b.insert("MINSA", "Min. de Salud");
			b.insert("SUNEDU", "Superintendencia Nacional de Educación Superior Universitaria");
			b.insert("EPIS", "Escuela Sistemas");
			b.insert("OMS", "Org. Mundial de la Salud");
			b.insert("UCSM", "Universidad Catolica Sta Maria");
			b.insert("IPPS", "Instituto Peruano de Seguridad Social");
			b.insert("MINEDU", "Ministerio de Educacion");
			b.insert("INDECI", "Instituto Nacional de Defensa Civil");
			b.insert("PNP", "Policia Nacional del Peru");
			//System.out.println(b);
			System.out.println(b.search("MINEDU"));
			//b.remove("MINSA");
			//System.out.println(b);
			
			x.insert(30, "Julio");
			x.insert(10, "Rosa");
			x.insert(45, "Manuel");
			x.insert(4, "Percy");
			x.insert(15, "Juan");
			x.insert(23, "Faby");
			x.insert(38, "Catalina");
			//System.out.println(x);
			
			z.insert(762892365, p1);
			z.insert(276692365, p2);
			z.insert(162892365, p3);
			z.insert(566768365, p4);
			z.insert(462892000, p5);
			System.out.println(z);
		
			
		}

		catch (ItemDuplicated e ) { 
			System.out.println(e.getMessage());
		}
		
		
		catch (ItemNotFound e) { 
			System.out.println(e.getMessage());
		}
	}

}
