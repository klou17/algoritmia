
public class Person implements Comparable<Person> {
	private String firstName;
	private String lastName;
	private int telefono;
	private String direccion; 

	public Person(String first, String last, String direccion, int telefono){
		this.firstName=first;
		this.lastName=last;
		this.direccion=direccion;
		this.telefono=telefono;
	}
	
 	public String getFirstName() { return firstName; }
	public void setFirstName(String firstName) { this.firstName = firstName;}
	public String getLastName() { return lastName; }
	public void setLastName(String lastName) { this.lastName = lastName;}
	
	
	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() { return direccion; }
	public void setDireccion(String direccion) { this.direccion = direccion;
	}

	public String toString(){ 
		return getFirstName()+" "+getLastName()+" "+ ""+getDireccion()+""+getTelefono();
	}
 	
	@Override
	public int compareTo(Person p) {
		if (this.getLastName().compareTo(p.getLastName()) < 0) 
			return -1;
		else {
			if(this.getLastName().compareTo(p.getLastName()) > 0) 
				return 1;
			return 0;
		}
	}	

}
