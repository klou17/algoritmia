
import excepciones.ItemDuplicated;

public class RedBlack <E extends Comparable<E>> extends AVL <E>{
	public class Node {
		protected E data;
		protected Node left, right, parent;
		protected int color;
			
		public Node(E data, Node left, Node right, Node parent, int color) {
			this.data = data;
			this.left = left;
			this.right = right;
			this.parent = parent;
			this.color = color;
		}
		public Node(E data) {
			this (data,null,null,null,BLACK);
		}
		
		public String toString() {
			return this.data.toString();
		}
	}
	
	private Node root;
	private Node nullNode;
	private final int RED;
	private final int BLACK;
	
	public RedBlack() {
		this.root=null;
		this.nullNode =null;
		this.RED=0;
		this.BLACK=1;
	}
	
	public boolean isEmpty(){ 
		return this.root == null; 
	}
	
	public void insert(E ele) throws ItemDuplicated {
		this.root = insert(ele, root);
	}
	
	private Node insert(E ele, Node raiz) throws ItemDuplicated {
		Node res = raiz;
		if (raiz == null) {
			res = new Node(ele);
			res.color = BLACK;
			res.parent = nullNode;
		}
		else	{ //buscamos el lugar para inserción
			res.color = RED;
			int resC = raiz.data.compareTo(ele);
			if (resC == 0 ) 
				throw new ItemDuplicated(ele + "esta duplicado");
			if (resC < 0)  //-1 
				res.right = insert(ele, raiz.right);
			else  //1
				res.left = insert(ele, raiz.left);
		}
		return res;
	}

}
