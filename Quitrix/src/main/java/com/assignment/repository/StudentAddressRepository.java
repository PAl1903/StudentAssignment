package com.assignment.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.assignment.entity.StudentAddress;

public interface StudentAddressRepository extends MongoRepository<StudentAddress, Integer>{

}
