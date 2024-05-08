package com.springboot.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "state")
@Data
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;

    @Column
    private int countryId;

    @Column
    private String name;
}
