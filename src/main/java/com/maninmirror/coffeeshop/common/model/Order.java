package com.maninmirror.coffeeshop.common.model;

import java.sql.Date;
import java.sql.Time;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "order_bill")
public class Order {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private UUID orderId;

    private String itemName;

    private String quanity;

    private Date date;

    private Time timeOrder;

    @ManyToOne
    @JoinColumn(name = "order_bill" , nullable = false)
    private Manager manager;

    
}
