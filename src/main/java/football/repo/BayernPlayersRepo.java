package football.repo;

import java.util.Arrays;
import java.util.List;

public class BayernPlayersRepo {

    private BayernPlayersRepo() {
    }

    public static List<String> createBayernPlayers() {
        String[] bayern_players = new String[]{"Г.Мюллер", "Т.Мюллер", "Руммениге", "Левандовски",
                "Коман", "Роббен", "Гнабри",
                "Шванштайгер", "Баллак", "Нескенс", "Беккенбауэр"};
        return Arrays.asList(bayern_players);
    }

}
