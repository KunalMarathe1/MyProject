package readexcelsheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AccessData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File file=new File("C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\Sample.xlsx");
		Sheet ref = WorkbookFactory.create(file).getSheet("Sheet1");
		String name = ref.getRow(0).getCell(0).getStringCellValue();
		System.out.println(name);
		
		boolean result = ref.getRow(1).getCell(1).getBooleanCellValue();
		System.out.println(result);
		
		double value = ref.getRow(0).getCell(1).getNumericCellValue();
		System.out.println(value);
		
		Row row = ref.getRow(0);
		Cell cell = row.getCell(0); 
		CellType ref2 = cell.getCellType();
		System.out.println(ref2);
		String name2 = cell.getStringCellValue();
		System.out.println(name2);
		
	}

}
