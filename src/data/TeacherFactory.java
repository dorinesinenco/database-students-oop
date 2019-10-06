package data;

import java.util.ArrayList;

import exceptions.ExperienceException;
import exceptions.FullNameFormatException;
import exceptions.OutOfRangeException;

public class TeacherFactory extends FactoryBase{
	public TeacherInterface getNewTracher() {
		return new Teacher();
	}
	
	public TeacherInterface getFakeTeacher() {
		FakeTeacher fakeTeacher= new FakeTeacher();
		try {
			fakeTeacher.setFullname(faker.name().fullName());
		} catch (FullNameFormatException e) {
			e.printStackTrace();
		}
		try {
			fakeTeacher.setAge( ((Integer)faker.number().numberBetween(18, 65)).floatValue());
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
		try {
			fakeTeacher.setExperience(faker.number().numberBetween(1, 40));
		} catch (ExperienceException e) {
			e.printStackTrace();
		}
		try {
			ArrayList<Domains> domains = new ArrayList<Domains>();
			domains.add(Domains.MATHS);
			fakeTeacher.setDomains(domains);
		} catch (ExperienceException e) {
			e.printStackTrace();
		}
		return fakeTeacher;
	}
}
