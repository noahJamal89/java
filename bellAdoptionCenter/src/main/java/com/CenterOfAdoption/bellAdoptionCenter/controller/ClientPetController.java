package com.CenterOfAdoption.bellAdoptionCenter.controller;


import com.CenterOfAdoption.bellAdoptionCenter.MODEL.PetClient;
import com.CenterOfAdoption.bellAdoptionCenter.services.ClientPetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("accessClientPet")
public class ClientPetController {

    @Autowired
    private ClientPetService clientPetService;

    @GetMapping("allClientPet")
    public List<PetClient> getAllPetClient()
    {
        return clientPetService.getAllPetClient();
    }

    @GetMapping("clientById/{id}")
    public Optional<PetClient> getClientById(@PathVariable Long id)
    {
        return clientPetService.getClientById(id);
    }

    @PostMapping("addPetClient")
    public void addPetClient(@RequestBody PetClient petClient)
    {
        clientPetService.addPetClient(petClient);

    }

   /* @PutMapping("updatePetClient/{id}")
    public void editPetClient(@PathVariable Long id, @RequestBody PetClient petClient)
    {
        clientPetService.editPetClient(id,petClient);
    }


    */

    @DeleteMapping("deletePetClient/{id}")
    public void deletePetClientById(@PathVariable Long id){
        clientPetService.deletePetClientById(id);
    }
}
