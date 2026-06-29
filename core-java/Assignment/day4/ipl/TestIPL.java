package com.mmcoe.ipl;
import java.util.Scanner;

public class TestIPL {

    public static void main(String[] args) {

        Team[] teams = new Team[3];

        teams[0] = new Team("CSK");
        teams[0].addPlayer(new Player("Dhoni", 25));
        teams[0].addPlayer(new Player("Sanju", 18));
        teams[0].addPlayer(new Player("Ashwin", 9));

        teams[1] = new Team("Srh");
        teams[1].addPlayer(new Player("Abhishek", 21));
        teams[1].addPlayer(new Player("Cummins", 25));
        teams[1].addPlayer(new Player("Shami", 10));

        teams[2] = new Team("MI");
        teams[2].addPlayer(new Player("Rohit", 20));
        teams[2].addPlayer(new Player("Bumrah", 18));
        teams[2].addPlayer(new Player("Surya", 17));

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Team Name : ");
        String name = sc.next();

        boolean found = false;

        for(int i = 0; i < teams.length; i++) {
            if(teams[i].getTeamName().equals(name)) {
                teams[i].printPlayers();
                found = true;
                break;
            }
        }
        if(!found)
            System.out.println("Team Not Found");

        sc.close();
    }
}