package football.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Team {
    private final String team_name;



    public Team(String team_name) {
        this.team_name = team_name;
    }
}
