package com.hospital.student.project.respository;

import com.hospital.student.project.entity.Pacient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacientRepository extends JpaRepository<Pacient, Long> {
}
