package com.javawebapplication.cowcalftracker.model;

import javax.persistence.*;

@Entity
@Table(name = "cattle")
public class Cattle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "NumberOfCattle")
    private int NumberOfCattle;

    @Column(name = "NumberOfCalves")
    private int NumberOfCalves;

    @Column(name = "LastDateChecked")
    private String LastDateChecked;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumberOfCattle() {
        return NumberOfCattle;
    }

    public void setNumberOfCattle(int numberOfCattle) {
        NumberOfCattle = numberOfCattle;
    }

    public int getNumberOfCalves() {
        return NumberOfCalves;
    }

    public void setNumberOfCalves(int numberOfCalves) {
        NumberOfCalves = numberOfCalves;
    }

    public String getLastDateChecked() {
        return LastDateChecked;
    }

    public void setLastDateChecked(String lastDateChecked) {
        LastDateChecked = lastDateChecked;
    }
}
