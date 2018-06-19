package com.capgemini.model;

import java.util.Random;

public class AmateurFootballTeam extends Team implements Playable{

    private String drinkingMascotte;

    public String getDrinkingMascotte() {
        return drinkingMascotte;
    }

    public AmateurFootballTeam(String name, String drinkingMascotte) {
        super(name);
        this.drinkingMascotte = drinkingMascotte;
    }



}
