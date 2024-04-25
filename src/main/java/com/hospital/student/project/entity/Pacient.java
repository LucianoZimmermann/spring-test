package com.hospital.student.project.entity;

import com.hospital.student.project.entity.enums.Priority;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "tb_pacient")
public class Pacient implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;

    private Priority priority;

    public Pacient() {
    }

    public Pacient(Long id, String firstName, String lastName, Priority priority) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.priority =  priority;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Priority getPriority() {
        return priority;
    }
    public void setPriority(Priority priority) {
        this.priority = priority;
    }
}
