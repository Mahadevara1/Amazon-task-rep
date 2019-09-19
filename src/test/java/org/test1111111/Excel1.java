package org.test1111111;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel1 {

	public static void main(String[] args) throws Throwable {
		File loc = new File("C:\\Users\\HP\\eclipse-workspace\\Mavensesond\\testdata\\name.xlsx");
		FileInputStream s = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(s);
		Sheet s1 = w.getSheet("Sheet1");
		Row r = s1.getRow(0);
		Cell cell = r.getCell(1);
		System.out.println(cell);

	}

}
