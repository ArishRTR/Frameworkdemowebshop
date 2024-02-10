package genericlibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public static String getCellData(String sheetName,int rowNum,int cellNum) throws EncryptedDocumentException, IOException {
		
		//step:1 get the java representation of physical file
		
		FileInputStream input =new FileInputStream(FrameWorkConstants.EXCEL_PATH);
		
		//step:2 creat a workbook
		
		Workbook workbook = WorkbookFactory.create(input);
		
		
		//step:3 get the sheet from the work book
		Sheet sheet = workbook.getSheet(sheetName);
		
		//step:4 get the row from the sheet
		Row row = sheet.getRow(rowNum);
		
		//step:5 get the cell from given row
		Cell cell = row.getCell(cellNum);
		
		String data = cell.getStringCellValue();
		return data;
		
	}
	
	public static String [][] getRowData(String Register ) throws EncryptedDocumentException, IOException{
		
		//step1:
		FileInputStream input =new FileInputStream(FrameWorkConstants.EXCEL_PATH);
		
		//step2:
		
		Workbook work = WorkbookFactory.create(input);
		
		//step2:
		
		Sheet sheet = work.getSheet(Register);
		
		//step3:
		int rowcount = sheet.getPhysicalNumberOfRows();
		
		//step:4
		
		int columncount = sheet.getRow(0).getPhysicalNumberOfCells();
		
		//step:5
		
		String[][] data= new String [rowcount-1][columncount];
		
		for(int i=1;i<rowcount;i++) {
			
			for(int j=0;j<columncount;j++) {
				data[i-1][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		return data;
		
		
	}

}
