package hashAbierto;
import java.util.ArrayList;

import register.Register;


//almacena registros

public class Hash <E extends Comparable<E>>{

	protected class Element  { //encapsula marca posicion y registro
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
	
	protected ArrayList <Element> table; //almacena elementos (registros y marca)
	protected int m;  //tamaño tabla
	protected int count;
	
	public Hash (int n) {
		this.m = esPrimo(n) ; //calcula primo cercano a n 
		this.table = new ArrayList <Element> (m);
		for (int i = 0; i < m; i++) { // se inserta elementos vacios en tabla
			this.table.add(new Element (0,null));
		}
		this.count = 0;
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
	
	public int metodoPliegue(int key) { //suma 
		int mul = 0;
		int cnat = cantnumeros (key)/2 -1;
		int s= (int) Math.pow (10, cnat);
		while (key != 0) {
			mul = mul + (key % s);
            key = key / s;
        }
		return mul;
	}
	
	public int metodoCuadrado(int key) {
		int cuadr = key * key;
		int cnat = cantnumeros (cuadr); //4
		String chars = String.valueOf(cuadr); //57138481
		chars = String.valueOf(chars.charAt(cnat/2-1)) + String.valueOf(chars.charAt(cnat/2));
		int num = Integer.valueOf(chars);
		return num; //38
	}
	
	public int cantnumeros(int num) {
		int digitos = 0;
		while (num !=0) {
			num = num/10;
			digitos++;
		}
		return digitos;
	}
	
	protected int linearProbing(int dressHash, int key) {
		int posInit = dressHash;
		do{
			if (table.get(dressHash).mark == 0) //get devuelve elemento guardado en esa posicion
				return dressHash; //la posicion esta vacia y devuelve lo mismo 
			if (table.get(dressHash).mark == 1 && table.get(dressHash).reg.getKey() == key)
				return -1; //duplicado
			dressHash = (dressHash + 1) % m; // se mueve sgte posicion 
		}while (dressHash != posInit);
		
		return -1;
		//return -2; //no hay espacio disponible, tabla llena
		//-2: hacer rehashing, cambiar valor
	}
	
	protected int linear(int dressHash, int key) {
		int posInit = dressHash;
		do{
			if (table.get(dressHash).mark == 0) //get devuelve elemento guardado en esa posicion
				return -1; 
			if (table.get(dressHash).mark == 1 && table.get(dressHash).reg.getKey() == key)
				return dressHash; 
			dressHash = (dressHash + 1) % m; // se mueve sgte posicion 
		}while (dressHash != posInit);
		
		return -1;
	}
	
	public void insert (int key, E reg) { //inserta registro y clave
		int dressHash = functionHash(key);
		//dressHash = linearProbing(dressHash,key); //resolucion de colisiones
		dressHash = cuadratic (dressHash,key);
		if (dressHash == -1) { //clave duplicada
			System.out.println("key is duplicated ");
			return; 
		}
		else {
			Element aux = new Element (1, new Register<E>(key,reg)); //marca llena lo ingresa
			table.set(dressHash, aux); //inserta en direccion dresshash el aux
			this.count ++;
			
			if (calculoFC() > 0.8) {
				this.m = 2*m;
				this.table = ampliarCont();
			}
				
		}
	}
	
	protected int cuadratic (int dressHash, int key) {
		int posInit = dressHash;
		int i = 1;
		int d = i*i;
		do{
			if (table.get(dressHash).mark == 0) //get devuelve elemento guardado en esa posicion
				return dressHash; //la posicion esta vacia y devuelve lo mismo 
			if (table.get(dressHash).mark == 1 && table.get(dressHash).reg.getKey() == key)
				return -1; //duplicado
			dressHash = (dressHash + d) % m; // se mueve sgte posicion 
			i++;
		}while (dressHash != posInit);
		
		return -1;
	}
	
	protected int cuadr (int dressHash, int key) {
		int posInit = dressHash;
		int i = 1;
		int d = i*i;
		do{
			if (table.get(dressHash).mark == 0) //get devuelve elemento guardado en esa posicion
				return -1; //la posicion esta vacia y devuelve lo mismo 
			if (table.get(dressHash).mark == 1 && table.get(dressHash).reg.getKey() == key)
				return dressHash ; //duplicado
			dressHash = (dressHash + d) % m; // se mueve sgte posicion 
			i++;
		}while (dressHash != posInit);
		
		return -1;
	}
	
	
	public float calculoFC() {
		float d = (float) this.count / this.m;
		return d;
	}
	
	public ArrayList <Element> ampliarCont (ArrayList <Element> array) { 
		ArrayList <Element> newTable = new ArrayList <Element> (this.m);
		ArrayList <Element> copia = array;
		for (Element item : newTable) {
			item = new Element (0,null);
			newTable.add(item);
		}
		for (Element item : copia) {
			if (item.reg != null)
				this.insert(item.reg.getKey(), item.reg.getReg());
		}
		return newTable;
	}
	
	public E search (int key) {
		int dressHash = functionHash(key);
		//dressHash = linear(dressHash, key);
		dressHash = cuadr(dressHash, key);
        if (dressHash != -1) 
        	return this.table.get(dressHash).reg.getReg();
        else {
        	System.out.println("elemento no encontrado");
        	return null;
        }
	}

	public void remove (int key)  { //mark tiene que volverse 0
		int dressHash = functionHash(key);
		dressHash = linear(dressHash, key); 
        table.get(dressHash).setMark(0); //va a la posicion y vuelve cero mark y reg
        table.get(dressHash).setReg(null);
	}
	
	@Override
	public String toString() {
		String s= "D.Real\tD.Hash\tRegister\n"; //dhash=%
		int i=0;
		for (Element item : table) {
			s+= (i++)+ " -->\t"; //muestra dir real
			if  (item.mark == 1)
				s+=functionHash(item.reg.getKey()) + "\t"+ item.reg.toString() + "\n";
				//item es element, element jala registro (reg)
			else
				s+="empty\n ";
		}
		return s;
	}
}
