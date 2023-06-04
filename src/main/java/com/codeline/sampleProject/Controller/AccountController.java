package com.codeline.sampleProject.Controller;

import com.codeline.sampleProject.Models.Account;
import com.codeline.sampleProject.Models.Employee;
import com.codeline.sampleProject.Models.Salary;
import com.codeline.sampleProject.ResponseObject.GetAccountResponse;
import com.codeline.sampleProject.ResponseObject.GetEmployeeResponse;
import com.codeline.sampleProject.Service.AccountService;
import com.codeline.sampleProject.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping("account/get/{accountId}")
    public GetAccountResponse createAccount (@PathVariable Long accountId)
    {
        return accountService.getAccountById(accountId);
    }



    public void createAccount() {

        Account account = new Account();
        account.setBankName("Bank Muscat");
        account.setAccountNumber(48484848);
        account.setAccountHolderName("Ali Mohammed ");
        account.setCreatedDate(new Date());
        account.setBranchCode(201346);
        account.setSwiftCode("14525");
        account.setBankBranch("Muscat");
        accountService.saveAccount(account);
    }
    @RequestMapping("account/getByAccountNumber")
    public Account getAccountByAccountNumber(@RequestParam String accountNumber){
        return accountService.getAccountByAccountNumber(accountNumber);
    }
}
