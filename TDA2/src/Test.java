
import colas.ArrayQueue;
import colas.DobleQueue;
import colas.LinkedQueue; 
import colas.Queue;
import colas.QueuePriority;
import excepcion.ExceptionEmpty;
import listas.ListArray;
import listas.ListLinked;
import listas.ListTDA;
import listas.OrderDescLinked;
import listas.OrderListLinked;
import person.Person;
import stacks.Stack;
import stacks.StackArray;
import stacks.StackLink;

public class Test {
	public static void main(String[] args) {
		//OrderDescLinked <Integer> l= new OrderDescLinked <Integer>();
		/*ListArray <Integer> l= new ListArray <Integer>(3);
		l.insertFirst(9);
		System.out.println(l);
		l.insertFirst(8);
		System.out.println(l);
		l.insertFirst(1);
		System.out.println(l);*/
		
		//Polaca a= new Polaca();
		//System.out.println(a.polaca("(2+5)-(7+4^9)*2"));
		
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
		/*StackLink <Object> pila= new StackLink <Object>();
		try { //instrucciones dentro del comportamiento
			//pila.push(new Integer (10));
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
		}
		
		
		
			
		
		//ArrayQueue <Integer> q1= new ArrayQueue <Integer>(5);	
		//LinkedQueue <Integer> q1 = new LinkedQueue <Integer> ();
		DobleQueue <Integer> q1 = new DobleQueue <Integer> ();
		try {
			q1.agregarFinal(5);
			System.out.println(q1);
			q1.agregarFinal(3);
			System.out.println(q1);
			q1.agregarFrente(10);
			System.out.println(q1);
			q1.agregarFrente(13);
			System.out.println(q1);
			q1.agregarFinal(2);
			System.out.println(q1);
			q1.removerFrente();
			System.out.println(q1);
			q1.removerFinal();
			System.out.println(q1);
			System.out.println("Frente:" + q1.front());
			System.out.println("Final: " + q1.back());
			System.out.println("Tamano: " +q1.tamano());
		}
				
		catch (ExceptionEmpty e) { //si hay alguna excepcion en el try
			System.out.println(e.getMessage());
		}

        System.out.println("++++++++++++++++++++++");
		 Queue<Character> q = new LinkedQueue<Character>();
		 try {
			 for (int i= 65; i<74; i++)

                 q.enqueue((char)i);

           System.out.println("a:"+q.dequeue());           //A

           q.dequeue();

           q.enqueue('e');
           
           System.out.println("b:");
           q.enqueue((char)(100+5));                    //B

           System.out.println("c:"+q.front());                 //C

           System.out.println("d:"+q.back());                  //D

           System.out.println(q.dequeue());

           while( !q.front().equals((char)70))

                 System.out.println(q.dequeue());

           System.out.println("e: "+q.front());                   //E

           System.out.println("f: "+q.back());                   //F
		 }
			
			catch (ExceptionEmpty e) { //si hay alguna excepcion en el try
				System.out.println(e.getMessage());
		} */
		
		QueuePriority <String> q1 = new QueuePriority <String>(3);
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
		}
		
	}
}

