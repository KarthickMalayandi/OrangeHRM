package genericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileData {
	
	public String getData(String sheet,int row,int col)  throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(Constants.xcelFilePath);
		Workbook wb=WorkbookFactory.create(fis);
		
		String value=wb.getSheet(sheet).getRow(row).getCell(col).getStringCellValue();
		return value;
		
	}

}
