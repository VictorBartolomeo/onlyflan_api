package com.onlyflan.onlyflan_api.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Customer extends User {

//    protected boolean isPremium=false;

    protected LocalDate creationDate;

}
