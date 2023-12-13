package resource;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static ArrayList getData(String sheetname,String rowheading,String cellname) throws IOException{
		ArrayList<String> a=new ArrayList<String>();
		FileInputStream fis=new FileInputStream("C:\\TestPerformar\\HSBC_SSAP\\Input Data\\StatementData.xlsx");
		String path=System.getProperty("user.dir")+"\\Input_Data\\StatementData.xlsx";
		//System.out.println(path);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		int sheetCount=workbook.getNumberOfSheets();
		for(int i=0;i<sheetCount;i++){
			XSSFSheet sheet=workbook.getSheetAt(i);
			if(sheet.getSheetName().equalsIgnoreCase(sheetname)){
				Iterator<Row> rows=sheet.iterator();
				Row firstrow=rows.next();
				Iterator<Cell> cellsOfTestCaserow=firstrow.iterator();
				int k=0;
				int column=0;
				while(cellsOfTestCaserow.hasNext()){
					Cell cell=cellsOfTestCaserow.next();
					if(cell.getStringCellValue().equalsIgnoreCase(rowheading)){
						column=k;
					}	
				k++;
				}
				while(rows.hasNext()){
					Row r=rows.next();  
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase(cellname)){
						Iterator<Cell>c=r.cellIterator();
						while(c.hasNext()){
						Cell cv=c.next();
						if(cv.getCellType()==CellType.STRING){
						a.add(cv.getStringCellValue());
						}
						else{
							double num=cv.getNumericCellValue();
							String value=NumberToTextConverter.toText(num);
						a.add(value);
						}
						}
					}
				}
			
			
			}
			
			
		}
		//System.out.println(a);
		return a;
	
	
	}
}
