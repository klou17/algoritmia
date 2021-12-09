//se compara apellidos
public class Person implements Comparable<Person> {
	private String firstName;
	private String lastName;

	public Person(String first, String last){
		this.firstName=first;
		this.lastName=last;
	}
 	public String getFirstName() { return firstName; }
	public void setFirstName(String firstName) { this.firstName = firstName;}
	public String getLastName() { return lastName; }
	public void setLastName(String lastName) { this.lastName = lastName;}

	public String toString(){ 
		return getFirstName()+" "+getLastName();
	}
	
 	public void setName(String first, String last){
 		setFirstName(first);
 		setLastName(last);
 	}
		
	public void getName(String first, String last){
		this.toString();
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
