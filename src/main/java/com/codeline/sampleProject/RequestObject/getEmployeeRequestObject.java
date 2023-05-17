package com.codeline.sampleProject.RequestObject;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class getEmployeeRequestObject {

    String name;
    String department;
    String gender;
}
