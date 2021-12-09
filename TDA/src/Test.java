
public class Test {
	public static void main(String[] args) {
		/*OrderDescLinked <Integer> l= new OrderDescLinked <Integer>();
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
		l.menores(12);*/
		
		/*System.out.println(l);
		System.out.println(l.search(1));
		System.out.println(l.search(10));
		l.insertLast(12);
		System.out.println(l);
		l.remove(2);
		System.out.println("elimino el 2");
		System.out.println(l);
		System.out.println("elimino el 7");
		l.remove(7);
		System.out.println(l);
		l.initializeList();
		System.out.println(l);*/
		
		/*OrderListLinked <Integer> l2= new OrderListLinked <Integer>();
		l2.insert(15);
		System.out.println(l2);
		l2.insert(10);
		System.out.println(l2);
		l2.insert(12);
		System.out.println(l2);
		l2.insert(17);
		System.out.println(l2);
		//l2.remove(10);
		//System.out.println(l2);*/
		
		/*
		OrderListLinked <Person> listpersonas = new OrderListLinked <Person>();
		listpersonas.insert(new Person ("Nikol", "Laz"));
		System.out.println(listpersonas);
		listpersonas.insert(new Person ("A", "C"));
		System.out.println(listpersonas);
		listpersonas.insert(new Person ("K", "Z"));
		System.out.println(listpersonas);
		
		*/
		
		//Stack <Integer> pila= new StackArray <Integer>(5);
		/*StackLink <Integer> pila= new StackLink <Integer>();
		try { //instrucciones dentro del comportamiento
			pila.push(100);
			System.out.println(pila);
			System.out.println("Tope: "+pila.top());
			pila.push(3);
			System.out.println(pila);
			System.out.println("Tope: "+pila.top());
			pila.push(8);
			System.out.println(pila);
			System.out.println("Tope: "+pila.top());
			pila.push(10);
			System.out.println(pila);
			System.out.println("Tope: "+pila.top());
			pila.pop(); 
			System.out.println(pila);
			pila.pop();
			System.out.println(pila);
		}
		catch (ExceptionEmpty e) { //si hay alguna excepcion en el try
			System.out.println(e.getMessage());
		}*/
		
		
		ArrayQueue <Integer> q1= new ArrayQueue <Integer>(5);	
		//LinkedQueue <Integer> q1 = new LinkedQueue <Integer> ();
		try {
			q1.enqueue(2);
			System.out.println(q1);
			q1.enqueue(1);
			System.out.println(q1);
			q1.enqueue(8);
			System.out.println(q1);
			q1.enqueue(9);
			System.out.println(q1);
			q1.dequeue();
			q1.enqueue(29);
			System.out.println(q1);
			q1.dequeue();
			System.out.println(q1);
			System.out.println(q1.front());
			System.out.println(q1.back());
		}
				
		catch (ExceptionEmpty e) { //si hay alguna excepcion en el try
			System.out.println(e.getMessage());
		}
		
		/*QueuePriority <String> q1 = new QueuePriority <String>(3);
		try {
		q1.enqueue("Juan" ,1);
		q1.enqueue("Pablo" ,2);
		q1.enqueue("Maria" ,3);
		q1.enqueue("Luis" ,3);
		q1.enqueue("Rosa" ,2);
		System.out.println(q1);
		System.out.println("eliminado: "+q1.dequeue());
		System.out.println(q1.front());
		System.out.println(q1.back());
		}
		
		catch (ExceptionEmpty e) { //si hay alguna excepcion en el try
			System.out.println(e.getMessage());
		}*/
		
	}
}
