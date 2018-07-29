package excelHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcelFiles {
	
public static void main(String[] args) throws IOException {
        
        
        String filepath = System.getProperty("user.dir")+ "\\src\\excelHandling";
         readExcel(filepath ,"ExcelXLSX.xlsx" , "EmployeeData");
         readExcel(filepath , "ExcelXLS.xls" , "EmployeeData");
  }
  
   public static void readExcel(String filepath, String filename, String sheetname) throws IOException{
        
        File file = new File(filepath+ "\\"+filename);
         //Create an object of FileInputStream class to read excel file
        FileInputStream fis = new FileInputStream(file);
        Workbook workbook = null ;
         //Find the file extension by spliting file name in substring and getting only extension name
        String fileExtension = filename.substring(filename.indexOf("."));
         //Check condition if the file is xlsx file or xls file
         if(fileExtension.equals(".xlsx")){
              
               workbook = new XSSFWorkbook(fis);
              
              
        } else if (fileExtension.equals(".xls")){
              
               workbook = new HSSFWorkbook(fis);
              
        }
         
         
        
         //Read sheet inside the workbook by its name
         Sheet sheet = workbook.getSheet(sheetname);
         //Find number of rows in excel file
         int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
         //Create a loop over all the rows of excel file to read it
         for(int i=0;i<rowCount; i++){
              
              Row row = sheet.getRow(i);
              
               for(int j=0;j<row.getLastCellNum();j++){
                    
                     //Print excel data in console
                     System.out.print(row .getCell(j).getStringCellValue()+ "||");
                    
              }
              
              System. out.println();
              
        }
        
        System. out.println("------");        
        
  }

}
