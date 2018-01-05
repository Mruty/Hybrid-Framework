package test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

import in.swagen.framework.util.ReadingExcelDataThroughHashMap;

public class ReadDataFromHashMap {

	public static void main(String[] args) {
		HashMap<String,LinkedHashMap<Integer, List>> m = ReadingExcelDataThroughHashMap.loadExcelLines(System.getProperty("user.dir")+"\\ExcelData\\loginCredentials.xlsx");
		System.out.println(m.keySet());
		System.out.println(m.get("loginData"));
		LinkedHashMap<Integer, List> b = m.get("loginData");
		for(Object v:b.keySet()){
			System.out.println(b.get(v));
		}
		List v = b.get(1);
		for(Object val:v){
			System.out.println(val);
		}
	}
}
