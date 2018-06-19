package com.capgemini.model;

import java.util.Random;

public class ProfessionalFootballTeam extends Team implements Playable{

    private String sponsor;

    public ProfessionalFootballTeam(String name, String sponsor) {
        super(name);
        this.sponsor = sponsor;
    }

    public int play(){
        Random random = new Random();
        return random.nextInt(5);
    }
}
