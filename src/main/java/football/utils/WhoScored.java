package football.utils;

import football.model.Team;
import java.util.Random;

public class WhoScored {

    private WhoScored() {
    }

    public static StringBuilder whoScoredGoal(Team team, int goalCounter) {
        StringBuilder scorers = new StringBuilder();
        Random rnd = new Random();

        for (int i = 0; i < goalCounter; i++) {
            int result = rnd.nextInt(team.getTeam_players().size());

            team.getTeam_players().get(result)
                    .setPlayer_goals(team.getTeam_players().get(result).getPlayer_goals() + 1);
            System.out.print(team.getTeam_players().get(result).getPlayer_name() + " ");
            scorers.append(team.getTeam_players().get(result).getPlayer_name()).append(" ");
        }
        return scorers;
    }

}
