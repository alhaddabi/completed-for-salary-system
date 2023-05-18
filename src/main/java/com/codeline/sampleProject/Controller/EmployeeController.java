package com.codeline.sampleProject.Controller;

import com.codeline.sampleProject.Models.Employee;
import com.codeline.sampleProject.Repository.EmployeeRepository;
import com.codeline.sampleProject.RequestObject.getEmployeeRequestObject;
import com.codeline.sampleProject.ResponseObject.GetEmployeeResponse;
import com.codeline.sampleProject.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping("employee/create")
    public void saveEmployee (@RequestBody getEmployeeRequestObject employeeRequestObject)
    {
        createEmployee(employeeRequestObject);
    }




    @RequestMapping("employee/get")
    public List<Employee> getEmployee ()
    {
        return employeeService.getEmployees();
    }


    @RequestMapping("employee/get/{employeeId}")
    public GetEmployeeResponse createEmployee (@PathVariable Long employeeId)
    {
       return employeeService.getEmployeeById(employeeId);
    }

//    @DeleteMapping("employee/{employeeId}") String DeleteEmployee(@PathVariable Long employeeId)
//    {
//        if(!GetEmployeeResponse.equal(employeeId))
//        {
//            throw new EmployeeNotFoundExecption(employeeId);
//        }
//        EmployeeRepository.deleteById(employeeId)
//        return "the user "+ employeeId + " has been deleted";
//    }

    public void createEmployee(getEmployeeRequestObject employeeRequestObject) {

        Employee employee = new Employee();
        employee.setName(employeeRequestObject.getName());
        employee.setGender(employeeRequestObject.getGender());
        employee.setSalary(650.0);
        employee.setDepartment(employeeRequestObject.getDepartment());
        employee.setCompanyName("TechM");
        employee.setCreatedDate(new Date());
        employee.setIsActive(true);
        employeeService.saveEmployee(employee);
    }

}
