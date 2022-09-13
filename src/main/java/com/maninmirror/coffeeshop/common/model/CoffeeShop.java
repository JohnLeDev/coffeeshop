package com.maninmirror.coffeeshop.common.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class CoffeeShop {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String phoneNumber;
    
    private String address;

    private String city;

    private String state;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="employeeId" , referencedColumnName = "employeeId")
    private Manager manager;
}
