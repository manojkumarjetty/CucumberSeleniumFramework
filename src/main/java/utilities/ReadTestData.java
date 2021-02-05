package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadTestData {
static String testData="";
static String testDataValue = "";
public static String returnTestdataForTestcase (String testCaseId,String excelFileName,String excelSheetName) {
		
	String testId="";
	String testDt="";
		
		int rowCnt=0;
		
		try {
			FileInputStream fis = new FileInputStream("E:\\cucumberTestData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s = wb.getSheet("Sheet1");
			rowCnt = s.getLastRowNum()+1;
			System.out.println("Row count is . . . "+rowCnt);
			System.out.println();
			for (int i=0;i<rowCnt;i++) {
				Row RUN = s.getRow(i);
				Cell CUN = RUN.getCell(0);
				testId = CUN.getStringCellValue();
				//System.out.println("Username is "+uName);


				Row RPW = s.getRow(i);
				Cell CPW = RPW.getCell(1);
				testDt = CPW.getStringCellValue();
				//System.out.println("Password is "+passWd);
				
				
				
				if(testId.equals(testCaseId)) {
					System.out.println("TestData is "+testDt);	
					testData = testDt;
				}
			//	aimsLoginLogoutExcel.loginLogout(uName, passWd,airportName);
				
			
				
			}
			
			
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch (NullPointerException e) {
			e.printStackTrace();
		}
		return testData;
}

public static String returnTestdataForMultipleTestcase (String testCaseId,String testData,String excelFileName,String excelSheetName) throws IOException {
	FileInputStream fis = new FileInputStream(excelFileName);
    XSSFWorkbook workbook = new XSSFWorkbook(fis);
    XSSFSheet sheet = workbook.getSheet(excelSheetName);
    XSSFRow row = sheet.getRow(0);

    int col_num = -1;
    int rowCnt = sheet.getLastRowNum()+1;
    String testId="";
    int rowRequired=0;
    
    for (int i=0;i<rowCnt;i++) {
		Row RUN = sheet.getRow(i);
		Cell CUN = RUN.getCell(0);
		testId = CUN.getStringCellValue();
   
		if(testId.equals(testCaseId)) {
			rowRequired = i;
		}
		
	}
    
    System.out.println("Required Row is "+rowRequired);

    for(int i=0; i < row.getLastCellNum(); i++)
    {
        if(row.getCell(i).getStringCellValue().trim().equals(testData))
            col_num = i;
    }
    System.out.println("Column number is "+col_num);
    row = sheet.getRow(rowRequired);
    XSSFCell cell = row.getCell(col_num);

    testDataValue = cell.getStringCellValue();
    System.out.println("Tested Data fetched is - "+ testDataValue);	
	
	return testDataValue;
}

}
