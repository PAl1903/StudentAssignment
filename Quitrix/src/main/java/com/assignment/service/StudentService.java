package com.assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.entity.StudentAddress;
import com.assignment.entity.StudentData;
import com.assignment.repository.StudentAddressRepository;
import com.assignment.repository.StudentDataRepository;

@Service
public class StudentService {
	@Autowired
	StudentAddressRepository stdAdd;
	
	@Autowired
	StudentDataRepository stdData;
	public boolean saveStudent(StudentData stud) {
		try {
				StudentAddress saveStudentAddress=stud.getAddress();
				saveStudentAddress.setRollNo(stud.getRollNo());
				stdAdd.save(saveStudentAddress);
				stdData.save(stud);
				return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public List<StudentData> fetchStudent(){
		try {
			List<StudentData> data=stdData.findAll();
			List<StudentAddress> address = stdAdd.findAll();
			
			for (StudentData student : data) {
	            student.setAddress(address.stream()
	                    .filter(address1 -> (address1.getRollNo()==student.getRollNo()))
	                    .findFirst()
	                    .orElse(null));
	        }
			return data;
			
		}catch(Exception e) {
			return null;
		}
	}
}
