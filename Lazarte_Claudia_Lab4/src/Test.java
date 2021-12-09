
public class Test {
	public static void main(String[] args) {
		OrderDescLinked <Integer> l= new OrderDescLinked <Integer>();
		//ListArray <Integer> l= new ListArray <Integer>(4);
		l.insert(9);
		System.out.println(l);
		l.insert(8);
		System.out.println(l);
		l.insert(1);
		System.out.println(l);
		l.insert(12);
		System.out.println(l);
		l.insert(17);
		System.out.println(l);
		l.menores(12);
		System.out.println("");
		
		OrderDescLinked <Person> listpersonas = new OrderDescLinked <Person>();
		Person p= new Person ("AAA", "P");
		listpersonas.insert(new Person ("Nikol", "A"));
		System.out.println(listpersonas);
		listpersonas.insert(new Person ("Ale", "C"));
		System.out.println(listpersonas);
		listpersonas.insert(new Person ("Juan", "Z"));
		System.out.println(listpersonas);
		listpersonas.insert(new Person ("Paola", "P"));
		System.out.println(listpersonas);
		listpersonas.menores(p);
	}

}
