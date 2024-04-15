package seventeenarray;

import java.util.Scanner;

class FootballTeam {
    private String name;
    private String city;
    private int leaguePosition;
    private int wins;

    public FootballTeam(String name, String city, int leaguePosition, int wins) {
        this.name = name;
        this.city = city;
        this.leaguePosition = leaguePosition;
        this.wins = wins;
    }

    public String getName() { return name;}

    public String getCity() { return city;}

    public int getLeaguePosition() {return leaguePosition;}

    public int getWins() {return wins;}

    public void setWins(int wins) {this.wins = wins;}

    @Override
    public String toString() {
        return "FootballTeam{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", leaguePosition=" + leaguePosition +
                ", wins=" + wins +
                '}';
    }
}
