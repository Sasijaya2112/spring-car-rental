package com.example.rentalcar;


import java.util.List;
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
    public List<Carentity> add(@RequestParam String carId, @RequestParam String carModel, @RequestParam String carNo, @RequestParam String Status)
    {
        Carentity car = new Carentity();
        car.setCarId(carId);
        car.setCarModel(carModel);
        car.setCarNo(carNo);
        car.setStatus(Status);
        repo.save(car);

        return repo.display(carId);

    }

    @RequestMapping("/editCar")
    @ResponseBody
    public List<Carentity> add(@RequestParam String carId)
    {
        Carentity car = new Carentity();
        car.setStatus("booked");
        repo.save(car);
        return repo.print(carId);
    }

    @RequestMapping("/getCar")
    @ResponseBody
    public List<Carentity> getc(@RequestParam String carId)
    {
        return repo.get(carId);
    }

    @RequestMapping("/getCars")
    @ResponseBody
    public List<Carentity> getcars(@RequestParam String carId)
    {
        return repo.findAll();
    }

    @RequestMapping("/deleteCar")
	@ResponseBody
	public List<Carentity> delete(@RequestParam String carId) 
	{
	      repo.deleteById(carId);
	      return repo.delete(carId);
	}
}
