package com.maninmirror.coffeeshop.common.model;

import java.util.Set;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID employeeId;
    
    private String city;

    private String address;

    private String employeeName;

    private String phoneNumber;

    private String state;

    @OneToOne(mappedBy = "manager")
    private CoffeeShop coffeeShop;


    @OneToMany(mappedBy = "manager")
    private Set<Order> orders;
}
