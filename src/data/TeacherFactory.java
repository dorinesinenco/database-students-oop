package data;

import exceptions.FullNameFormatException;
import exceptions.OutOfRangeException;

public class TeacherFactory extends FactoryBase {
	
	public PersonInterface getNewTeacher() {	
		return new Teacher();
	}
	
	public PersonInterface getFakeTeacher() throws FullNameFormatException, OutOfRangeException {
		FakeTeacher fakeTeacher = new FakeTeacher();
		fakeTeacher.setFullname(faker.name().fullName());
		int age = faker.number().numberBetween(18, 36);
		fakeTeacher.setAge((float)age);
		return fakeTeacher;
	}	
}
