package com.CenterOfAdoption.bellAdoptionCenter.services;


import com.CenterOfAdoption.bellAdoptionCenter.DAO.PetAdoptionDao;
import com.CenterOfAdoption.bellAdoptionCenter.MODEL.PetAdoption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetAodptionService {
    @Autowired
    private PetAdoptionDao petAdoptionDao;

    public List<PetAdoption> getAllPetAdoption() {
        return petAdoptionDao.findAll();
    }

    public Optional<PetAdoption> getPetAdotionById(Long id) {
        return petAdoptionDao.findById(id); }

    public void addPetAdoption(PetAdoption petAdoption) {
        petAdoptionDao.save(petAdoption);
    }

    public void deleteAdoptionById(Long id) {
        petAdoptionDao.deleteById(id);
    }
}
