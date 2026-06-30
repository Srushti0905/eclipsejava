package com.mmcoe.ipl;

import java.util.HashMap;

public class IPL implements IPLOperations {

    private HashMap<String, Team> teams;

    public IPL() {
        teams = new HashMap<>();
    }

    @Override
    public void addTeam(Team team) {

        if (teams.containsKey(team.getTeamName())) {
            System.out.println("Team Already Exists.");
            return;
        }

        teams.put(team.getTeamName(), team);
    }

    @Override
    public void addPlayer(String teamName, Player player)
            throws TeamNotFoundException {

        Team team = teams.get(teamName);

        if (team == null) {
            throw new TeamNotFoundException("Team Not Found");
        }

        team.addPlayer(player);
    }

    @Override
    public void displayPlayers(String teamName)
            throws TeamNotFoundException {

        Team team = teams.get(teamName);

        if (team == null) {
            throw new TeamNotFoundException("Team Not Found");
        }

        if (team.getPlayers().isEmpty()) {
            System.out.println("No Players Available");
            return;
        }

        System.out.println("\nPlayers of " + teamName);

        for (Player player : team.getPlayers()) {
            System.out.println(player);
        }
    }

    @Override
    public void displayAllTeams() {

        if (teams.isEmpty()) {
            System.out.println("No Teams Available");
            return;
        }

        for (Team team : teams.values()) {

            System.out.println("\n" + team);

            if (team.getPlayers().isEmpty()) {
                System.out.println("No Players");
            } else {

                for (Player player : team.getPlayers()) {
                    System.out.println(player);
                }
            }
        }
    }

    @Override
    public Player findPlayer(String playerName)
            throws PlayerNotFoundException {

        for (Team team : teams.values()) {

            for (Player player : team.getPlayers()) {

                if (player.getPlayerName().equalsIgnoreCase(playerName)) {
                    return player;
                }
            }
        }

        throw new PlayerNotFoundException("Player Not Found");
    }

}