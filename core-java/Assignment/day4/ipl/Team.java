package com.mmcoe.ipl;


public class Team {
    private String teamName;
    private Player[] players;
    private int idx;

    public Team(String teamName) {
        this.teamName = teamName;
        players = new Player[11];
    }

    public void addPlayer(Player p) {
        if (idx < players.length) {
            players[idx++] = p;
        } else {
            System.out.println("Team is Full");
        }
    }

    public String getTeamName() {
        return teamName;
    }

    public void printPlayers() {
        System.out.println("Team :" + teamName);
        for(int i = 0; i < idx; i++)
        	System.out.println(players[i].getName() + "-" + players[i].getBidAmount() + " Cr");
    }
}