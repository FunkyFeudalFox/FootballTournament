package com.capgemini.model;

import java.util.ArrayList;
import java.util.List;

public class TournamentLeague {

    private List<Team> teamList = new ArrayList<>();

    public void makeList(){

        teamList.add(new AmateurFootballTeam("PSB", "Stumpie the beaver"));
        teamList.add(new AmateurFootballTeam("FC Bunnik", "Croco"));
        teamList.add(new ProfessionalFootballTeam("Odysseus Amsterdam", "CoolGreen.com"));
        teamList.add(new AmateurFootballTeam("ADA Haaglanden", "John the vulture"));
        teamList.add(new ProfessionalFootballTeam("FC Veenoord", "HEMA"));
        teamList.add(new ProfessionalFootballTeam("FC Medusa", "Markinson Electronics"));
        teamList.add(new AmateurFootballTeam("FC Amstelveen", "Ronnie Racoon"));
        teamList.add(new ProfessionalFootballTeam("FC Hengelo", "Panther Automotive"));

    }

    public List<Team> getTeamList() {
        this.makeList();
        return teamList;
    }
}
