package football.utils;

import football.model.Team;

public class GameCases {

    private GameCases() {
    }

    public static void ifWin(Team team) {
        team.setTeam_wins(team.getTeam_wins() + 1);
        team.setTeam_points(team.getTeam_points() + 3);
    }

    public static void ifDraw(Team team) {
        team.setTeam_draws(team.getTeam_draws() + 1);
        team.setTeam_points(team.getTeam_points() + 1);
    }

    public static void ifLose(Team team) {
        team.setTeam_loses(team.getTeam_loses() + 1);
    }

}
