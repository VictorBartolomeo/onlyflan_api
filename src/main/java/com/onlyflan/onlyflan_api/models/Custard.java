package com.onlyflan.onlyflan_api.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Custard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Column(unique = true, nullable = false)
    protected String name;

    @Column(columnDefinition = "TEXT")
    protected String description;

//    protected String image;

    @DecimalMin(value = "0.1")
    @Column(columnDefinition = "DECIMAL(4,2)", nullable = false)
    protected double price;

}
