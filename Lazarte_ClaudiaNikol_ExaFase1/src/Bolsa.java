import java.util.ArrayList;

public class Bolsa < T extends Comparable<T> > { //el tipo T extiende, hereda de comparable
	private ArrayList<T> items;

	public Bolsa(int nro) {
		items = new ArrayList<T>(nro);
	}
	
	public void insertar(T x){
		items.add(x);	
	}
	
	public T mayorItem(){
		T itemMa= items.get(0);
		for (T obj: items) {
			if(obj.compareTo(itemMa) > 0)
				itemMa=obj;
		}
		
		return itemMa;
	}
	
	public Object[] extremos(){  // metodo de instancia
		Object [] ext= new Object[2];
		/*ext[0] = items.get(0); //menor
		ext[1] = items.get(0); //mayor
		
		for (T obj: items) {
			//estoy casteando poniendo (T), si pusiera (Jugador) deja de ser generica 
			if(obj.compareTo((T) ext[0]) < 0)//uso el compareTo porque no puedo usar obj<ext[0]
				ext[0]=obj;
			if(obj.compareTo((T) ext[1]) > 0)
				ext[1]=obj;
		}	*/
		
		T min = items.get(0);
		T may = items.get(0);

		for (T obj: items) {
			if(obj.compareTo(min)< 0)
				min=obj;
			if(obj.compareTo(may)> 0)
				may=obj;
		}
		ext[0] = min; //menor
		ext[1] = may; //mayor
		return ext;	
	}

	@Override
	public String toString() {
		String cad= "";
		for (T obj: this.items)
			cad=cad + obj.toString() + "\n"; 
		return cad;
	}
}
