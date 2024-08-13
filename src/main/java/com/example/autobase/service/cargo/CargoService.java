package com.example.autobase.service.cargo;

import com.example.autobase.model.Cargo;

import java.util.List;

public interface CargoService {
    void save(Cargo group) ;

    int[] saveStudentsList(List<Cargo> groups) ;

    void update(Cargo group) ;

    void delete(Cargo group) ;

    List<Cargo> findAll() ;

    void deleteAll() ;

    List<Cargo> findByIdLike(Long id);
}
