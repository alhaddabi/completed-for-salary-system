package com.codeline.sampleProject.Service;

import com.codeline.sampleProject.Models.Account;
import com.codeline.sampleProject.Models.Employee;
import com.codeline.sampleProject.Models.Manager;
import com.codeline.sampleProject.Models.Salary;
import com.codeline.sampleProject.Repository.AccountRepository;
import com.codeline.sampleProject.Repository.SalaryRepository;
import com.codeline.sampleProject.ResponseObject.GetManagerResponse;
import com.codeline.sampleProject.ResponseObject.GetSalaryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalaryService {

    public List<Salary> getSalary() {
        return salaryRepository.findAll();
    }

    @Autowired
    SalaryRepository salaryRepository;

    public void saveSalary(Salary salary) {
        salaryRepository.save(salary);
    }


    public GetSalaryResponse getSalaryById(Long salaryId) {
        Optional<Salary> optionalSalary = salaryRepository.findById(salaryId);
        if (!optionalSalary.isEmpty()) {
            Salary salary = optionalSalary.get();
            GetSalaryResponse managerResponse = new GetSalaryResponse(salary.getAmount(), salary.getCurrency(), salary.getAllowances());
            return managerResponse;
        } else {
            return null;
        }


    }

}
