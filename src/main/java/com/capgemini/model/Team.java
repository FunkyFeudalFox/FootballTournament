package com.capgemini.model;

import java.util.Random;

public abstract class Team {
    private String name;

    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Team(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int play(){
        Random random = new Random();
        score = random.nextInt(6);
        return score;
    }

}
