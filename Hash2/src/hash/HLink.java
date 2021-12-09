package hash;

import java.util.ArrayList;

import listas.ListLinked;
import register.Register;

public class HLink <E extends Comparable <E>> {
	protected class Element { //encapsula marca posicion y registro
		protected int mark; //0:vacia  1:llena  si esta ocupado o no
		protected Register <E> reg;
		
		public Element (int mark, Register <E> reg) {
			this.mark = mark; //1: posible colision
			this.reg = reg;
		}

		public int getMark() { return mark; }
		public void setMark(int mark) { this.mark = mark; }
		public Register<E> getReg() { return reg; }
		public void setReg(Register<E> reg) { this.reg = reg; }
	}
	
	private ArrayList <ListLinked <Element>> table;
	private int m;  //tamaño tabla
	
	public HashLink(int n) {
		this.m = esPrimo(n) ; //calcula primo cercano a n 
		this.table = new ArrayList <ListLinked <Element>> (m);
		for (int i = 0; i < m; i++) { // se inserta elementos vacios en tabla
			this.table.add(new ListLinked ());
		}
	}
	
	private boolean primo(int numero){
		int cont = 2;
		boolean primo=true;
		while ((primo) && (cont!=numero)){
			if (numero % cont == 0)
				primo = false;
			cont++;
			}
		return primo;
	}
	
	
	protected int esPrimo(int primo) {
		boolean num = primo(primo);
		if (num) { return primo; }
		else {return esPrimo(primo+1);}
	}
	
	protected int functionHash(int key) {
		return key % m;
	}
	
	
	public void insert (int key, E reg) {
		int dressHash = functionHash(key);
		Element aux = new Element (1, new Register<E>(key,reg));
		table.get(dressHash).insertLast(aux); //entra en orden
		return;
	}
	
	
	public String toString() {
		String s= "D.Real\tD.Hash\tRegister\n"; //dhash=%
		return s;
	}
 
}
