package com.CenterOfAdoption.bellAdoptionCenter.DAO;

import com.CenterOfAdoption.bellAdoptionCenter.MODEL.MedicalPet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalPetDao extends JpaRepository<MedicalPet,Long> {



}
