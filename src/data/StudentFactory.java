package data;

import exceptions.FullNameFormatException;
import exceptions.MarkException;
import exceptions.NullException;
import exceptions.OutOfRangeException;

public class StudentFactory extends FactoryBase{

	public StudentInterface getNewStudent() {
		return new Student();
	}
	public StudentInterface getFakeStudent() {
		FakeStudent fakerStudent = new FakeStudent();
		
		try {
			fakerStudent.setFullname(faker.name().fullName());
		} catch (FullNameFormatException e) {
			e.printStackTrace();
		}
		try {
			fakerStudent.setAge( ((Integer)faker.number().numberBetween(18, 65)).floatValue());
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
		
		try {
			fakerStudent.setMark(((Integer)faker.number().numberBetween(1, 10)).floatValue());
		} catch (MarkException e) {
			e.printStackTrace();
		}
		try {
			fakerStudent.setGroup(new Group("FakeGroup",5,null));
		} catch (NullException e) {
			e.printStackTrace();
		}catch (OutOfRangeException e) {
			e.printStackTrace();
		}		
		return fakerStudent;
	}
}
