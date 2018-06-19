package com.capgemini;

import com.capgemini.model.AmateurFootballTeam;
import com.capgemini.model.ProfessionalFootballTeam;
import com.capgemini.model.Team;
import com.capgemini.model.TournamentLeague;

import java.util.List;

public class FootballTournamentApp {
    public static void main(String[] args) {


        System.out.println("Welcome to the annual National Football league!");

        TournamentLeague leage = new TournamentLeague();

        List<Team> teamList = leage.getTeamList();


    }

    public void match(Team team1, Team team2) {

        int team1Score;
        int team2Score;
        String team1Name;
        String team2Name;
        team1Score = team1.play();
        team1Name = team1.getName();
        team2Score = team2.play();
        team2Name = team2.getName();


        if (team1Score == team2Score) {
            System.out.println("Gelijkspel! " + team1Name + ": " + team1Score + " " + team2Name + ": " + team2Score);
        }

        System.out.println("Penalties!");

        while ( team1Score == team2Score){
            
        }

    }
}
