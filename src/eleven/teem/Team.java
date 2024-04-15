package eleven.teem;

public class Team {
    private String name;
    private String city;
    private int leaguePosition;
    private int wins;
    private String coach;
    private CoachType coachType;

    public Team(String name, String city, int leaguePosition, int wins, String coach, CoachType coachType) {
        this.name = name;
        this.city = city;
        this.leaguePosition = leaguePosition;
        this.wins = wins;
        this.coach = coach;
        this.coachType = coachType;
    }

    public Team() {

    }

   public Team(String name, String city) {
       this.name = name;
       this.city = city;
    }

   public void displayTeamInfo() {
       System.out.printf("Name: %s\nCity: %s\nLeague Position: %d\nWins: %d\nCoach: %s\n",
               this.name, this.city, this.leaguePosition,
               this.wins, this.coach);
        System.out.println("Coach Type: \n" + coachType);
       System.out.println("-------------------------------------------------------------\n");
    }

    public enum CoachType {
        HEAD_COACH,
        ASSISTANT_COACH
    }

}




