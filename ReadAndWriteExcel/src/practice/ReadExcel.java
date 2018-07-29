package practice;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadExcel {
	@Test
public void readingExcel() throws Exception{
	FileInputStream fis=new FileInputStream("C:\\Users\\Sony\\Desktop\\EXCEL\\New.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet s=wb.getSheet("sheet1");
	Row r=s.getRow(1);
	Cell c=r.getCell(0);
	String v=c.getStringCellValue();
	System.out.println(v);
}
}
