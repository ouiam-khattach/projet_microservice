package org.sid.bilingservice.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
public class Customer {

    private Long id;
    private String name;
    private String email;

}
