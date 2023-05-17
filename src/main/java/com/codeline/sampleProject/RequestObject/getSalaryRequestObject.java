package com.codeline.sampleProject.RequestObject;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class getSalaryRequestObject {

    Double amount;

    String currency;

    Integer allowances;

}
