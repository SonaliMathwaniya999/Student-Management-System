package com.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.entity.Student;
import com.sms.repository.StudentRepository;

@Service
public class StudentServiceimpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
  
	List<Student>	list = studentRepository.findAll();
		
		
		return list;
	}


	@Override
	public Student saveStudent(Student student) {


Student st=	studentRepository.save(student);
	
return st;
	}


	@Override
	public Student updateStudent(Student student, int sid) {
		// TODO Auto-generated method stub
		
	Student std=	studentRepository.findById(sid).get();
		
		std.setFirstname(student.getFirstname());
        std.setLastname(student.getLastname());
        std.setEmail(student.getEmail());
        
	Student updatedStudent=	studentRepository.save(std);
		return updatedStudent;
	}


	@Override
	public void deleteStudent(int sid) {
		// TODO Auto-generated method stub
		
		studentRepository.deleteById(sid);
		
		
	}

}
