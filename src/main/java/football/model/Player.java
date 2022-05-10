package football.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {

    private final String player_name;
    private int player_goals;

    public Player(String player_name) {
        this.player_name = player_name;
        this.player_goals = 0;
    }

    @Override
    public String toString() {
        return player_name + " Goals:" + player_goals;
    }
}
