package com.example.springbootmongodbcrud.repository;

import com.example.springbootmongodbcrud.model.Employee;

import org.springframework.data.mongodb.repository.MongoRepository;

//@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Long>{

}
