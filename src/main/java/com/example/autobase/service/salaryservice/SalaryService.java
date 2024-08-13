package com.example.autobase.service.salaryservice;

import com.example.autobase.model.Salary;

import java.util.List;

public interface SalaryService {
    void save(Salary student) ;

    int[] saveStudentsList(List<Salary> students) ;

    void update(Salary student) ;

    void delete(Salary student) ;

    List<Salary> findAll() ;

    void deleteAll() ;



    List<Salary> findByIdLike(Long id);

}
