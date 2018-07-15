package readData;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class readExcel {

	public Object[][] readData(String excelFileName) throws IOException {
		XSSFWorkbook wbook =new XSSFWorkbook("./data/"+excelFileName+".xlsx");
		XSSFSheet sheet = wbook.getSheetAt(0);
		int rowNum = sheet.getLastRowNum();
		System.out.println("Row Count is" +rowNum);
		
		XSSFRow headerRow = sheet.getRow(0);
		int lastCellNum = headerRow.getLastCellNum();
		
		System.out.println("Cell Count is" +lastCellNum);
		
		Object[][] obj= new Object[rowNum][lastCellNum];
		
		for (int i =1; i<=rowNum; i++)
		{
			XSSFRow row = sheet.getRow(i);
			for (int j=0; j<lastCellNum; j++)
			{
				XSSFCell cell = row.getCell(j);
				String cellValue = cell.getStringCellValue();
				System.out.println("Value is:" +cellValue);
				obj[i-1][j]=cellValue;
				
			}
		}
		wbook.close();
		return obj;
		
		
		
		
		
		

	}

}
