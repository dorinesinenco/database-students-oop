package data;

import exceptions.FullNameFormatException;
import exceptions.OutOfRangeException;

public class PersonFactory extends FactoryBase{
	
	public PersonInterface getNewPerson(){
		return new Person();
	}
	public PersonInterface getFakePerson() {
		FakePerson fakePerson = new FakePerson();
		try {
			fakePerson.setFullname(faker.name().fullName());
		} catch (FullNameFormatException e) {
			e.printStackTrace();
		}
		try {
			fakePerson.setAge( ((Integer)faker.number().numberBetween(18, 65)).floatValue());
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
		
		
		return fakePerson;
	}
}
