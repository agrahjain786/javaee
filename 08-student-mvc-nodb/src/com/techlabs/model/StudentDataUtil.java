package com.techlabs.model;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
	
	public static List<Student> getStudentData(){
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(1,"Agrah", "Jain", "agrah@gmail"));
		students.add(new Student(2,"Abhi", "P", "jabhi@gmail"));
		students.add(new Student(3,"Virag", "M", "V@gmail"));
		
		return students;
		
	}

}
