package com.sms.service;

import java.util.List;

import com.sms.entity.Student;

public interface StudentService {

	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
    Student	updateStudent(Student student, int sid);
    
    void deleteStudent(int sid);
	
}