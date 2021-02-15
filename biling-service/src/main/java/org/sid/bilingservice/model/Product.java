package org.sid.bilingservice.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
public class Product {

    private long id;
    private double price;
    private double quantity;


}
