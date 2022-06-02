package football.repo;

import football.model.Player;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TealMadridPlayersRepo {

    private TealMadridPlayersRepo() {
    }

    public static List<Player> createRealMadridPlayers() {
        String[] real_players = new String[]{"Р.Карлос", "С.Рамос", "Хакими", "Карвахаль",
                "Вальверде", "Модрич", "Маккелеле", "Гути", "Себальос",
                "Кака", "Иско", "Роналду", "Бензема", "Рауль", "Асенсио", "Жуниор"};
        List<Player> real = new ArrayList<>();
        Arrays.asList(real_players).forEach(o -> real.add(new Player(o)));
        return real;
    }

}
