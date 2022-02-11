package com.example.employeemanager.repository;

import com.example.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    void deleteById(Long id);
//@Modifying
//@Query("delete from Employee e where e.id=:id")
//void deleteEmployeeById(@Param("id") Long id);

    Optional<Employee> findEmployeeById(Long id);
}
