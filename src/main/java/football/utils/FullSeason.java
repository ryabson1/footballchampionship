package football.utils;

import football.model.Team;
import football.services.NationalCupServiceImpl;
import football.services.RegularSeasonServiceImpl;
import java.util.List;

public class FullSeason {

    private FullSeason() {
    }

    public static void createRegularSeason(Team team, List<String> oppositeTeams) {
        RegularSeasonServiceImpl regularSeasonService = new RegularSeasonServiceImpl();
        regularSeasonService.createRegularSeason(team, oppositeTeams);
        regularSeasonService.getTeamStatistic(team);
        regularSeasonService.getTopGoalScorers(team);
    }

    public static void createNationalCup(Team team, List<String> oppositeTeams) {
        NationalCupServiceImpl nationalCupService = new NationalCupServiceImpl();
        nationalCupService.createNationalCup(team, oppositeTeams);
        nationalCupService.getTeamCupStatistic(team);
        nationalCupService.getTopCupGoalScorers(team);
    }

}
