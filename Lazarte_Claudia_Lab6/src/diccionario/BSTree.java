package diccionario;
import java.util.*;

import excepciones.ItemDuplicated;
import excepciones.ItemNotFound;
import stacks.ExceptionEmpty;
import stacks.StackLink;

public class BSTree<E extends Comparable<E>> {
	class Node {
		protected E data;
		protected Node left, right;
			
		public Node(E data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
		public Node(E data) {
			this (data,null,null);
		}
		
		public String toString() {
			return this.data.toString();
		}
		
	}
	
	private Node root;
	private int cant;
	
	public BSTree(){ 
		this.root = null; 
	}
	
	public boolean isEmpty(){ 
		return this.root == null; 
	}
	
	public void insertRecu(E ele) throws ItemDuplicated {
		this.root = insertRecu(ele, root);
	}
	
	private Node insertRecu(E ele, Node raiz) throws ItemDuplicated {
		Node res = raiz;
		if (raiz == null) 
			res = new Node(ele);
		else	{ //buscamos el lugar para inserción
			int resC = raiz.data.compareTo(ele);
			if (resC == 0 ) 
				throw new ItemDuplicated(ele + "esta duplicado");
			if (resC < 0) 
				res.right = insertRecu(ele, raiz.right);
			else
				res.left = insertRecu(ele, raiz.left);
		}
		return res;
	}
	
	public void insertIte (E ele) {
		if (this.isEmpty())
			this.root = new Node (ele);
		else { //por lo menos un nodo
			Node pad= null;
			Node aux = this.root;
			while (aux != null && !aux.data.equals(ele)) { 
				//mientras que ese nodo exista
				//equals para no ingresar elementos iguales
				
				pad=aux; //como no puedo regresar padre se queda con valor
				if (aux.data.compareTo(ele) > 0)
					aux= aux.left; //aux es al izuqierdo por ser mayor
				else
					aux = aux.right;
				}
			if (aux != null) { //sali del while porque elemento esta duplicado
				System.out.println(ele + " Elemento duplicado");
				return;
			}
			
			Node nuevo= new Node(ele);
			if (pad.data.compareTo(ele)> 0) //padre mayor que el ele se va izq
				pad.left= nuevo;
			else
				pad.right = nuevo;
			}		
	}

	public E search(E x) throws ItemNotFound {
		Node res = search(x, root);
		if(res == null)
			throw new ItemNotFound ("El dato "+ x + "no esta");
		return res.data;
	}
	
	private Node search (E x, Node n) {
		if (n == null) 
			return null;
		else {
			int resC = n.data.compareTo(x);
			if (resC < 0) 
				return search(x, n.right);
			else {
				if (resC > 0) 
					return search(x, n.left);
				else 
					return n;
			}
		}
	}
	
	public E minRecover() { //min elemento
		E min= minRecover(this.root).data;
		return min;
	}
	
	private Node minRecover(Node nodo) { //min elemento respaldo
		if (nodo != null)
			while (nodo.left != null)
				nodo = nodo.left;
		return nodo;
	}
	
	public E minRemove() {
		E min = minRecover();
		this.root = minRemove(this.root);
		return min;
	}
		
	private Node minRemove(Node actual) {
		if (actual.left != null) //buscamos el minimo
			actual.left= minRemove(actual.left);
		else //eliminamos el minimo
			actual = actual.right;
		return actual;
	}
	
	public E maxRecover() { //max elemento
		E max= maxRecover(this.root).data;
		return max;
	}
	
	private Node maxRecover(Node nodo) { //max elemento respaldo
		if (nodo != null)
			while (nodo.right != null)
				nodo = nodo.right;
		return nodo;
	}
	
	public E maxRemove() {
		E max = minRecover();
		this.root = maxRemove(this.root);
		return max;
	}
		
	private Node maxRemove(Node actual) {
		if (actual.right != null) //buscamos el max en derecha
			actual.right = maxRemove(actual.right);
		else //eliminamos el minimo
			actual = actual.left;
		return actual;
	}
	
	public void remove(E ele) throws ItemNotFound {
		this.root = remove(ele, this.root);
	}
	
	protected Node remove(E ele, Node nodo) throws ItemNotFound {
		Node res = nodo;
		if (nodo == null) 
			throw new ItemNotFound(ele + "no esta");
		int resC = nodo.data.compareTo(ele);
		if (resC > 0) 
			res.left=remove(ele,nodo.left);
		else { 
			if (resC < 0) 
				res.right=remove(ele,nodo.right);
			else {
				if (nodo.left !=null && nodo.right !=null) {
					res.data= minRecover(nodo.right).data;
					res.right= minRemove(nodo.right);
				}
				else
					res = (nodo.left != null) ? nodo.left : nodo.right;
			}
		}
		return res;
	}
	
