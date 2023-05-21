package com.codeline.sampleProject.ResponseObject;


import com.codeline.sampleProject.Models.Account;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetAccountResponse {

    String bankName;

    Integer accountNumber;

    String bankBranch;

    public GetAccountResponse(String success, Account account) {
    }
}
