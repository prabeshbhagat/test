package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		File src= new File("C:\\Users\\Sony\\Desktop\\testdata.xlsx");
		FileInputStream fis=new FileInputStream(src);
        XSSFWorkbook wb=  new XSSFWorkbook(fis);
        XSSFSheet sheet1=wb.getSheetAt(0);
        String data=sheet1.getRow(0).getCell(0).getStringCellValue();
        System.out.println("the data values are  "+data);
        String data1=sheet1.getRow(0).getCell(1).getStringCellValue();
        System.out.println("the data values are  "+data1);
	}

}
