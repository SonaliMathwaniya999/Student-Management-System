package com.sms;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;





@SpringBootApplication
public class StudentManagementSystemApplication  {

	
     //private StudentService studentService;
	
	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
/*
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Student s1=new Student(30,"komal","verma@gmail.com","verma");
		Student s2 = new Student(40,"harish","harish@gmail.com","singh");
		Student s3 = new Student(50,"lavina","malani@gmail.com","malani");
		
		
		
		studentService.saveStudent(s1);
		studentService.saveStudent(s2);
		studentService.saveStudent(s3);
		
	}
	*/

}
