package com.mmcoe.ipl;

// Exception for Team Not Found
class TeamNotFoundException extends Exception {

    public TeamNotFoundException(String message) {
        super(message);
    }
}

// Exception for Player Not Found
class PlayerNotFoundException extends Exception {

    public PlayerNotFoundException(String message) {
        super(message);
    }
}