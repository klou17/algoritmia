import excepcion.ExceptionEmpty;
import lista.ListArray;
import lista.ListLinked;
import lista.ListTDA;
import lista.OrderListLinked;
import node.Node;
import stack.Stack;
import stack.StackArray;
import stack.StackLink;

public class Test {
	public static void main(String[] args) {
		/*ListLinked <Integer> l= new ListLinked <Integer>();
		l.insertFirst(5);
		System.out.println(l);
		l.insertFirst(10);
		System.out.println(l);
		l.insertFirst(2);
		System.out.println(l);
		l.insertFirst(7);
		System.out.println(l);
		l.insertLast(12);
		System.out.println(l);
		l.remove(2);
		System.out.println("elimino el 2");
		System.out.println(l);
		System.out.println("elimino el 7");
		l.remove(7);
		System.out.println(l);*/
		
		OrderListLinked <Integer> l2= new OrderListLinked <Integer>();
		l2.insert(5);
		System.out.println(l2);
		l2.insert(7);
		System.out.println(l2);
		l2.insert(2);
		System.out.println(l2);
		l2.insert(0);
		System.out.println(l2);
		//l2.remove(2);
		//System.out.println("elimino el 2");
		//System.out.println(l);
		
		/*
		Stack <Integer> pila= new StackArray <Integer>(5);
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
			pila.pop(); //elimina 10
			System.out.println(pila);
			pila.pop();
			System.out.println(pila);
		}
		
		catch (ExceptionEmpty e) { //si hay alguna excepcion en el try
			System.out.println(e.getMessage());
		}*/
		
		/*StackLink <Integer> pila2= new StackLink <Integer>();
		pila2.push(100);
		System.out.println(pila2);
		try { //instrucciones dentro del comportamiento
			/*pila2.push(100);
			System.out.println(pila2);
			System.out.println("Tope: "+pila2.top());
			pila2.push(3);
			System.out.println(pila2);
			System.out.println("Tope: "+pila2.top());
			pila2.push(8);
			System.out.println(pila2);
			System.out.println("Tope: "+pila2.top());
			pila2.push(10);
			System.out.println(pila2);
			System.out.println("Tope: "+pila2.top());
			pila2.pop(); //elimina 10
			System.out.println(pila2);
			pila2.
			pila2.pop();
			pila2.push(100);
			System.out.println(pila2);
		}
		
		catch (ExceptionEmpty e) { //si hay alguna excepcion en el try
			System.out.println(e.getMessage());
		}*/
		
	}

}
