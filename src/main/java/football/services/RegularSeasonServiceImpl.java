package football.services;

import football.model.Player;
import football.model.Team;
import football.utils.SoloGame;
import java.util.Collections;
import java.util.List;

public class RegularSeasonServiceImpl implements RegularSeasonService {

    public RegularSeasonServiceImpl() {
    }

    @Override
    public void createRegularSeason(Team team, List<String> oppositeTeams) {
        System.out.println("\u001B[32m" + "===Национальный чемпионат===" + "\u001B[0m");
        Collections.shuffle(oppositeTeams);
        int stage = 1;
        for (int i = 0; i < 2; i++) {
            for (String t : oppositeTeams) {
                System.out.println("Тур " + stage);
                SoloGame.createSoloGame(team, t);
                stage++;
            }
        }
    }

    @Override
    public void getTopGoalScorers(Team team) {
        System.out.println("\u001B[32m" + "===Бомбардиры===" + "\u001B[0m");
        List<Player> players = team.getTeam_players();
        players.sort(((o1, o2) -> o2.getPlayer_goals() - o1.getPlayer_goals()));
        System.out.println(players);
    }

    @Override
    public void getTeamStatistic(Team team) {
        System.out.println("\u001B[32m" + "===Результаты команды===" + "\u001B[0m");
        System.out.println(team);
    }
}
