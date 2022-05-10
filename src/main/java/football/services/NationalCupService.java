package football.services;

import football.model.Team;
import java.util.List;

public interface NationalCupService {

    void createNationalCup(Team team, List<String> oppositeTeams);

    void getTopCupGoalScorers(Team team);

    void getTeamCupStatistic(Team team);

}
