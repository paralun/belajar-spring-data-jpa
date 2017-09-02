package com.paralun.app.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_player")
public class Player implements Serializable{
    
    @Id
    @GeneratedValue
    @Column(name = "id", unique = true)
    private Long id;
    @Column(name = "player_name", length = 20)
    private String playerName;
    @Column(name = "age")
    private Integer age;
    @Column(name = "position")
    private String position;
    @Column(name = "region")
    private String region;
    @Column(name = "team")
    private String team;

    public Player() {
    }

    public Player(String playerName, Integer age, String position, String region, String team) {
        this.playerName = playerName;
        this.age = age;
        this.position = position;
        this.region = region;
        this.team = team;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    } 
}
