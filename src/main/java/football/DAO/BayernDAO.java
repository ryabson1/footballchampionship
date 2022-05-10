package football.DAO;

import football.model.Player;
import football.model.Team;
import football.repo.BayernPlayersRepo;
import football.repo.GermanRegularSeasonTeamsRepo;
import football.utils.FullSeason;
import java.util.ArrayList;

public class BayernDAO {


    private BayernDAO() {
    }

    public static void createBayernRegularSeason() {
        FullSeason
                .createRegularSeason(BayernData(), GermanRegularSeasonTeamsRepo.getOppositeTeams());
    }

    public static void createNationalCup() {
        FullSeason.createNationalCup(BayernData(), GermanRegularSeasonTeamsRepo.getOppositeTeams());
    }

    private static Team BayernData() {
        Team bayern = new Team("Бавария");
        for (String name : BayernPlayersRepo.createBayernPlayers()) {
            bayern.getTeam_players().add(new Player(name));
        }
        return bayern;
    }
}
