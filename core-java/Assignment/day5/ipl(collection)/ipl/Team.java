package com.mmcoe.ipl;

import java.util.ArrayList;

public class Team {

    private int teamId;
    private String teamName;
    private ArrayList<Player> players;

    public Team(int teamId, String teamName) {
        this.teamId = teamId;
        this.teamName = teamName;
        players = new ArrayList<Player>();
    }

    public int getTeamId() {
        return teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    // Add a player to the team
    public void addPlayer(Player player) {
        players.add(player);
    }

    @Override
    public String toString() {
        return "Team ID = " + teamId +
               ", Team Name = " + teamName;
    }
}