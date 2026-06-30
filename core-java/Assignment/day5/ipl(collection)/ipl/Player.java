package com.mmcoe.ipl;

public class Player {

    private String playerName;
    private int jerseyNumber;
    private String role;
    private double bidAmount;

    public Player(String playerName, int jerseyNumber, String role, double bidAmount) {
        this.playerName = playerName;
        this.jerseyNumber = jerseyNumber;
        this.role = role;
        this.bidAmount = bidAmount;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public String getRole() {
        return role;
    }

    public double getBidAmount() {
        return bidAmount;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setBidAmount(double bidAmount) {
        this.bidAmount = bidAmount;
    }

    @Override
    public String toString() {
        return "Player Name = " + playerName +
               ", Jersey Number = " + jerseyNumber +
               ", Role = " + role +
               ", Bid Amount = " + bidAmount + " Cr";
    }
}