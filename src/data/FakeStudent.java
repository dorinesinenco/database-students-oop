package data;

import java.util.Locale;

import com.github.javafaker.Faker;

import exceptions.FullNameFormatException;
import exceptions.MarkException;
import exceptions.NullException;
import exceptions.OutOfRangeException;

public class FakeStudent extends Student {
//	только для тестирования
	public FakeStudent() {
		super();
		Faker faker = new Faker(new Locale("ru"));
		try {
			this.setFullname(faker.name().fullName());
		} catch (FullNameFormatException e) {
			e.printStackTrace();
		}
		try {
			this.setAge( ((Integer)faker.number().numberBetween(18, 65)).floatValue());
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
		
		try {
			this.setMark(((Integer)faker.number().numberBetween(1, 10)).floatValue());
		} catch (MarkException e) {
			e.printStackTrace();
		}
		try {
			this.setGroup(new Group("FakeGroup",5,null));
		} catch (NullException e) {
			e.printStackTrace();
		}catch (OutOfRangeException e) {
			e.printStackTrace();
		}
	}

	
	
}
