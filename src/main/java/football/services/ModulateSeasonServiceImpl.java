package football.services;

import football.model.Player;
import football.model.Team;
import football.utils.SoloGame;
import java.util.Collections;
import java.util.List;

public class ModulateSeasonServiceImpl implements ModulateSeasonService {

    public ModulateSeasonServiceImpl() {
    }

    @Override
    public void createRegularSeason(Team team, List<String> oppositeTeams) {
        Collections.shuffle(oppositeTeams);
        for (int i = 0; i < 2; i++) {
            for (String t : oppositeTeams) {
                SoloGame.createSoloGame(team, t);
            }
        }
    }

    @Override
    public void getTopGoalScorers(Team team) {
        List<Player> players = team.getTeam_players();
        players.sort(((o1, o2) -> o2.getPlayer_goals() - o1.getPlayer_goals()));
        System.out.println(players);
    }
}
