package com.assignment.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.ToString;

@Data
@Document(collection="student_data")
@ToString
public class StudentData {
	@Id
	private int rollNo;
	private String firstName;
	private String lastName;
	private String fatherName;
	private String motherName;
	private String std;
	private long mobileNo;
	private StudentAddress address;
	
}
