package com.CenterOfAdoption.bellAdoptionCenter.DAO;

import com.CenterOfAdoption.bellAdoptionCenter.MODEL.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends JpaRepository<Student,Long> {
}
