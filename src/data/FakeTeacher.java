package data;

import java.util.ArrayList;
import java.util.Locale;

import com.github.javafaker.Faker;

import exceptions.ExperienceException;
import exceptions.FullNameFormatException;
import exceptions.OutOfRangeException;

public class FakeTeacher extends Teacher {
//только для тестирования
	public FakeTeacher() {
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
			this.setExperience(faker.number().numberBetween(1, 40));
		} catch (ExperienceException e) {
			e.printStackTrace();
		}
		try {
			ArrayList<Domains> domains = new ArrayList<Domains>();
			domains.add(Domains.MATHS);
			this.setDomains(domains);
		} catch (ExperienceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
