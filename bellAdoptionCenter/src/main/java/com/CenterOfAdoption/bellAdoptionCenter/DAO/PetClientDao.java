package com.CenterOfAdoption.bellAdoptionCenter.DAO;

import com.CenterOfAdoption.bellAdoptionCenter.MODEL.PetClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PetClientDao extends JpaRepository<PetClient,Long> {

/*
    @Modifying
    @Query(" UPDATE PetClient p SET  p.clientFname =:clientFname  WHERE p.clientId= petClientId ")
    public void updateFnamePetClient (@Param("clientFname") String Fname ,@Param("petClientId") Long petClientId);


 */
}