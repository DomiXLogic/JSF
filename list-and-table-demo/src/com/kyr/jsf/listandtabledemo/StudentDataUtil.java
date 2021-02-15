package com.kyr.jsf.listandtabledemo;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class StudentDataUtil {

     private List<Student> students;
     
     
     public StudentDataUtil() {
    	 loadSampleData();
     }


	private void loadSampleData() {
		students = new ArrayList<>();
		
		students.add(new Student("Kyriakos","Katsaras","katsaras.kyriakos@gmail.com"));
		students.add(new Student("Garyfallia","Fountoukopoulou","garyfalliaF@gmail.com"));
		students.add(new Student("Matoula","Katsara","katsara.matoula@gmail.com"));
	 }


	public List<Student> getStudents() {
		return students;
	}

	
	
}
