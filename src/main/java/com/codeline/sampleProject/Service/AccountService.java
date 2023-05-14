package com.codeline.sampleProject.Service;

import com.codeline.sampleProject.Models.Account;
import com.codeline.sampleProject.Models.Employee;
import com.codeline.sampleProject.Repository.AccountRepository;
import com.codeline.sampleProject.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AccountService {

    public List<Account> getAccount()
    {
        return accountRepository.findAll();
    }

    @Autowired
    AccountRepository accountRepository;

    public void saveAccount(Account account)

    {
        accountRepository.save(account);
    }

}

