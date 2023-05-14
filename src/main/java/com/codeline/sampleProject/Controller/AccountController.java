package com.codeline.sampleProject.Controller;

import com.codeline.sampleProject.Models.Account;
import com.codeline.sampleProject.Models.Employee;
import com.codeline.sampleProject.Service.AccountService;
import com.codeline.sampleProject.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class AccountController {


    @Autowired
    AccountService accountService;

    @RequestMapping("Account/create")
    public void saveAccount()
    {
        createAccount();
    }

    @RequestMapping("account/get")
    public List<Account> getAccount ()
    {
        return accountService.getAccount();
    }
    public void createAccount() {

        Account account = new Account();
        account.setAccountNumber(46456546);
        account.setAccountHolderName("Adnan AL-Haddabi");
        account.setCreatedDate(new Date());
        account.setBranchCode(1254);
        account.setSwiftCode("14525");
        account.setBankBranch("Muscat");
        accountService.saveAccount(account);
    }
}
