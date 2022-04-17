package org.home.agent;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Agent extends PanacheEntity {

    public String name;

    public String country;

    public void setCountry(String country) {
        this.country = country;
    }

}
