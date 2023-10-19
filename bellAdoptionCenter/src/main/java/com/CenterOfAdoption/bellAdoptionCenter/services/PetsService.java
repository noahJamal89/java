package com.CenterOfAdoption.bellAdoptionCenter.services;

import com.CenterOfAdoption.bellAdoptionCenter.DAO.PetsDao;
import com.CenterOfAdoption.bellAdoptionCenter.MODEL.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service

public class PetsService {

    @Autowired
    PetsDao petsDao;
    public List<Pet> getAllPets() {
        return petsDao.findAll();

    }

    public Optional<Pet> getPetById(Long id) {
        return  petsDao.findById(id);
    }

    public void addPet(Pet pet) {
     petsDao.save(pet);
    }

    public void deletePetById(Long id) {
     petsDao.deleteById(id);
    }
    @Transactional
    public void deletePetByName(String petName)
    {
      petsDao.deleteByPetName(petName);
    }
}
