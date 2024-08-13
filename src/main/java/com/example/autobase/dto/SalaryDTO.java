package com.example.autobase.dto;

import lombok.Getter;
import lombok.Setter;
import com.example.autobase.model.Salary;

import java.util.List;

@Getter
@Setter
public class SalaryDTO {

    private List<Salary> salary;

    private double allSumma;
    
    private String name;
}
