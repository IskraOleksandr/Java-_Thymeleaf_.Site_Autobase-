package com.example.autobase.service.autobaseservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.autobase.dao.cargo.CargoRepository;
import com.example.autobase.dao.destination.DestinationRepository;
import com.example.autobase.dao.driver.DriverRepository;
import com.example.autobase.dao.route.RouteRepository;
import com.example.autobase.dao.salary.SalaryRepository;
import com.example.autobase.dao.truck.TruckRepository;
import com.example.autobase.dao.truckdriver.TruckDriverRepository;
import com.example.autobase.dao.truckrepair.TruckRepairRepository;
import com.example.autobase.dao.user.UserRepository;
import com.example.autobase.model.*;
import com.example.autobase.service.createordrservice.CreateOrderService;
import com.example.autobase.service.order.OrderService;
import com.example.autobase.service.orderroute.OrderRouteService;

import java.util.List;

@Service
public class AutoBaseServiceImpl implements AutoBaseService {

    @Autowired
    private SalaryRepository salaryRepository;

    @Autowired
    private DriverRepository driverRepository;

    @Autowired
    private TruckRepository truckRepository;

    @Autowired
    private TruckDriverRepository truckdriverRepository;

    @Autowired
    private TruckRepairRepository truckrepairRepository;

    @Autowired
    private DestinationRepository destinationRepository;
    @Autowired
    private RouteRepository routeRepository;

    @Autowired
    private CargoRepository cargoRepository;
    @Autowired
    OrderService orderRepository;
    @Autowired
    OrderRouteService orderRouteRepository;
    @Autowired
    CreateOrderService createOrderService;

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Truck> findAllTrucks() {
        return truckRepository.findAll();
    }

    @Override
    public List<Salary> findAllSalary() {
        return salaryRepository.findAll();
    }

    @Override
    public List<TruckDriver> findAllTruckDriver() { return truckdriverRepository.findAll(); }

    @Override
    public List<Driver> findAllDrivers() {
        return driverRepository.findAll();
    }

    @Override
    public List<Destination> findAllDestination() {
        return destinationRepository.findAll();
    }
    @Override
    public List<Cargo> findAllCargos() {
        return cargoRepository.findAll();
    }
    @Override
    public List<Order> findAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public void deleteAllRowsInDB() {
       truckRepository.deleteAll();
       driverRepository.deleteAll();
        truckdriverRepository.deleteAll();
        truckrepairRepository.deleteAll();
        salaryRepository.deleteAll();
        orderRepository.deleteAll();
        routeRepository.deleteAll();

    }

    @Override
    public void saveDriverList(List<Driver> groups) {
        driverRepository.saveAll(groups);
    }

    @Override
    public void saveTruckList(List<Truck> subjects) {
        truckRepository.saveAll(subjects);
    }

    @Override
    public void saveSalaryList(List<Salary> students) {
        salaryRepository.saveAll(students);
    }

    @Override
    public void saveTruckDriverList(List<TruckDriver> teachers) {
        truckdriverRepository.saveAll(teachers);
    }

    @Override
    public void saveTruckRepairList(List<TruckRepair> timetables) {
        truckrepairRepository.saveAll(timetables);
    }

    @Override
    public void saveDestinationList(List<Destination> dest) {
        destinationRepository.saveAll(dest);
    }

    @Override
    public void saveCargoList(List<Cargo> dest) {
        cargoRepository.saveAll(dest);
    }

    @Override
    public void createOrders(int number){
        createOrderService.createOrders(number);
    }
}
