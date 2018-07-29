package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintAllCellValues {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Sony\\Desktop\\Book1.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		Sheet s=wb.getSheet("Sheet1");
		Row r=s.getRow(0);
		int cc=r.getLastCellNum();
		System.out.println(cc);
		for(int i=0;i<cc;i++){
			String v=r.getCell(i).getStringCellValue();
			System.out.println(v);
		}

	}

}
