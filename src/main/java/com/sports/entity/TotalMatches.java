package com.sports.entity;

import jakarta.persistence.*;

@Entity
@Table
public class TotalMatches {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column
    private int t20Matches;
    @Column
    private int odiMatches;
    @Column
    private int testMatches;

    public int getT20Matches() {
        return t20Matches;
    }
    public void setT20Matches(int t20Matches) {
        this.t20Matches = t20Matches;
    }
    public int getOdiMatches() {
        return odiMatches;
    }
    public void setOdiMatches(int odiMatches) {
        this.odiMatches = odiMatches;
    }
    public int getTestMatches() {
        return testMatches;
    }
    public void setTestMatches(int testMatches) {
        this.testMatches = testMatches;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public TotalMatches(int t20Matches, int odiMatches, int testMatches) {
        this.t20Matches = t20Matches;
        this.odiMatches = odiMatches;
        this.testMatches = testMatches;
    }
    public TotalMatches() {

    }
}
