package football.utils;

import football.model.Team;
import java.util.Random;

public class SoloGame {

    private SoloGame() {
    }

    public static String createSoloGame(Team team, String oppositeTeam) {
        Random rnd = new Random();
        int home_goals = rnd.nextInt(8);
        int away_goals = rnd.nextInt(4);
        team.setTeam_games(team.getTeam_games() + 1);
        team.setTeam_goalScored(team.getTeam_goalScored() + home_goals);
        team.setTeam_goalConceded(team.getTeam_goalConceded() + away_goals);
        String result =
                team.getTeam_name() + " " + home_goals + ":" + away_goals + " " + oppositeTeam;
        System.out.println(result);
        if (home_goals > 0) {
            WhoScored.whoScoredGoal(team, home_goals);
            System.out.println("");
        }
        if (home_goals > away_goals) {
            GameCases.ifWin(team);
            return "WIN";
        } else if (home_goals == away_goals) {
            GameCases.ifDraw(team);
        } else {
            GameCases.ifLose(team);
        }
        return result;
    }

}
