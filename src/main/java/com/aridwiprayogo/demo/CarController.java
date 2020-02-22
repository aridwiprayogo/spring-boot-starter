package com.aridwiprayogo.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/cars")
public class CarController {
    private final CarRepository carRepository;

    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @GetMapping
    public Iterable<Car> getCars(){
        return carRepository.findAll();
    }
    @PostMapping
    public Car addNewCar(@RequestBody Car car){
        return carRepository.save(car);
    }
    @GetMapping("/{id}")
    public Optional<Car> getCarById(@PathVariable("id")String id){
        return carRepository.findById(Long.valueOf(id));
    }
    @DeleteMapping("/{id}")
    public void deleteCarById(@PathVariable("id")Long id){
        carRepository.deleteById(id);
    }
}
