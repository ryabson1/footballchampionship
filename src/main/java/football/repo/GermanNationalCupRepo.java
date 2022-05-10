package football.repo;

import java.util.Arrays;
import java.util.List;

public class GermanNationalCupRepo {

    private GermanNationalCupRepo() {
    }

    public static List<String> getOppositeTeams() {
        List<String> german_teams;
        german_teams = Arrays
                .asList("Бохум", "Шальке-04", "Боруссия Д", "РБ Лейпциг", "Фрайбург", "Унион",
                        "Кёльн", "Хоффенхайм",
                        "Майнц-05", "Боруссия М", "Айнтрахт", "Вольфсбург", "Аугсбург", "Герта",
                        "Штутгарт", "Арминия", "Гройтер Фюрт", "Магдебург", "Динамо Д", "Киккерс",
                        "Ганза", "Энерги", "Мюнхен-1860",
                        "Хольстен Киль", "Гамбург", "Вердер", "Алемания", "Юргарден", "Дуйсбург");
        return german_teams;
    }
}
