package com.CenterOfAdoption.bellAdoptionCenter.services;

import com.CenterOfAdoption.bellAdoptionCenter.DAO.MedicalPetDao;
import com.CenterOfAdoption.bellAdoptionCenter.MODEL.MedicalPet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicalPetService {
   @Autowired
    MedicalPetDao medicalPetDao;
    public List<MedicalPet> getAllMEdicalPet() {
        return medicalPetDao.findAll();
    }

    public Optional<MedicalPet> getMedicalById(Long id) {
          return medicalPetDao.findById(id);
    }

    public void addMedicalPet(MedicalPet medicalPet) {

    medicalPetDao.save(medicalPet);
    }


    public void deleteMedicalPet(Long id) {

        medicalPetDao.deleteById(id);
    }
}
