package com.test.newgame.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OwnedGames {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int igdbGameId;

    public OwnedGames() {
    }

    public OwnedGames(int id) {
        this.id = id;
    }


    public int getIgdbGameId() {
        return igdbGameId;
    }

    public void setIgdbGameId(int igdbGameId) {
        this.igdbGameId = igdbGameId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "OwnedGames{" +
                "id=" + id +
                '}';
    }

}
