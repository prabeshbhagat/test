package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritingExcel {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Sony\\Desktop\\Book1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s=wb.getSheet("Sheet1");
		Row r=s.getRow(0);
		Cell c=r.getCell(0);
		c.setCellValue("hghgggh");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Sony\\Desktop\\Book1.xlsx");
		wb.write(fos);
		
		

	}

}
