package football.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {

    private final String team_name;
    private int player_goals;

    public Player(String team_name) {
        this.team_name = team_name;
        this.player_goals = 0;
    }

    @Override
    public String toString() {
        return team_name + " Goals:" + player_goals;
    }
}
