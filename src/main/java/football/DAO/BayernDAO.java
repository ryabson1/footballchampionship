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
        bayern.getTeam_players().add(new Player("Г. Мюллер"));
        bayern.getTeam_players().add(new Player("Т. Мюллер"));
        bayern.getTeam_players().add(new Player("Кройф"));
        bayern.getTeam_players().add(new Player("Роббен"));
        bayern.getTeam_players().add(new Player("Коман"));
        bayern.getTeam_players().add(new Player("Руммениге"));
        bayern.getTeam_players().add(new Player("Маттеус"));
        bayern.getTeam_players().add(new Player("Баллак"));
        bayern.getTeam_players().add(new Player("Шванштайгер"));
        bayern.getTeam_players().add(new Player("Нескенс"));

    }

    public void createBayernRegularSeason() {
        this.oppositeTeams = new GermanTeamsRepo();
        modulateSeasonService.createRegularSeason(bayern, oppositeTeams.getOppositeTeams());
        System.out.println("======Бомбардиры=======");
        modulateSeasonService.getTopGoalScorers(bayern);

    }


}
