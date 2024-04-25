package com.hospital.student.project.service;


import com.hospital.student.project.entity.Pacient;
import com.hospital.student.project.respository.PacientRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PacientService {

    @Autowired
    public PacientRepository  pacientRepository;

    public List<Pacient> findAll() {
        return pacientRepository.findAll();
    }

}
