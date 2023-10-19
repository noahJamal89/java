package com.CenterOfAdoption.bellAdoptionCenter.services;

import com.CenterOfAdoption.bellAdoptionCenter.DAO.LaptopDao;
import com.CenterOfAdoption.bellAdoptionCenter.MODEL.Laptop;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service

public class LaptopService {
    @Autowired
     LaptopDao laptopDao;


    public List<Laptop> getAllLaptop() {
        System.out.println("hh");
        return laptopDao.findAll();

    }

    public void addNewLaptob(Laptop laptop) {
        laptopDao.save(laptop);
    }

    public void deleteLaptop(Long id) {
        laptopDao.deleteById(id);
    }
}
