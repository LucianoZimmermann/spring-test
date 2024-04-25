package com.hospital.student.project.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_queue")
public class Queue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Pacient pacient;

    public Queue(Long id, Pacient pacient) {
        this.id = id;
        this.pacient = pacient;
    }

    public Queue() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pacient getPacient() {
        return pacient;
    }

    public void setPacient(Pacient pacient) {
        this.pacient = pacient;
    }
}
