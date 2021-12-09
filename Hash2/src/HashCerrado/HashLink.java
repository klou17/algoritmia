package HashCerrado;

import java.util.ArrayList;

import listas.ListLinked;
import listas.Node;
import register.Register;

public class HashLink <E> {
	protected class Element{
		protected int mark;
		protected Register<E> reg;
		protected ListLinked<Register<E>> list;
		protected int dresH;

		public Element(int mark, Register<E> reg, int dresH) {
			this.mark = mark;
			this.reg = reg;
			this.dresH = dresH;
			this.list = new ListLinked<Register<E>>();
		}
		public String toString() {
			String str = " ";
			if(this.mark == 1) {
				str += this.dresH + "\t"+this.reg.toString();
				if(!this.list.isEmpty())
					str += "\t" + this.list.toString();
				else
					str += "\tlist Empty";
			}
			else
				str += "empty";
			return str;
		}
		
	}
		protected ArrayList<Element> table;
		protected int m;
		
		public HashLink(int n) {
			this.m = esPrimo(n);
			this.table = new ArrayList<Element>(m);
			for(int i=0;i<m;i++)
				this.table.add(new Element(0, null, -1));
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
		
		private int functionHash(int key) {
			return key%m;
		}
		
		public void insert(int key, E reg) {
			Register<E> newReg = new Register<E>(key,reg);
			int dressHash = functionHash(key);
			if(table.get(dressHash).mark == 0) {
				table.set(dressHash, new Element (1, newReg,dressHash));
			}
			else {
				if (!this.table.get(dressHash).reg.equals(newReg))
					if(!this.table.get(dressHash).list.search(newReg)) //da falso 
						this.table.get(dressHash).list.insertFirst(newReg);
					else
						System.out.println("Key is duplicated");
				else
					System.out.println("Key is duplicated");
			}
		}

		public E search(int key) {
			int dressHash = functionHash(key);
			if (table.get(dressHash).mark == 1)
				if (this.table.get(dressHash).list.getHead() == this.table.get(dressHash).reg.getReg())
					return this.table.get(dressHash).reg.getReg();
		}
		public void remove(int key) {
			int dressHash = functionHash(key);
			//table.get(dressHash).mark = 0;
			//table.get(dressHash).reg = null;
			if (table.get(dressHash).mark == 1)

		}
		
		public String toString() {
			String s = "D.Real\tD.Hash\tRegister \n";
			int i=0;
			for(Element item : table) {
				s+= (i++) + "-->\t"+item.toString()+"\n";
			}
			return s;
		}
}

