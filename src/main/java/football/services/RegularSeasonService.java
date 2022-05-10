package football.services;

import football.model.Team;
import java.util.List;

public interface RegularSeasonService {

    void createRegularSeason(Team team, List<String> oppositeTeams);

    void getTopGoalScorers(Team team);

    void getTeamStatistic(Team team);
}
