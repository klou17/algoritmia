package bst_teo;
import java.util.Stack;

import excepciones.*;

public class Bst <T extends Comparable<T>> {
	protected Node<T> root;
	private int cant;

	public Bst(){
		this.root = null; //raiz
	}
	
	public void insertIte (T ele) {
		if (this.isEmpty())
			this.root = new Node<T> (ele);
		else { //por lo menos un nodo
			Node<T> pad= null;
			Node<T> aux = this.root;
			while (aux != null && !aux.getData().equals(ele)) { 
				//mientras que ese nodo exista
				//equals para no ingresar elementos iguales
				
				pad=aux; //como no puedo regresar padre se queda con valor
				if (aux.getData().compareTo(ele) > 0)
					aux= aux.getLeft(); //aux es al izuqierdo por ser mayor
				else
					aux = aux.getRight();
				}
			if (aux != null) { //sali del while porque elemento esta duplicado
				System.out.println(ele + " Elemento duplicado");
				return;
			}
			
			Node<T> nuevo= new Node<T> (ele);
			if (pad.getData().compareTo(ele)> 0) //padre mayor que el ele se va izq
				pad.setLeft(nuevo);
			else
				pad.setRight(nuevo);
			}		
	}
	
	public void insertRecu(T ele) throws ItemDuplicated {
		this.root = insertRecu(ele, root);
	}
	
	private Node<T> insertRecu(T ele, Node<T> raiz) throws ItemDuplicated{
		Node<T> res = raiz;
		
		if (raiz == null) 
			res = new Node<T>(ele);
		
		else { //buscamos el lugar para inserción
			int resC = raiz.getData().compareTo(ele);
			if (resC == 0 ) 
				throw new ItemDuplicated(ele + "esta duplicado");
			if (resC < 0) 
				res.setRight(insertRecu(ele, raiz.getRight()));
			else
				res.setLeft(insertRecu(ele, raiz.getLeft()));
		}
		return res;
	}
	
	public T minRecover() { //min elemento
		T min= minRecover(this.root).getData();
		return min;
	}
	
	private Node<T> minRecover(Node<T> nodo) { //min elemento respaldo
		if (nodo != null)
			while (nodo.getLeft() != null)
				nodo = nodo.getLeft();
		return nodo;
	}
		
	public T minRemove() {
		T min = minRecover();
		this.root = minRemove(this.root);
		return min;
	}
		
	private Node<T> minRemove(Node<T> actual) {
		if (actual.getLeft() != null) //buscamos el minimo
			actual.setLeft(minRemove(actual.getLeft()));
		else //eliminamos el minimo
			actual = actual.getRight();
		return actual;
	}
	
	public T maxRecover() { //max elemento
		T max= maxRecover(this.root).getData();
		return max;
	}
	
	private Node<T> maxRecover(Node<T> nodo) { //max elemento respaldo
		if (nodo != null)
			while (nodo.getRight() != null)
				nodo = nodo.getRight();
		return nodo;
	}
	
	public T maxRemove() {
		T max = minRecover();
		this.root = maxRemove(this.root);
		return max;
	}
		
	private Node<T> maxRemove(Node<T> actual) {
		if (actual.getRight() != null) //buscamos el max en derecha
			actual.setRight(maxRemove(actual.getRight()));
		else //eliminamos el minimo
			actual = actual.getLeft();
		return actual;
	}

	public T search(T x) throws ItemNotFound {
		Node<T> res = search2(x, this.root);
		if(res == null)
			throw new ItemNotFound ("El dato "+ x + " no esta");
		return res.getData();
	}
		
	private Node<T> search(T ele, Node<T> nodo){ 
		while (nodo != null) {
			if (ele.compareTo(nodo.getData()) < 0)
				nodo= nodo.getLeft();
			else {
				if (ele.compareTo(nodo.getData()) > 0)
					nodo= nodo.getRight();
				else
					return nodo;
			}
		}
		return null;
	}
	
	private Node<T> search2(T ele, Node<T> nodo){
		if (nodo == null) 
			return null; 
		else {
			int resC = nodo.getData().compareTo(ele);
			if (resC < 0) 
				return search(ele, nodo.getRight());
			else {
				if (resC > 0) 
					return search(ele, nodo.getLeft());
				else 
					return nodo;
			}
		}
	}
	
	public void remove(T x) throws ItemNotFound {
		this.root = remove(x, this.root);
	}
	
