package utilities;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReader {


    public static void main(String[] args) throws IOException {
        FileInputStream inputStream=new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/testData/Book1 (1).xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook(inputStream);
        XSSFSheet sheet=workbook.getSheetAt(0);
        XSSFRow row=sheet.getRow(0);
        System.out.println("no of rows"+sheet.getPhysicalNumberOfRows());
        System.out.println("no of column"+row.getPhysicalNumberOfCells());
        for(int i=0;i<sheet.getPhysicalNumberOfRows();i++)
        {
            for (int j=0;j< row.getPhysicalNumberOfCells();j++){
                System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
            }
        }

    }
}
