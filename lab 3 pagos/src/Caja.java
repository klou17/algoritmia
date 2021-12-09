
public class Caja <T extends Comparable <T >> {
	private T dato;

	public Caja(T dato) {
		this.dato=dato;
	}
	
	public T dame() {
		return this.dato;
	}

	public void pon(T dato) {
		this.dato = dato;
	}
	
	@Override
	public String toString() {
		return dame()+"\n";
	}

}
