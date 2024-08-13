package com.example.autobase.service.truckdriverservice;

import com.example.autobase.model.TruckDriver;

import java.util.List;
import java.util.Optional;

public interface TruckDriverService {
    void save(TruckDriver teacher) ;

    int[] saveStudentsList(List<TruckDriver> teachers) ;

    void update(TruckDriver teacher) ;

    void delete(TruckDriver teacher) ;

    List<TruckDriver> findAll() ;

    void deleteAll() ;


    Optional<TruckDriver> findById(Long id);
}
