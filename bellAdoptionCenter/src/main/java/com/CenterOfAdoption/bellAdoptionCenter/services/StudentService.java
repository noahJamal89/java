package com.CenterOfAdoption.bellAdoptionCenter.services;

import com.CenterOfAdoption.bellAdoptionCenter.DAO.StudentDao;
import com.CenterOfAdoption.bellAdoptionCenter.MODEL.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentDao studentDao;
    public List<Student> getAllStudent() {
       return studentDao.findAll();
    }
}
