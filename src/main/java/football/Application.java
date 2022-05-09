package football;

import football.model.Team;
import football.utils.SoloGame;

public class Application {

    public static void main(String[] args) {
        Team team = new Team("Реал Мадрид");
        SoloGame.createSoloGame(team, "Барселона");
    }

}
