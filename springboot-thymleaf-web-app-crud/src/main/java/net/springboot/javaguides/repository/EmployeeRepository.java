package net.springboot.javaguides.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.springboot.javaguides.model.Employee;

@Repository  
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
