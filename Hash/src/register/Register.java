package register;

public class Register <E> implements Comparable<Register <E>> {
	protected int key; //clave a dispersar, ejm codigo 
	protected E reg; //datos ejem nombre
	
	public Register (int key, E reg) {
		this.key = key;
		this.reg = reg;
	}
	
	public int compareTo (Register <E> r ) {
		return this.key - r.key; //compara registros entre si
	}
	
	public boolean equals (Object o) { //registros iguales
		if (o instanceof Register) {
			Register <E> r = (Register <E>) o;
			return r.key == this.key;
		}
		return false;
	}
	
	public int getKey() {
		return this.key;
	}

	public void setKey(int key) {
		this.key = key;
	}
	
	public E getReg() {
		return reg;
	}

	public void setReg(E reg) {
		this.reg = reg;
	}

	@Override
	public String toString() {
		return this.key + " : "+this.reg.toString();
	}

}
