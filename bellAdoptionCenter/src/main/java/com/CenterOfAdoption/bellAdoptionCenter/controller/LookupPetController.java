package com.CenterOfAdoption.bellAdoptionCenter.controller;

import com.CenterOfAdoption.bellAdoptionCenter.MODEL.LookupPet;
import com.CenterOfAdoption.bellAdoptionCenter.services.LookupPetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("AccessLookup")
public class LookupPetController {
    @Autowired
    private LookupPetService lookupPetService;

    @GetMapping("allLookup")
    public List<LookupPet> getAllLookupPet()
    {
        return lookupPetService.getAllLookupPet();
    }

    @GetMapping("lookupById/{id}")
    public Optional<LookupPet> getLookupPetById(@PathVariable Long id)
    {
        return lookupPetService.getLookupById(id);
    }

    @PostMapping("addLookup")
    public void addLookupPet(@RequestBody LookupPet lookupPet)
    {
        lookupPetService.addLookupPet(lookupPet);
    }

    @DeleteMapping("deleteLookupId/{id}")
    public void deleteLookupsById(Long id)
    {
        lookupPetService.deleteLookupsById(id);
    }



}
