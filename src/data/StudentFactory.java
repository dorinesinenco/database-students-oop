package data;

import exceptions.FullNameFormatException;
import exceptions.MarkException;
import exceptions.NullException;
import exceptions.OutOfRangeException;

public class StudentFactory extends FactoryBase {

	public PersonInterface getNewStudent() {	
		return new Student();
	}	
	
	public PersonInterface getFakeStudent() throws FullNameFormatException, OutOfRangeException, NullException, MarkException {	
		FakeStudent fakeStudent = new FakeStudent();
		fakeStudent.setFullname(faker.name().fullName());
		int age = faker.number().numberBetween(18, 36);
		fakeStudent.setAge((float)age);
		fakeStudent.setGroup(new Group("Gr12345",5,null));
		float mark = faker.number().numberBetween(1, 5);
		fakeStudent.setMark(mark);
		return fakeStudent;
	}
}
