package persona;

public class Person{
	private String firstName;
	private String lastName;

 	public String toString(){
 		return getFirstName() + getLastName();
 	}
		
  	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setName(String first, String last){
		setFirstName(first);
		setLastName(last);
	}
		//Function to set firstName and lastName according to 
 		//the parameters
		//Postcondition: firstName = first; lastName = last
		
	public void getName(String first, String last){}
		//Function to return firstName and lastName via the 
		//parameters
		//Postcondition: first = firstName; last = lastName

	public Person(String first, String last){}
		//Constructor
		//Set firstName and lastName according to the parameters
 		//The default values of the parameters are empty strings
 		//Postcondition: firstName = first; lastName = last  

}