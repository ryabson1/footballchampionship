package football.DAO;


import football.model.Player;
import football.model.Team;
import football.repo.GermanTeamsRepo;
import football.services.ModulateSeasonServiceImpl;
import java.util.Arrays;

public class BayernDAO {

    ModulateSeasonServiceImpl modulateSeasonService;
    Team bayern;
    GermanTeamsRepo oppositeTeams;

    public BayernDAO() {
        this.bayern = new Team("Бавария");
        this.modulateSeasonService = new ModulateSeasonServiceImpl();
        bayern.getTeam_players().add(new Player("Левандовски"));


    }

    public void createBayernRegularSeason() {
        this.oppositeTeams = new GermanTeamsRepo();
        modulateSeasonService.createRegularSeason(bayern, oppositeTeams.getOppositeTeams());
        System.out.println("======Бомбардиры=======");
        modulateSeasonService.getTopGoalScorers(bayern);

    }


}
