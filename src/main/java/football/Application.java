package football;


import football.DAO.BayernDAO;

public class Application {

    public static void main(String[] args) {
        BayernDAO.createBayernRegularSeason();
        BayernDAO.createNationalCup();
    }
}
