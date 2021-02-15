package org.sid.bilingservice.entities;

import org.sid.bilingservice.model.Customer;
import org.sid.bilingservice.model.Product;

import javax.persistence.*;

@Entity
public class ProductItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double quantity;
    private double price;
    private long productID;
    @ManyToOne
    private Bill bill;
    @Transient
    private Customer customer;
    @Transient
    private Product product;


}
