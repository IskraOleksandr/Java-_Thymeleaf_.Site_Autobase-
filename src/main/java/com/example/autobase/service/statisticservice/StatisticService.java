package com.example.autobase.service.statisticservice;

import com.example.autobase.dto.SalaryDTO;
import com.example.autobase.model.Order;

import java.util.List;

public interface StatisticService {
    SalaryDTO findDriver();
    String findCargo();
    String findDestination();
    String findMinWeightCargo();
    List<Order> findCargoIn();
}
