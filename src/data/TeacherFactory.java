package data;

public class TeacherFactory {
	public  TeacherInterface getNewTeacher( String type){
		TeacherInterface toReturn =null;;
		if (type==null) {toReturn=null;}
		else if (type.equalsIgnoreCase("teacher")) toReturn =new Teacher();
	 
	 return toReturn;
		 
	}

}
