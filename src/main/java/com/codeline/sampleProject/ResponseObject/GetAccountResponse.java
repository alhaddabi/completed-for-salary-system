package com.codeline.sampleProject.ResponseObject;


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
}
