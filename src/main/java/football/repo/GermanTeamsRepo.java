package football.repo;

import football.services.OppositeTeamsService;
import java.util.Arrays;
import java.util.List;

public class GermanTeamsRepo implements OppositeTeamsService {

    public GermanTeamsRepo() {
    }

    @Override
    public List<String> getOppositeTeams() {
        List<String> german_teams;
        german_teams = Arrays
                .asList("Бохум", "Шальке-04", "Боруссия Д", "РБ Лейпциг", "Фрайбург", "Унион",
                        "Кёльн", "Хоффенхайм",
                        "Майнц-05", "Боруссия М", "Айнтрахт", "Вольфсбург", "Аугсбург", "Герта",
                        "Штутгарт", "Арминия", "Гройтер Фюрт");
        return german_teams;
    }
}
