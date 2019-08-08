package test;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ExcelWrite {

    public static void main(String[] args) throws Exception {
        XSSFWorkbook workbook;
        XSSFSheet sheet;
        XSSFRow row;
        XSSFCell cell;

        String path = "src/SampleData1.xlsx";

        //opening and loading the in the given path
        FileInputStream fileInputStream = new FileInputStream(path);

        workbook = new XSSFWorkbook(fileInputStream);
        //PROVIDING THE SPECIFIC SHEET THAT WE WANT TO WORK ON FROM THIS WORKBOOK
        sheet = workbook.getSheet("Employees");
        //WE ARE SELECTING AND SAVING THE ROW
        row = sheet.getRow(1);
        //SELECTING THE CELL FROM THE SELECTED ROW
        cell = row.getCell(1);

        System.out.println("Steven's lastname: " + cell.toString());

        XSSFCell adamCell = sheet.getRow(2).getCell(0);
        System.out.println("Before: " + adamCell.toString());
        adamCell.setCellValue("Trump");

        //for when you are sending a value to a file

        //this is the line that is executing and writing to the file

        System.out.println("After: " + adamCell.toString());


        //TODO: Change TRUMP'S JOB_ID to President dynamically

        for (int rowNum = 0; rowNum <sheet.getLastRowNum(); rowNum++) {
            if(sheet.getRow(rowNum).getCell(0).toString().equals("Trump")){
                sheet.getRow(rowNum).getCell(2).setCellValue("President");
            }
        }
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);
        workbook.close();
        fileInputStream.close();
        fileOutputStream.close();

    }
}
