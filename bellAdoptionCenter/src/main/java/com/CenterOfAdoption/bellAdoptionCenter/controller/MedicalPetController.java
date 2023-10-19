package com.CenterOfAdoption.bellAdoptionCenter.controller;

import com.CenterOfAdoption.bellAdoptionCenter.MODEL.MedicalPet;
import com.CenterOfAdoption.bellAdoptionCenter.services.MedicalPetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("accessMedicalPet")
public class MedicalPetController {

    @Autowired
    private MedicalPetService medicalPetService;

    @GetMapping("allMedicalPet")
    public List<MedicalPet> getAllMedicalPet()
    {
        return medicalPetService.getAllMEdicalPet();
    }

    @GetMapping("MedicalPetById/{id}")
    public Optional<MedicalPet> getMedicalById(@PathVariable("id") Long id)
    {
        return  medicalPetService.getMedicalById(id);
    }

    @PostMapping("addMedicalPet")
    public void addMedicalPet(@RequestBody MedicalPet medicalPet)
    {
        medicalPetService.addMedicalPet(medicalPet);
    }

    @DeleteMapping("deleteMedical/{id}")
    public void deleteMedicalPet(@PathVariable Long id)
    {
        medicalPetService.deleteMedicalPet(id);
    }





}
