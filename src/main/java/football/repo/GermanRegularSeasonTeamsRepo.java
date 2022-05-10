package football.repo;

import java.util.Arrays;
import java.util.List;

public class GermanRegularSeasonTeamsRepo {

    private GermanRegularSeasonTeamsRepo() {
    }


    public static List<String> getOppositeTeams() {
        List<String> german_teams;
        german_teams = Arrays
                .asList("Бохум", "Шальке-04", "Боруссия Д", "РБ Лейпциг", "Фрайбург", "Унион",
                        "Кёльн", "Хоффенхайм",
                        "Майнц-05", "Боруссия М", "Айнтрахт", "Вольфсбург", "Аугсбург", "Герта",
                        "Штутгарт", "Арминия", "Гройтер Фюрт");
        return german_teams;
    }
}
