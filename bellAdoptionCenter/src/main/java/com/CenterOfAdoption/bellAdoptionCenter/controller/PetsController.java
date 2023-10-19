package com.CenterOfAdoption.bellAdoptionCenter.controller;

import com.CenterOfAdoption.bellAdoptionCenter.MODEL.Pet;
import com.CenterOfAdoption.bellAdoptionCenter.services.PetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("PetsAccess")
public class PetsController {

    @Autowired
   private PetsService petsService;


    @GetMapping("AllPets")
    public List<Pet> getAllPets()
    {
        System.out.println("hi");
        return petsService.getAllPets();
}

    @GetMapping("petById/{id}")
    public Optional<Pet> getPetById(@PathVariable("id") Long id)
    {
        return petsService.getPetById(id);
    }
    @PostMapping("AddPet")
    public void addPet(@RequestBody Pet pet)
    {
        petsService.addPet(pet);
    }
    @DeleteMapping("deletePet/{id}")
    public void deletePetById(@PathVariable Long id)
    {
        petsService.deletePetById(id);
    }
    @DeleteMapping("deleteByPet/{name}")
    public void deletePetByName(@PathVariable("name") String petName)
    {
        petsService.deletePetByName(petName);
    }
}
