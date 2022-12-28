package com.example.rentalcar;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

// import com.example.library.entity.Library;
// import com.example.library.repository.LibraryRepository;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    Repository repo;

    @RequestMapping("/saveCar")
    @ResponseBody
    public Optional<Carentity> add(@RequestParam String carId, @RequestParam String carModel, @RequestParam String carNo, @RequestParam String Status)
    {
        Carentity car = new Carentity();
        car.setCarId(carId);
        car.setCarModel(carModel);
        car.setCarNo(carNo);
        car.setStatus(Status);
        repo.save(car);

        // return repo.display(carId);
        return repo.findById(carId);
    }

    @RequestMapping("/editCar")
    @ResponseBody
    public Optional<Carentity> add(@RequestParam String carId)
    {
        Carentity car = new Carentity();
        car.setStatus("booked");
        repo.save(car);
        return repo.findById(carId);
    }

    @RequestMapping("/getCar")
    @ResponseBody
    public Optional<Carentity> getc(@RequestParam String carId)
    {
        return repo.findById(carId);
    }

    @RequestMapping("/getCars")
    @ResponseBody
    public List<Carentity> getcars()
    {
        return repo.findAll();
    }

    @RequestMapping("/deleteCar")
	@ResponseBody
	public Optional<Carentity> delete(@RequestParam String carId) 
	{
	      repo.deleteById(carId);
	      return repo.findById(carId);
	}
}
