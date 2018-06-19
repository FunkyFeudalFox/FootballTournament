package com.capgemini.model;

import java.util.Random;

public class AmateurFootballTeam extends Team implements Playable{

    private String drinkingMascotte;

    public AmateurFootballTeam(String name, String drinkingMascotte) {
        super(name);
        this.drinkingMascotte = drinkingMascotte;
    }

    public int play(){
        Random random = new Random();
        return random.nextInt(5);
    }
}
