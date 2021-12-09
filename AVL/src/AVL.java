
import excepciones.ItemDuplicated;
import excepciones.ItemNotFound;

public class AVL<T extends Comparable<T>>{
	public class Node {
		protected T data;
		protected Node left, right;
		protected int fe;
			
		public Node(T data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
			this.fe = 0;
		}
		public Node(T data) {
			this (data,null,null);
		}
		
		public String toString() {
			return this.data.toString();
		}
		
	}
	
	protected Node root;
	
	public AVL() { 
		this.root = null; 
	}
	
	public boolean isEmpty() {
		return this.root == null;
	}
	
	public void insert(T ele) throws ItemDuplicated {
		this.root = insert(ele, root);
	}
	
	protected Node rotateSR(Node node){
		Node hijo = node.right;
		node.right = hijo.left;
		hijo.left = node;
		//node = hijo;
		return hijo;
	}
	
	protected Node rotateSL(Node node){
		Node hijo = node.left;
		node.left = hijo.right;
		hijo.right = node;
		//node = hijo;
		return hijo;
	}
	
	protected Node rDobleRight(Node node){
		node.right= rotateSL(node.right);
		return rotateSR(node);
	}
	
	protected Node rDobleLeft(Node node){
		node.left= rotateSR(node.left);
		return rotateSL(node);
	}
	
	 private int height(Node t)
     {
         return t == null ? -1 : t.fe;
		 //if (t==null) return 0;
		 //return height (t.left)-height (t.right);
     }
	 
	 private int getBalance(Node N) {
	        if (N == null)
	            return 0;
	        return height(N.left) - height(N.right);
	 }
	 
	 private int max(int lhs, int rhs){
         return lhs > rhs ? lhs : rhs;
     }
	
	private Node insert(T ele, Node actual) throws ItemDuplicated {
		Node res = actual;
		if (actual == null) 
			res = new Node(ele);
		else {
			int resC = actual.data.compareTo(ele);
			if (resC == 0 ) 
				throw new ItemDuplicated(ele + "esta duplicado");
			
			if (resC < 0) { //raiz menor que ele entonces ele es mayor por eso a la derecha
				res.right = insert(ele, res.right);
				if( height(res.right) - height(res.left) == 2 ) {
					if(res.right.data.compareTo(ele) < 0)
	                	 res = rotateSR(res);
	                 else
	                	 res = rDobleRight(res);
				}
			}
			else { //raiz mayor que ele, entonces ele es menor por eso a la izq
				res.left = insert(ele, res.left);
				if( height(res.left) - height(res.right) == 2 ) {
					if(res.left.data.compareTo(ele) >  0)
	                	 res = rotateSL(res);
	                 else
	                	 res = rDobleLeft(res);
				}
			}
		}
		res.fe= max( height( res.left ), height( res.right ) ) + 1;
		return res;
	}
	
	public T minRecover() { //min elemento
		T min= minRecover(this.root).data;
		return min;
	}
	
	private Node minRecover(Node nodo) { //min elemento respaldo
		if (nodo != null)
			while (nodo.left != null)
				nodo = nodo.left;
		return nodo;
	}
	
	public void remove(T ele) throws ItemNotFound {
		this.root = remove(ele, this.root);
	}
	
	protected Node remove(T ele, Node nodo) throws ItemNotFound {
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
		int balance = getBalance(res);
		if (balance > 1 && getBalance(res.left) >= 0)
			return rotateSR(res);
		
		if (balance > 1 && getBalance(res.left) < 0) {
            //res.left =  rotateSL(res.left);
            return rDobleLeft(res);
        }
		
		if (balance < -1 && getBalance(res.right) <= 0)
            return rotateSL(res);
		
		if (balance < -1 && getBalance(res.right) > 0) {
            //root.right = rotateSR(res.right);
            return rDobleRight(res);
        }
		return res;
	}
	
	public T minRemove() {
		T min = minRecover();
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
	
	public T search(T x) throws ItemNotFound {
		Node res = search(x, root);
		if(res == null)
			throw new ItemNotFound ("El dato "+ x + "no esta");
		return res.data;
	}
	
	private Node search (T x, Node n) {
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
	
	public String toString() {
		String str="Arbol ";
		if(this.isEmpty())
			str += "Vacio";
		str+= this.preOrden();
		return str;
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
}
