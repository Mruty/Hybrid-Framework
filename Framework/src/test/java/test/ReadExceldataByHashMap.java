package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExceldataByHashMap {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		LinkedHashMap<String,String> m=new LinkedHashMap<>();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\ExcelData\\loginCredentials.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		int rows = wb.getSheet("Sheet2").getLastRowNum();
		for(int i=1;i<=rows;i++){
		String value = wb.getSheet("Sheet2").getRow(i).getCell(0).getStringCellValue();
		String value1 = wb.getSheet("Sheet2").getRow(i).getCell(1).toString();
		
		System.out.println(value+"--"+value1);
		m.put(value, value1);
		}
		System.out.println("-------hashmap output--------");
		for(String k:m.keySet()){
			System.out.println(k+"---"+m.get(k));
		}
	}
}
