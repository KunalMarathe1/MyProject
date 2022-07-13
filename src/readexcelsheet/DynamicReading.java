package readexcelsheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DynamicReading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File file=new File("C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\Sample.xlsx");
		Sheet ref = WorkbookFactory.create(file).getSheet("Sheet3");
		
		int allnorows = ref.getLastRowNum();
		int rowcount = allnorows;
		short allcolumn = ref.getRow(allnorows).getLastCellNum();
		int columncount = allcolumn-1;
		
		for(int i=0;i<=rowcount;i++)
		{
			for(int j=0;j<=columncount;j++)
			{
				Cell cell = ref.getRow(i).getCell(j);
				switch (cell.getCellType())
				{
				case STRING:
					String value = cell.getStringCellValue();
					System.out.print(value+"  ");
					break;
					
				case NUMERIC:
					double value1 = cell.getNumericCellValue();
					System.out.print(value1+"  ");
					break;
					
				case BOOLEAN:
					boolean value3 = cell.getBooleanCellValue();
					System.out.print(value3+"  ");
					break;
					
				case BLANK:
					System.out.println(" ");
					break;
				}
				
			}
			System.out.println();
		}	

	}

}
