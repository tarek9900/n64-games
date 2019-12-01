package com.test.newgame.repo;

import com.test.newgame.model.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    Optional<Employee> findByLastName(String lastName);

}
