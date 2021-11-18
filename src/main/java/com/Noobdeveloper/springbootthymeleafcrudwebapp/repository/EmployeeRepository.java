package com.Noobdeveloper.springbootthymeleafcrudwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Noobdeveloper.springbootthymeleafcrudwebapp.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> 
{

}
