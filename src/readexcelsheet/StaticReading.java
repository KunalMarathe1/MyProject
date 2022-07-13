package readexcelsheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class StaticReading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file=new File("C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\Sample.xlsx");
		Sheet ref = WorkbookFactory.create(file).getSheet("Sheet2");
		
		for(int i=0;i<=1;i++)        //for row
		{
			for(int j=0;j<=2;j++)   //for column
			{
				String print = ref.getRow(i).getCell(j).getStringCellValue();
				System.out.print(print+"   ");
			}
			System.out.println();
		}
		
	}

}
