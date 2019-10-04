package data;

import java.util.Locale;

import com.github.javafaker.Faker;

import exceptions.FullNameFormatException;
import exceptions.OutOfRangeException;

public class FakeStudent extends Student {
	// для тестирования
	
	public FakeStudent() throws FullNameFormatException, OutOfRangeException {
		//super();
		Faker faker = new Faker(new Locale("ru"));
		this.setFullname(faker.name().fullName());
		int age = faker.number().numberBetween(18, 36);
		this.setAge((float)age);
	}
	
}
