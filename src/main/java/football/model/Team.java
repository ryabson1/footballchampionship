package football.model;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Team {

    private final String team_name;
    private int team_games;
    private int team_wins;
    private int team_draws;
    private int team_loses;
    private int team_goalScored;
    private int team_goalConceded;
    private int team_points;

    private List<Player> team_players;


    public Team(String team_name) {
        this.team_name = team_name;
        this.team_games = 0;
        this.team_wins = 0;
        this.team_draws = 0;
        this.team_loses = 0;
        this.team_goalScored = 0;
        this.team_goalConceded = 0;
        this.team_points = 0;
        this.team_players = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Team{" +
                "team_name='" + team_name + '\'' +
                ", team_games=" + team_games +
                ", team_wins=" + team_wins +
                ", team_draws=" + team_draws +
                ", team_loses=" + team_loses +
                ", team_goalScored=" + team_goalScored +
                ", team_goalConceded=" + team_goalConceded +
                ", team_points=" + team_points +
                '}';
    }
}
