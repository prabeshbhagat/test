package demo;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadAll {

	public static void main(String[] args) throws Exception {
		File src= new File("C:\\Users\\Sony\\Desktop\\testdata.xlsx");
		FileInputStream fis=new FileInputStream(src);
        Workbook wb= WorkbookFactory.create(fis);
        Sheet sheet1=wb.getSheetAt(0);
        int rowcount=sheet1.getLastRowNum();
        System.out.println("row count is"+rowcount);
        for(int i=0;i<=rowcount;i++){
        	String data=sheet1.getRow(i).getCell(0).getStringCellValue();
        	System.out.println("data from row"+i+"  is "+data);
        	
        }

	}

}
