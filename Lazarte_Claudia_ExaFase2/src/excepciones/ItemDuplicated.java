package excepciones;

public class ItemDuplicated extends Exception {

	public ItemDuplicated(String s) {
		super(s);
	}
	
	public ItemDuplicated() {
		super();
	}
}
