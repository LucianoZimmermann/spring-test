package com.hospital.student.project.controller;

import com.hospital.student.project.entity.Pacient;
import com.hospital.student.project.respository.PacientRepository;
import com.hospital.student.project.service.PacientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacient")
public class PacientController {

    @Autowired
    private PacientRepository pacientRepository;
    private PacientService pacientService;

    @GetMapping
    public ResponseEntity<List<Pacient>> getAllPacients() {
        List<Pacient> pacients = pacientService.findAll();
        return ResponseEntity.ok().body(pacients);
    }
    @PostMapping
    public Pacient savePacient(@RequestBody Pacient pacient) {
        Pacient newPacient = pacientRepository.save(pacient);
        return newPacient;
    }

    @GetMapping(value = "/{id}")
    public Pacient getPacientById(@PathVariable Long id) {
        Pacient pacient = pacientRepository.findById(id).get();
        return pacient;
    }

    @PutMapping
    public ResponseEntity updatePacient(@RequestBody Pacient pacient) {
        Pacient pacientUpdated = pacientRepository.getReferenceById(pacient.getId());
        pacientUpdated.setFirstName(pacient.getFirstName());
        pacientUpdated.setLastName(pacient.getLastName());
        pacientUpdated.setPriority(pacient.getPriority());
        return ResponseEntity.ok(pacientUpdated);
    }
}
