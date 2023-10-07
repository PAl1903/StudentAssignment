package com.assignment.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.assignment.entity.StudentData;

public interface StudentDataRepository extends MongoRepository<StudentData, Integer>  {

}
