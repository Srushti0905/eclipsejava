package com.mmcoe.ipl;

import java.util.Scanner;

public class TestIPL {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		IPL ipl = new IPL();

		int choice;

		do {

			System.out.println("\n IPL Menu");
			System.out.println("1. Add Team");
			System.out.println("2. Add Player");
			System.out.println("3. Display Players of Team");
			System.out.println("4. Display All Teams");
			System.out.println("5. Find Player");
			System.out.println("6. Exit");
			System.out.print("Enter Choice : ");

			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {

			case 1:

				System.out.print("Enter Team ID : ");
				int id = sc.nextInt();
				sc.nextLine();

				System.out.print("Enter Team Name : ");
				String teamName = sc.nextLine();

				ipl.addTeam(new Team(id, teamName));

				System.out.println("Team Added Successfully.");
				break;

			case 2:

				System.out.print("Enter Team Name : ");
				String tName = sc.nextLine();

				System.out.print("Enter Player Name : ");
				String playerName = sc.nextLine();

				System.out.print("Enter Jersey Number : ");
				int jersey = sc.nextInt();
				sc.nextLine();

				System.out.print("Enter Role : ");
				String role = sc.nextLine();

				System.out.print("Enter Bid Amount : ");
				double bid = sc.nextDouble();
				sc.nextLine();

				try {

					Player player = new Player(playerName, jersey, role, bid);

					ipl.addPlayer(tName, player);

					System.out.println("Player Added Successfully.");

				} catch (TeamNotFoundException e) {

					System.out.println(e.getMessage());

				}

				break;

			case 3:

				System.out.print("Enter Team Name : ");
				String team = sc.nextLine();

				try {

					ipl.displayPlayers(team);

				} catch (TeamNotFoundException e) {

					System.out.println(e.getMessage());

				}

				break;

			case 4:

				ipl.displayAllTeams();

				break;

			case 5:

				System.out.print("Enter Player Name : ");
				String pname = sc.nextLine();

				try {

					Player p = ipl.findPlayer(pname);

					System.out.println("\nPlayer Found");
					System.out.println(p);

				} catch (PlayerNotFoundException e) {

					System.out.println(e.getMessage());

				}

				break;

			case 6:

				System.out.println("Thank You!");
				break;

			default:

				System.out.println("Invalid Choice.");

			}

		} while (choice != 6);

		sc.close();
	}
}