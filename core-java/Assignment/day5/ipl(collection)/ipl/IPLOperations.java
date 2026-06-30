package com.mmcoe.ipl;

public interface IPLOperations {

	void addTeam(Team team);

	void addPlayer(String teamName, Player player) throws TeamNotFoundException;

	void displayPlayers(String teamName) throws TeamNotFoundException;

	void displayAllTeams();

	Player findPlayer(String playerName) throws PlayerNotFoundException;}