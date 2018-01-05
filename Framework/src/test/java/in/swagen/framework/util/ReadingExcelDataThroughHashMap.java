package in.swagen.framework.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingExcelDataThroughHashMap {
	 public static HashMap loadExcelLines(String fileName)
	    {
	        // Used the LinkedHashMap and LikedList to maintain the order
	        HashMap<String, LinkedHashMap<Integer, List>> outerMap = new LinkedHashMap<String, LinkedHashMap<Integer, List>>();

	        LinkedHashMap<Integer, List> linkedhashMap = new LinkedHashMap<Integer, List>();

	        String sheetName = null;
	        // Create an ArrayList to store the data read from excel sheet.
	        // List sheetData = new ArrayList();
	        FileInputStream fis = null;
	        try
	        {
	            fis = new FileInputStream(fileName);
	            // Create an excel workbook from the file system
	           
				Workbook wb = WorkbookFactory.create(fis);
				for(int i=0;i<wb.getNumberOfSheets();i++){
					Sheet sheet = wb.getSheetAt(i);
				String sheetname = wb.getSheetName(i);
				Iterator<Row> rows = sheet.rowIterator();
				while(rows.hasNext()){
					Row row = rows.next();
				 Iterator<Cell> cells = row.cellIterator();
				 List data=new LinkedList<>();
				 while(cells.hasNext()){
				 Cell cc = cells.next();
				 data.add(cc.toString());
			 }
			 linkedhashMap.put(row.getRowNum(), data);
		}
		outerMap.put(sheetname, linkedhashMap);
		linkedhashMap=new LinkedHashMap<Integer,List>();
	}
	           
	        }
	        catch (IOException e)
	        {
	            e.printStackTrace();
	        } catch (EncryptedDocumentException e) {
				e.printStackTrace();
			} catch (InvalidFormatException e) {
				e.printStackTrace();
			}
	        finally
	        {
	            if (fis != null)
	            {
	                try
	                {
	                    fis.close();
	                }
	                catch (IOException e)
	                {
	                    e.printStackTrace();
	                }
	            }
	        }

	        return outerMap;

	    }
}
