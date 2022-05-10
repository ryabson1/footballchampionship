package football;


import football.DAO.BayernDAO;
import football.utils.excel.CreateExcelDemo;
import java.io.FileNotFoundException;

public class Application {

    public static void main(String[] args) throws FileNotFoundException {
        BayernDAO.createBayernRegularSeason();
        BayernDAO.createNationalCup();
      //  CreateExcelDemo.createExcelFile();
    }
}
