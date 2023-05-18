package com.codeline.sampleProject.ResponseObject;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class GetSalaryResponse {

    Double amount;

    String currency;

    Integer allowances;
}


