package com.sms.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.entity.Student;
import com.sms.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	

	
	@GetMapping("/getAllStudents")
	public ResponseEntity<List<Student>> getAllStudents() {
		// TODO Auto-generated method stub

     List<Student> list= this.studentService.getAllStudents();
		
    return ResponseEntity.ok(list);
	}



	
	@PostMapping("/saveStudent")
	public ResponseEntity<Student> saveStudent(@RequestBody   Student student) {


Student st=	this.studentService.saveStudent(student);

return ResponseEntity.ok(st);
	}


    @PutMapping("/updateStudent/{sid}")
	public ResponseEntity<Student> updateStudent(@RequestBody  Student student,  @PathVariable("sid") int sid) {
		// TODO Auto-generated method stub

	Student updatedStudent=	this.studentService.updateStudent(student, sid);
	return ResponseEntity.ok(updatedStudent);
	}



	@DeleteMapping("/deleteStudent/{sid}")
	public ResponseEntity<Void>   deleteStudent(@PathVariable("sid")  int sid) {

		
	     this.studentService.deleteStudent(sid);
	     
	     return ResponseEntity
	    	      .noContent()
	    	      .build();

	}

	
}
