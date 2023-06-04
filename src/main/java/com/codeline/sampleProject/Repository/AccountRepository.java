package com.codeline.sampleProject.Repository;

import com.codeline.sampleProject.Models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    @Query("SELECT a FROM Account a WHERE a.accountNumber=:accountNumber")
    Account getAccountByAccountNumber(@Param("accountNumber") String accountNumber);


    @Query("SELECT cc FROM Account cc WHERE cc.bankName=:BankName")
    Account getBankByName(@Param("BankName") String BankName);


    @Query("SELECT a FROM Account a WHERE a.bankBranch=:BankBranch")
    List<Account> getBankByBranch(@Param("BankBranch") String BankName);




}