	private Node<T> remove(T ele, Node<T> nodo) throws ItemNotFound{
		Node <T> res = nodo;
		if (nodo == null) 
			throw new ItemNotFound(ele + " no esta"); //elemento no encontrado
		int resC = nodo.getData().compareTo(ele);
		if (resC > 0) 
			res.setRight(remove(ele, nodo.getRight()));
		else { 
			if (resC < 0) 
				res.setLeft(remove(ele,nodo.getLeft()));
			else {
				if(nodo.getLeft() != null && nodo.getRight() != null){//dos hijos
					res.setData(minRecover(nodo.getRight()).getData());
					res.setRight(minRemove(nodo.getRight()));
				} 
				else //1 hijo o ninguno
					res = (nodo.getLeft() != null) ? nodo.getLeft() : nodo.getRight();
			}
		}
		return res;
	}
	
	public int alturaTotal() {
        return alturaTotal(this.root);
    }
	 
	private int alturaTotal(Node <T> raiz) {
        if (raiz == null) 
            return -1;
        else 
            return (1 + Math.max(alturaTotal(raiz.getLeft()), alturaTotal(raiz.getRight())));  
    }
	
	public int alturaX(T ele) throws ItemNotFound {
		Node <T> nodo = new Node <T> (ele);
		return alturaX(ele,nodo);
    }
	
	private int alturaX(T ele, Node <T> nodo) throws ItemNotFound {
		if (nodo==null)
			throw new ItemNotFound(ele + "no existe");
		else {
			if(nodo==this.root)
				return this.alturaTotal(this.root);
			else
				return this.alturaTotal(nodo);
		}	
	}
	
	public int nroNodos() {
		return nroNodos(this.root);
	}
	
	private int nroNodos(Node <T> raiz) {
		if (raiz==null)
			return 0;
		else
			return (1+ nroNodos(raiz.getLeft())+ nroNodos(raiz.getRight()));	
	}
	
	public int area() {
		return this.nroNodos()*this.alturaTotal();
	}
	
	public int nroHojas() {
		cant=0;
		nroHojas(this.root);
		return cant;
	}
	
	private void nroHojas(Node <T> raiz) {
		if(raiz!=null) {
			if(raiz.getLeft()==null && raiz.getRight()==null)
				cant++;
		nroHojas(raiz.getLeft());
		nroHojas(raiz.getRight());
		}
	}
	
	public int nroNodosNoHojas() {
		return this.nroNodos()-this.nroHojas();
	}
   
	public boolean isEmpty() {
		return this.root == null;
	}
	
	public void recorrido(int tipo) { //recibe tipo de recorrido
		switch (tipo) {
		case 1: this.preorden(this.root); break;
		case 2: this.inorden(this.root); break;
		case 3: this.postorden(this.root); break;
		}
		System.out.println();
	}
	
	public void preorden() {
		this.preorden(this.root);
	}
	
	private void preorden(Node <T> n) { 
		//raiz - subarbol izquierdo- subarbol derecho
		if (n !=null) { 
			System.out.print(n+ ", "); //procesamos la raiz
			preorden(n.getLeft()); //luego me voy a la izquierda
			preorden(n.getRight());
		}
	}
		
	public void preordenIte() {
		this.preordenIte(this.root);
	}
	
	private void preordenIte(Node <T> n) { //inorden siempre ascendente
		// subarbol izquierdo - raiz - subarbol derecho
		Stack <Node <T> > pila = new Stack <Node <T>>();
		Node <T> actual= n;
		do {
			if (actual !=null){ //bajo todo izquierda hasta que hoja es null
				System.out.print(actual.getData()+", ");
				pila.push(actual);
				actual=actual.getLeft();
			}
			
			else {
				if (!pila.isEmpty()) {
					pila.pop(); //saco el null
					actual=pila.pop(); 
					actual=actual.getRight();
				}
			}
		}while (!pila.isEmpty() || actual != null);
	}
	
	public void inorden() {
		this.inorden(this.root);
	}
	
	private void inorden(Node <T> n) { //inorden siempre ascendente
		// subarbol izquierdo - raiz - subarbol derecho
		if (n !=null) { 
			inorden(n.getLeft()); 
			System.out.print(n+ ", ");
			inorden(n.getRight());
		}
	}
	
	public void postorden() {
		this.postorden(this.root);
	}
	
	private void postorden(Node <T> n) { 
		//subarbol izquierdo - subarbol derecho - raiz
		if (n !=null) { 
			postorden(n.getLeft()); 
			postorden(n.getRight());
			System.out.print(n+ ", "); 
		}
	}

}
