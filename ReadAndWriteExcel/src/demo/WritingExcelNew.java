package demo;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class WritingExcelNew {

	public static void main(String[] args) throws InvalidFormatException, IOException{
		FileInputStream fis=new FileInputStream("C:\\Users\\Sony\\Desktop\\Book2.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s=wb.getSheet("Sheet1");
		Row r=s.getRow(0);
		Cell c=r.createCell(0);
		c.setCellType(c.CELL_TYPE_STRING);
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Sony\\Desktop\\Book2.xlsx");
		c.setCellValue("adam");
        wb.write(fos);

	}

}