	public int alturaTotal() {
        return alturaTotal(this.root);
    }
	 
	private int alturaTotal(Node raiz) {
        if (raiz == null) 
            return -1;
        else 
            return (1 + Math.max(alturaTotal(raiz.left), alturaTotal(raiz.right)));  
    }
	
	public int alturaX(E ele) throws ItemNotFound{
        return alturaX(ele,this.root);
    }
	
	private int alturaX (E ele, Node nodo) throws ItemNotFound {
		int  height=0;
		if(nodo == null)
			throw new ItemNotFound ("El dato "+ ele + " no esta");
		else {
			if (nodo.left != null)
                height = alturaX(ele,nodo.left);
 
            if (nodo.right != null)
                height = alturaX(ele,nodo.right);
            height++;
        }
        return height;	
    }
	
	public int nroNodos() {
		return nroNodos(this.root);
	}
	
	private int nroNodos(Node raiz) {
		if (raiz==null)
			return 0;
		else
			return (1+ nroNodos(raiz.left)+ nroNodos(raiz.right));	
	}
	
	public int area() {
		return this.nroNodos()*this.alturaTotal();
	}
	
	public int nroHojas() {
		cant=0;
		nroHojas(this.root);
		return cant;
	}
	
	private void nroHojas(Node raiz) {
		if(raiz!=null) {
			if(raiz.left==null && raiz.right==null)
				cant++;
		nroHojas(raiz.left);
		nroHojas(raiz.right);
		}
	}
	
	public int nroNodosNoHojas() {
		return this.nroNodos()-this.nroHojas();
	}
	
	//Retorna la cadena que tiene toda la información del BST. Utiliza alguno de los recorridos
	public String toString() {
		String str="Arbol ";
		if(this.isEmpty())
			str += "Vacio";
		//str+="Preorden: "+this.preOrden();
		str+="Inorden: "+this.inOrden();
		//str+="Postorden: "+this.postOrden();
		return str;
	}
	
	public void recorrido(int tipo) { //recibe tipo de recorrido
		switch (tipo) {
		case 1: this.preOrden(this.root); break;
		//case 2: this.inOrden(this.root); break;
		case 3: this.postOrden(this.root); break;
		}
		System.out.println();
	}

	public String preOrden() {
		return this.preOrden(this.root);
	}
	
	private String preOrden(Node n) { 
		//raiz - subarbol izquierdo- subarbol derecho
		String cad= "";
		if (n !=null) { 
			cad+=n.data +", "; //procesamos la raiz
			cad+=preOrden(n.left); //luego me voy a la izquierda
			cad+=preOrden(n.right);
		}
		return cad;
	}
	
	public String inOrden(){
		return this.inOrden(this.root);
	}
		
	protected String inOrden(Node actual){//inorden siempre ascendente
		// subarbol izquierdo - raiz - subarbol derecho
		String cad= "";
		if (actual !=null) { 
			cad+=inOrden(actual.left); 
			cad+=actual.data +", ";
			cad+=inOrden(actual.right);
		}
		return cad;
	}
	
	public String postOrden() {
		return this.postOrden(this.root);
	}
	
	private String postOrden(Node n) { 
		//subarbol izquierdo - subarbol derecho - raiz
		String cad= "";
		if (n !=null) { 
			cad+=postOrden(n.left); 
			cad+=postOrden(n.right);
			cad+=n.data+", "; 
		}
		return cad;
	}
	
	public void preOrdenIte() throws ExceptionEmpty {
		this.preOrdenIte(this.root);
	}
	
	/*
	private void preOrdenIte(Node n) { //con stack de libreria
		Stack <Node> pila = new Stack <Node>();
		Node actual= n;
		do {
			if (actual !=null){ //bajo todo izquierda hasta que hoja es null
				System.out.print(actual.data+", ");
				pila.push(actual);
				actual=actual.left;
			}
			
			else {
				if (!pila.isEmpty()) {
					pila.pop(); //saco el null
					actual=pila.pop(); 
					actual=actual.right;
				}
			}
		}while (!pila.isEmpty() || actual != null);
	}*/
	
	
	private void preOrdenIte(Node n) throws ExceptionEmpty { 
		StackLink <Node> pila = new StackLink <Node>();
		Node actual= n;
		do {
			if (actual !=null){ //bajo todo izquierda hasta que hoja es null
				System.out.print(actual.data+", ");
				pila.push(actual);
				actual=actual.left;
			}
			
			else {
				if (!pila.isEmpty()) {
					pila.pop(); //saco el null
					actual=pila.pop(); 
					actual=actual.right;
				}
			}
		}while (!pila.isEmpty() || actual != null);
	}
}
