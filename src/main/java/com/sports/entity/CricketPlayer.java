package com.sports.entity;

import jakarta.persistence.*;
@Entity
@Table
public class CricketPlayer {
    @Id
    @Column
    private int playerId;
    @Column
    private String playerName;
    @Column
    private int playerAge;
    @Column
    private String teamName;
    @Column
    private int jerseyNumber;

    @Enumerated(EnumType.STRING)
    @Column
    private PlayerPosition position;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "total Matches", referencedColumnName = "id")
    private TotalMatches totalMatches;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerAge() {
        return playerAge;
    }

    public void setPlayerAge(int playerAge) {
        this.playerAge = playerAge;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public PlayerPosition getPosition() {
        return position;
    }

    public void setPosition(PlayerPosition position) {
        this.position = position;
    }

    public TotalMatches getTotalMatches() {
        return totalMatches;
    }

    public void setTotalMatches(TotalMatches totalMatches) {
        this.totalMatches = totalMatches;
    }

    public CricketPlayer(String playerName, int playerAge, String teamName, int jerseyNumber, PlayerPosition position, TotalMatches totalMatches) {
        this.playerName = playerName;
        this.playerAge = playerAge;
        this.teamName = teamName;
        this.jerseyNumber = jerseyNumber;
        this.position = position;
        this.totalMatches = totalMatches;
    }
    public CricketPlayer() {}
}
