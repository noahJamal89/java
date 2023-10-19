package com.CenterOfAdoption.bellAdoptionCenter.DAO;

import com.CenterOfAdoption.bellAdoptionCenter.MODEL.PetAdoption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetAdoptionDao extends JpaRepository<PetAdoption,Long> {


}
