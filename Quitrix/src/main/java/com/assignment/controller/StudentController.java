package com.assignment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.entity.StudentData;
import com.assignment.service.StudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService serv;
	
	@PostMapping("/add")
	public ResponseEntity<?> addStudent(@RequestBody StudentData stud){
		
		if(stud==null) {
			return ResponseEntity.ok(true);
		}else {
			serv.saveStudent(stud);
		}

		return ResponseEntity.ok(true);
	}

	@GetMapping("/get")
	public ResponseEntity<List<StudentData>> getStudent(){
		return ResponseEntity.ok(serv.fetchStudent());
	}
}
