// Chapter 8 exercise

public class BowlingTeam2 {
    // Instances varialbes for this class
    private String teamName;
    private String[] members = new String[4];

    // Class methods for the teamName variable
    public void setTeamName(String team) {
        teamName = team;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setMember(int number, String name) {
        members[number] = name;
    }

    public String getMember(int number) {
        return members[number];
    }
}