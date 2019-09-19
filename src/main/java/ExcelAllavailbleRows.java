import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelAllavailbleRows {
	

	public static void main(String[] args) throws Throwable {
		File loc = new File("C:\\Users\\HP\\eclipse-workspace\\Mavensesond\\testdata\\name.xlsx");
		FileInputStream s = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(s);
		Sheet s1 = w.getSheet("Sheet1");
		for (int i = 0; i <s1.getPhysicalNumberOfRows(); i++) {
		Row r = s1.getRow(i);
			
		
		for (int j = 0; j<r.getPhysicalNumberOfCells() ; j++) {
			 
		Cell cell = r.getCell(j);
				System.out.println(cell);

	}

}
}}