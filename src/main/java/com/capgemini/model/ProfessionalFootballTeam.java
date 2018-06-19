package com.capgemini.model;

import java.util.Random;

public class ProfessionalFootballTeam extends Team implements Playable{

    private String sponsor;

    public String getSponsor() {
        return sponsor;
    }

    public ProfessionalFootballTeam(String name, String sponsor) {
        super(name);
        this.sponsor = sponsor;
    }

}
