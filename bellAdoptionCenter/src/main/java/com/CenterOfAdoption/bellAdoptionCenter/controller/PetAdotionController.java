package com.CenterOfAdoption.bellAdoptionCenter.controller;

import com.CenterOfAdoption.bellAdoptionCenter.MODEL.PetAdoption;
import com.CenterOfAdoption.bellAdoptionCenter.services.PetAodptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("accessPetAdoption")
public class PetAdotionController {
    @Autowired
    private PetAodptionService petAodptionService;

    @GetMapping("allPetAdoption")
    public List<PetAdoption> getAllPetAdoption()
    {
        return petAodptionService.getAllPetAdoption();
    }

    @GetMapping("petAdoptionById/{id}")
    public Optional<PetAdoption> getPetAdotionById(@PathVariable("id") Long id)
    {
        return petAodptionService.getPetAdotionById(id);
    }

    @PostMapping("addPetAdoption")
    public void addPetAdoption(@RequestBody PetAdoption petAdoption)
    {
        petAodptionService.addPetAdoption(petAdoption);
    }

    @DeleteMapping("deletePetAdoption/{id}")
    public void deleteAdoptionById(@PathVariable Long id)
    {
        petAodptionService.deleteAdoptionById(id);
    }
}
