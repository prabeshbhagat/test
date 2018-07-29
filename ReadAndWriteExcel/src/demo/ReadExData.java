package demo;

import lib.ExcelDataConfig;

public class ReadExData {

	public static void main(String[] args) {
		ExcelDataConfig excel= new ExcelDataConfig("C:\\Users\\Sony\\Desktop\\testdata.xlsx");
		System.out.println(excel.getData(1, 0, 1));

	}

}
