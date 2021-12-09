
public class Test {

	public static void main(String[] args) {
		ListLinked <Integer> l= new ListLinked <Integer>();
		l.insertFirst(9);
		l.insertFirst(8);
		l.insertFirst(1);
		System.out.println(l);
		l.copiar();
		System.out.println(l);
	}

}
