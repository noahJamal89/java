package com.CenterOfAdoption.bellAdoptionCenter.services;

import com.CenterOfAdoption.bellAdoptionCenter.DAO.LookupPetDao;
import com.CenterOfAdoption.bellAdoptionCenter.MODEL.LookupPet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LookupPetService {
    @Autowired
    LookupPetDao lookupPetDao;
    public List<LookupPet> getAllLookupPet() {
        return  lookupPetDao.findAll();
    }


    public Optional<LookupPet> getLookupById(Long id) {
        return lookupPetDao.findById(id);
    }

    public void addLookupPet(LookupPet lookupPet) {
        lookupPetDao.save(lookupPet);
    }

    public void deleteLookupsById(Long id) {
        lookupPetDao.deleteById(id);
    }
}
