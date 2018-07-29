package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;


public class ReadAllVAlues {
	@Test
public void readingAllValues() throws Exception{
	FileInputStream fis=new FileInputStream("C:\\Users\\Sony\\Desktop\\EXCEL\\New.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet s=wb.getSheet("sheet1");
	Row r=s.getRow(1);
	int cc=r.getLastCellNum();
	System.out.println(cc);
	for(int i=0;i<cc;i++){
		String v=r.getCell(i).getStringCellValue();
		System.out.println(v);
	}
	
}
}
