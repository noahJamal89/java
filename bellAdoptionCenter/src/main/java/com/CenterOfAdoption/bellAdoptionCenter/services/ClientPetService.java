package com.CenterOfAdoption.bellAdoptionCenter.services;

import com.CenterOfAdoption.bellAdoptionCenter.DAO.PetClientDao;
import com.CenterOfAdoption.bellAdoptionCenter.MODEL.PetClient;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ClientPetService {

      @Autowired
      PetClientDao petClientDao;


    public List<PetClient> getAllPetClient() {
        return  petClientDao.findAll();
    }

    public Optional<PetClient> getClientById(Long id) {
        return  petClientDao.findById(id);
    }

    public void addPetClient(PetClient petClient) {
        petClientDao.save(petClient);
    }

    public void deletePetClientById(Long id) {
        petClientDao.deleteById(id);
    }

    /*
    public void editPetClient(Long id, PetClient petClient) {
        petClient =petClientDao.findById(id).orElseThrow(() -> new ResourceNotFoundException("question not exist with id: " + id));
        petClientDao.save(petClient);
    }

     */

    /*
    @Transactional
    public void editPetClient(Long id, PetClient petClient) {

        petClientDao.updateFnamePetClient(petClient.getClientFname() ,id);

    }
    */


}
