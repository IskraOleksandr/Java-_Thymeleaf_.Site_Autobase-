package com.example.autobase.service.orderroute;

import com.example.autobase.model.OrderRoute;

import java.util.List;

public interface OrderRouteService {
    void save(OrderRoute group) ;

    int[] saveStudentsList(List<OrderRoute> groups) ;

    void update(OrderRoute group) ;

    void delete(OrderRoute group) ;

    List<OrderRoute> findAll() ;

    void deleteAll() ;

    List<OrderRoute> findByIdLike(Long id);
}
