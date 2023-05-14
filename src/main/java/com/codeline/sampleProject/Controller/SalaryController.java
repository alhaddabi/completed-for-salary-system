package com.codeline.sampleProject.Controller;

import com.codeline.sampleProject.Models.Account;
import com.codeline.sampleProject.Models.Salary;
import com.codeline.sampleProject.Repository.SalaryRepository;
import com.codeline.sampleProject.Service.AccountService;
import com.codeline.sampleProject.Service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@Controller
public class SalaryController {


    @Autowired
    SalaryService salaryService;

    @RequestMapping("Salary/create")
    public void saveAccount()
    {
        createAccount();
    }

    @RequestMapping("salary/get")
    public List<Salary> getSalary ()
    {
        return salaryService.getSalary();
    }
    public void createAccount() {

        Salary salary = new Salary();
        salary.setAllowances(5456.4654);
        salary.setBonus(12.12);
        salary.setCurrency("Omani");
        salary.setCreatedDate(new Date());
        salary.setIsActive(true);
        salary.setHealthCareContribution(1248545.546);
        salaryService.saveSalary(salary);
    }
}
