//1
//This class defines all the variables to use and using the annotations actually creates the table in the database
//with the given values as the table row head names.
//Getters and Setters retrieve and change all the values as needed.
//@Table annotation defines the name of the table that will be created.
//@Id annotation specifies which variable will function as the row id.
//@GeneratedValue generates primary keys.
//@Entity specifies that this java class is the class that handles table creation.
package com.javawebapplication.cowcalftracker.model;

import javax.persistence.*;

@Entity
@Table(name = "cattle")
public class Cattle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "NameOfHerd")
    private String herdName;

    @Column(name = "NumberOfCattle")
    private int numCattle;

    @Column(name = "NumberOfCalves")
    private int numCalves;

    @Column(name = "LastDateChecked")
    private String dateChecked;

    public long getId() {
        return id;
    }

    public String getHerdName() {
        return herdName;
    }

    public void setHerdName(String herdName) {
        this.herdName = herdName;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumCattle() {
        return numCattle;
    }

    public void setNumCattle(int numCattle) {
        this.numCattle = numCattle;
    }

    public int getNumCalves() {
        return numCalves;
    }

    public void setNumCalves(int numCalves) {
        this.numCalves = numCalves;
    }

    public String getDateChecked() {
        return dateChecked;
    }

    public void setDateChecked(String dateChecked) {
        this.dateChecked = dateChecked;
    }
}
