package football.utils.excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class CreateExcelDemo {

    private CreateExcelDemo() {
    }

    private static HSSFCellStyle createStyleForTitle(HSSFWorkbook workbook) {
        HSSFFont font = workbook.createFont();
        font.setBold(true);
        HSSFCellStyle style = workbook.createCellStyle();
        style.setFont(font);
        return style;
    }

    public static void createExcelFile() throws FileNotFoundException {
        File file = new File("Championship.xls");

        FileOutputStream outputStream = new FileOutputStream(file);
        System.out.println("Created file " + file.getAbsolutePath());
    }

}
