package com.capgemini;

import com.capgemini.model.AmateurFootballTeam;
import com.capgemini.model.ProfessionalFootballTeam;
import com.capgemini.model.Team;
import com.capgemini.model.TournamentLeague;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FootballTournamentApp {
    public static void main(String[] args) {


        System.out.println("Welkom bij de National Football league!");

        TournamentLeague league = new TournamentLeague();

        List<Team> teamList = league.getTeamList();

        List<Team> kwartFinale = new ArrayList<>();

        List<Team> halveFinale = new ArrayList<>();

        List<Team> finale = new ArrayList<>();

        System.out.println();
        System.out.println("Kwartfinale: ");
        kwartFinale.add(match(teamList.get(0), teamList.get(1)));
        kwartFinale.add(match(teamList.get(2), teamList.get(3)));
        kwartFinale.add(match(teamList.get(4), teamList.get(5)));
        kwartFinale.add(match(teamList.get(6), teamList.get(7)));

        System.out.println();
        System.out.println("Halve finale: ");

        halveFinale.add(match(kwartFinale.get(0), kwartFinale.get(1)));
        halveFinale.add(match(kwartFinale.get(2), kwartFinale.get(3)));

        System.out.println();
        System.out.println("Finale: ");

        finale.add(match(halveFinale.get(0), halveFinale.get(1)));
        winner(finale.get(0));


    }

    public static Team match(Team team1, Team team2) {

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
            System.out.println("Penalties!");

        }

        while (team1Score == team2Score) {
            Random random = new Random();
            team1.setScore(team1Score + random.nextInt(2));
            team1Score = team1.getScore();

            team2.setScore(team2Score + random.nextInt(2));
            team2Score = team2.getScore();
        }

        if (team1Score > team2Score) {
            System.out.println(team1Name + " heeft gewonnen van " + team2Name + " met " + team1Score + " - " + team2Score);
            return team1;
        } else {
            System.out.println(team2Name + " heeft gewonnen van " + team1Name + " met " + team2Score + " - " + team1Score);
            return team2;
        }


    }

    public static void winner(Team team){
        if (team instanceof AmateurFootballTeam)
        System.out.println("Team " + team.getName() + " heeft de National Football league gewonnen!\n" +
                team.getName() + " bouwt er een mooi feestje van met hun mascotte " + ((AmateurFootballTeam) team).getDrinkingMascotte());
        else{
            System.out.println("Team " + team.getName() + " heeft de National Football league gewonnen!\n" +
                    team.getName() + " viert hun overwinning met hun sponsor " + ((ProfessionalFootballTeam) team).getSponsor());
        }
    }
}
