package com.codeline.sampleProject.Repository;

import com.codeline.sampleProject.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("SELECT a FROM Employee a WHERE a.department=:nameOfDepartment")
    List<Employee> getEmployeeByDepartment(@Param("nameOfDepartment") String dept);

    @Query("SELECT a FROM Employee a WHERE a.salary=:salaryOfEmployee")
    List<Employee> getEmployeeSalary(@Param("salaryOfEmployee") Double salary);

}
