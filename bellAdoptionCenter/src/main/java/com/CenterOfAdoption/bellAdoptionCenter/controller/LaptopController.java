package com.CenterOfAdoption.bellAdoptionCenter.controller;

import com.CenterOfAdoption.bellAdoptionCenter.MODEL.Laptop;
import com.CenterOfAdoption.bellAdoptionCenter.services.LaptopService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("AccessLaptop")
public class LaptopController {
    @Autowired
     LaptopService laptopService;

    @GetMapping("AllLaptop")
    public List<Laptop> getAllLaptop()
    {
        return laptopService.getAllLaptop();
    }
    @PostMapping("AddLaptop")
    public void addNewLaptob(@RequestBody Laptop laptop)
    {
        laptopService.addNewLaptob(laptop);
    }
    @DeleteMapping("DeleteLaptopById/{id}")
    public void deleteLaptop(@PathVariable Long id)
    {
        laptopService.deleteLaptop(id);

    }
}
