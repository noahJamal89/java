package com.CenterOfAdoption.bellAdoptionCenter.DAO;

import com.CenterOfAdoption.bellAdoptionCenter.MODEL.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopDao extends JpaRepository<Laptop,Long> {
}
