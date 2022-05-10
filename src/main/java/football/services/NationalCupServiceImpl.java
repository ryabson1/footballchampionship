package football.services;

import football.model.Player;
import football.model.Team;
import football.utils.SoloGame;
import java.util.List;
import java.util.Random;
import org.apache.log4j.Logger;

public class NationalCupServiceImpl implements NationalCupService {

    private static final Logger log = Logger.getLogger(NationalCupServiceImpl.class);

    public NationalCupServiceImpl() {
    }

    @Override
    public void createNationalCup(Team team, List<String> oppositeTeams) {
        Random rnd = new Random();
        System.out.println("\u001B[32m" + "===Национальный кубок===" + "\u001B[0m");
        String[] stages = new String[]{"Раунд 4", "1/8", "1/4", "1/2", "Финал"};
        for (String stage : stages) {
            System.out.println(stage);
            String oppositeTeam = oppositeTeams.get(rnd.nextInt(oppositeTeams.size()));
            if (!SoloGame.createSoloGame(team, oppositeTeam).equals("WIN")) {
                System.out.println("\u001B[31m" + team.getTeam_name() + " вылетела" + "\u001B[0m");
                break;
            }
        }
        log.info("Национальный кубок для команды " + team.getTeam_name() + " смоделирован");
    }

    @Override
    public void getTopCupGoalScorers(Team team) {
        System.out.println("\u001B[32m" + "===Бомбардиры===" + "\u001B[0m");
        List<Player> players = team.getTeam_players();
        players.sort(((o1, o2) -> o2.getPlayer_goals() - o1.getPlayer_goals()));
        System.out.println(players);
    }

    @Override
    public void getTeamCupStatistic(Team team) {
        System.out.println("\u001B[32m" + "===Результаты команды===" + "\u001B[0m");
        System.out.println(team);
    }
}
