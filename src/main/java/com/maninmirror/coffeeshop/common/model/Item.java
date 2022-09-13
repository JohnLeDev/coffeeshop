package com.maninmirror.coffeeshop.common.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String quantity;

    private String itemNumber;

    private String itemCode;

    private String Location;

    private String description;
    
}
