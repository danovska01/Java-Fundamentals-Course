package _17_ObjectsAndClasses_More_Ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _04_TeamworkProjects {
    public static class User {
        public void setMembers(String userToJoin) {
            this.members.add(userToJoin);
        }

        private List members;
        private String teamCreated;

        public List getMembers() {
            return members;
        }

        public String getTeamCreated() {
            return teamCreated;
        }


        public User(List<String> members, String teamCreated) {
            this.members = members;
            this.teamCreated = teamCreated;
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int countOfTeams = Integer.parseInt(scanner.nextLine());
        List<User> listOfUsers = new ArrayList<>();


        for (int i = 1; i <= countOfTeams; i++) {
            String input = scanner.nextLine();
            String[] tokens = input.split("-");
            String userCreator = tokens[0];
            String teamCreated = tokens[1];

            List<String> members = new ArrayList<>();
            members.add(userCreator);
            User currentUser = new User(members, teamCreated);
            System.out.printf("Team %s has been created by %s!%n", teamCreated, userCreator);
            listOfUsers.add(currentUser);


        }

        String command = scanner.nextLine();
        while (!command.equals("end of assignment")) {
            String[] tokens = command.split("->");
            String userToJoin = tokens[0];
            String teamToJoin = tokens[1];
            //Note that when you join a team you should check first if it exists,
            // then check if the user is already in a team:

            boolean isTeamExists = checkIfTeamExists(listOfUsers, teamToJoin);
            boolean isUserAlreadyInTeam = userToCkeck(listOfUsers, userToJoin, teamToJoin);

            //joinUserToATeam(userToJoin, teamToJoin, listOfUsers);


            command = scanner.nextLine();
        }
    }

    private static boolean userToCkeck(List<User> listOfUsers, String userToJoin, String teamToJoin) {
        for (User a : listOfUsers) {
            if (a.getMembers().get(0).equals(userToJoin)) {
                System.out.printf("Member %s cannot join team %s!%n", userToJoin, teamToJoin);
            } else {
                a.setMembers(userToJoin);
            }
        }

        System.out.printf("%s cannot create another team!%n", userToJoin);

        return false;
    }

    private static boolean checkIfTeamExists(List<User> listOfUsers, String teamToJoin) {
        for (User a : listOfUsers) {
            if (a.getTeamCreated().equals(teamToJoin)) {
                System.out.printf("Team %s was already created!%n", teamToJoin);
                return false;
            }



        }
        System.out.printf("Team %s does not exist!", teamToJoin);
        return true;



    }}

