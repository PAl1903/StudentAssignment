package com.assignment.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.ToString;

@Data
@Document(collection="student_addres")
@ToString
public class StudentAddress {
	@Id
	private int rollNo;
	private String houseNo;
	private String appartmentName;
	private String streetName;
	private String cityName;
	private String stateName;
	private String pincode;
	private String country;
	
}
