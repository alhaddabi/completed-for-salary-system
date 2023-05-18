package com.codeline.sampleProject.Controller;

import com.codeline.sampleProject.Models.Salary;
import com.codeline.sampleProject.RequestObject.getSalaryRequestObject;
import com.codeline.sampleProject.ResponseObject.GetSalaryResponse;
import com.codeline.sampleProject.Service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class SalaryController {


    @Autowired
    SalaryService salaryService;

    @RequestMapping("salary/create")
    public void saveSalary (@RequestBody Long salaryRequestObject)
    {
        createSalary(salaryRequestObject);
    }

    @RequestMapping("salary/get")
    public List<Salary> getSalary ()
    {
        return salaryService.getSalary();
    }


    @RequestMapping("salary/get/{salaryId}")
    public GetSalaryResponse createSalary (@PathVariable Long salaryId)
    {
        return salaryService.getSalaryById(salaryId);
    }
    public void createAccount(getSalaryRequestObject salaryRequestObject ) {

        Salary salary = new Salary();
        salary.setAllowances(salaryRequestObject.getAllowances());
        salary.setAmount(salaryRequestObject.getAmount());
        salary.setBonus(12.12);
        salary.setCurrency(salaryRequestObject.getCurrency());
        salary.setCreatedDate(new Date());
        salary.setIsActive(true);
        salary.setOverTimeAmount(2);
        salary.setHealthCareContribution(1248545.546);
        salaryService.saveSalary(salary);
    }
}
