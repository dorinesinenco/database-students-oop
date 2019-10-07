package main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

import com.github.javafaker.Faker;

import data.*;
import exceptions.OutOfRangeException;
import exceptions.FullNameFormatException;
import exceptions.MarkException;
import exceptions.NullException;

public class Aplication {

	public static void main(String[] args) throws FullNameFormatException, OutOfRangeException, NullException, MarkException {
		SingleUniversity f = SingleUniversity.getInstance();
		StudentFactory studentFactory = new StudentFactory();
		TeacherFactory teacherFactory = new TeacherFactory();
		
		FakeStudent fakeStudent = (FakeStudent) studentFactory.getFakeStudent();
		FakeTeacher fakeTeacher = (FakeTeacher) teacherFactory.getFakeTeacher();
		
		System.out.println(fakeStudent);
		System.out.println(fakeTeacher);
	}
	
	
	
	
	
//		ArrayList<Student> students = new ArrayList<>();
//		
//		try {
//			
//			Student st1 = new Student("Вася Пекус", 25f, new Group("Test Group", 1, new HashSet<Student>()), 5.8f);
//			Student st2 = new Student("Вася Пекус", 25f, new Group("Test Group", 1, new HashSet<Student>()), 5.5f);
//			HashSet<Student> hashStudents = new HashSet<>();
//						
//			Group gr = new Group("First Group", 6, hashStudents); 
//			
//			if(st1.equals(st2))System.out.println("Оба объекта равны");
//			else System.out.println("Оба объекта НЕ равны");
//			
//			if(gr.addStudent(st1)) {
//				System.out.println("Добавлен в группу "+gr.getName());
//				System.out.println("Группа студента="+st1.getGroup());
//			}else System.out.println("Студент "+st1+" НЕ добавлен в группу "+gr.getName());
//
//			if(gr.addStudent(st2)) {
//				System.out.println("Добавлен в группу "+gr.getName());
//				System.out.println("Группа студента="+st2.getGroup());
//			}else System.out.println("Студент "+st2+" НЕ добавлен в группу "+gr.getName());
//			
//			students.add(st1);
//			students.add(st2);
//			
//			
//		} catch (OutOfRangeException e) {
//			e.printStackTrace();e.getMessage();
//		} catch (FullNameFormatException e) {
//			e.printStackTrace();
//		} catch (MarkException e) {
//			e.printStackTrace();
//		} catch (NullException e) {
//			e.printStackTrace();
//		}
		
//		students.add(new Student("Вася Пекус", 21, 9.5f));
//		students.add(new Student("Nana Pecus", 12, 5.5f));
//		students.add(new Student("Tanea Pecus", 29, 11.5f));
//
//		for (Student student : students) {
//			System.out.println(student.getFulName());
//		}
		
//		students.forEach(s->System.out.println(s.getAge()));
//		students.forEach(System.out::println);
//		students.forEach(Aplication::printStudent);
//	}
//	
//	public static void printStudent(Student s) {
//		System.out.println(s.getMark());
//	}
	

}
