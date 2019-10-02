package data;

import java.util.ArrayList;

import exceptions.OutOfRangeException;
import helpers.Validator;

public class SingleUniversityFactory {
	String name;// - название университета ( валидация: min 3 .. max 30 )
	private final int minNameLength = 3;
	private final int maxNameLength = 30;
	Administrator director;// - ссылка на объект класс директора
	ArrayList<Group> groups;// - ссылка на список групп университета
	ArrayList<Domains> domains;// - ссылка на список направлений обучения университета
	ArrayList<Teacher> teachers;// - ссылка на список учителей университета
	ArrayList<Student> students;// - ссылка на список студентов университета
	
	private static SingleUniversityFactory instance = new SingleUniversityFactory();
	
	public static SingleUniversityFactory getInstance() {
		return instance;
	}
	

	public PersonInterface getNewPerson(String type) {
		if(type == null) {
			return null;
		}
		if(shapeType.equalsIgnoreCase("Student")){
	         return new Student();
		}
		if(shapeType.equalsIgnoreCase("Teacher")){
	         return new Teacher();
		}
		if(shapeType.equalsIgnoreCase("FakeStudent")){
	         return new Student();
		}
		if(shapeType.equalsIgnoreCase("FakeTeacher")){
	         return new Teacher();
		}
		return null;
	};
	
	public GroupInterface getNewGroup() {
		if(type == null) {
			return null;
		}		
		return new Group();
	}
	
	
	
	private SingleUniversityFactory() throws OutOfRangeException {
		super();
//		
//		if(Validator.checkRange(name.length(), minNameLength, maxNameLength))
//			this.name = name;
//		else throw new OutOfRangeException("длинна название университета:"+name.length()+" ( валидация: min "+minNameLength+" .. max "+maxNameLength+" )");
//		this.director = director;
		
		this.groups = new ArrayList<Group>();
		this.domains = new ArrayList<Domains>();
		this.teachers = new ArrayList<Teacher>();
		this.students = new ArrayList<Student>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) throws OutOfRangeException {
		if(Validator.checkRange(name.length(), minNameLength, maxNameLength))
			this.name = name;
		else throw new OutOfRangeException("длинна название университета:"+name.length()+" ( валидация: min "+minNameLength+" .. max "+maxNameLength+" )");
	}
	public Administrator getDirector() {
		return director;
	}
	public void setDirector(Administrator director) {
		this.director = director;
	}
	public ArrayList<Group> getGroups() {
		return groups;
	}
	public void setGroups(ArrayList<Group> groups) {
		this.groups = groups;
	}
	public ArrayList<Domains> getDomains() {
		return domains;
	}
	public void setDomains(ArrayList<Domains> domains) {
		this.domains = domains;
	}
	public ArrayList<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(ArrayList<Teacher> teachers) {
		this.teachers = teachers;
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "University [name=" + name + ", director=" + director + ", groups=" + groups + ", domains=" + domains
				+ ", teachers=" + teachers + ", students=" + students + "]";
	}
	
}
