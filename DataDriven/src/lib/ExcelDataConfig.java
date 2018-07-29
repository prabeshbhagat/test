package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDataConfig {
	Workbook wb;
	Sheet sheet1;
	public ExcelDataConfig(String excelpath){

		try {
			File src= new File(excelpath);
			FileInputStream fis=new FileInputStream(src);
			 wb= WorkbookFactory.create(fis);
			 
		} catch (Exception e) {
		
			System.out.println(e.getMessage());
	
		}
		

	}
	
	public String getData(int sheetno,int row,int column){
		sheet1=wb.getSheetAt(sheetno);
		String data=sheet1.getRow(row).getCell(column).getStringCellValue();
		return data;
	}
	
	public int getRowCount(int sheetindex){
		 int row=wb.getSheetAt(sheetindex).getLastRowNum();
		 row=row+1;
		 return row; 
	}
	

}