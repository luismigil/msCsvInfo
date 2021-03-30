package com.info.csv.ms.helper;

import java.util.ArrayList;
import java.util.List;

import com.info.csv.ms.bean.InfoField;

public class CSVOrdersHelper {

	public static List<InfoField> parseToInfoField(List<Object[]> unParsedList) throws ClassNotFoundException{
		List<InfoField> infoFields = new ArrayList<InfoField>();
		for(Object[] record : unParsedList) {
			InfoField infoField = new InfoField(
					record[0].toString(),
					Integer.valueOf(record[1].toString()));
			
			infoFields.add(infoField);
		}
		
		return infoFields;
	}
}
