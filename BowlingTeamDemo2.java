// Chapter 8 exercise

import java.util.Scanner;

public class BowlingTeamDemo2 {

    public static void main(String[] args) {
        // variables and constants
        String name;
        int x;
        int y;
        final int NUM_TEAM_MEMBERS = 4;
        final int NUM_TEAMS = 3;
        Scanner input = new Scanner(System.in);
        BowlingTeam2[] teams = new BowlingTeam2[NUM_TEAMS];

        // input phase
        for (y = 0; y < NUM_TEAMS; ++y) {
            // each time through this loop, construct a new BowlingTeam object
            teams[y] = new BowlingTeam2();
            System.out.print("Enter team name >> ");
            name = input.nextLine();
            teams[y].setTeamName(name);
            for (x = 0; x < NUM_TEAM_MEMBERS; ++x) {
                System.out.print("Enter team member's name >> ");
                name = input.nextLine();
                teams[y].setMember(x, name);
            } // end of members for loop
        } // end of the teams for loop

        // output phase
        for (y = 0; y < NUM_TEAMS; ++y) {
            System.out.println("\nMembers of team " + teams[y].getTeamName());
            for (x = 0; x < NUM_TEAM_MEMBERS; ++x) {
                System.out.print(teams[y].getMember(x) + " ");
            } // end of for loop

            System.out.println();
        } // end of Teams output for loop
    }// end of main()
}// end of class block