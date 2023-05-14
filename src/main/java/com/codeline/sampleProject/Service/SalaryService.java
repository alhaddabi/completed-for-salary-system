package com.codeline.sampleProject.Service;

import com.codeline.sampleProject.Models.Account;
import com.codeline.sampleProject.Models.Salary;
import com.codeline.sampleProject.Repository.AccountRepository;
import com.codeline.sampleProject.Repository.SalaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryService {

    public List<Salary> getSalary()
    {
        return salaryRepository.findAll();
    }

    @Autowired
    SalaryRepository salaryRepository;

    public void saveSalary(Salary salary)

    {
        salaryRepository.save(salary);
    }
}
