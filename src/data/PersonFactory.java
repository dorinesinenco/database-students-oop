package data;

public class PersonFactory {
	public PersonInterface getNewPerson() {	
		return new Person();
	}
}
