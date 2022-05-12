package com.beb97.p6.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Transaction {
    @Id
    @GeneratedValue
    private int id;

//    User source;
//    User target;
}
