package football.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {

    private final String name;
    private int player_goals;

    public Player(String name) {
        this.name = name;
        this.player_goals = 0;
    }

    @Override
    public String toString() {
        return name + " Goals:" + player_goals;
    }
}
