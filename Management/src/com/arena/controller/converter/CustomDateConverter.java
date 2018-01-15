package com.arena.controller.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class CustomDateConverter implements Converter<String, Date> {
	@Override
	public Date convert(String source) {
		//String source_new=source.toString().trim();
		/*String source_new=source.toString().trim();*/
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
	   return	sf.parse(source);
		} catch (ParseException e) {
			e.printStackTrace();
			System.out.println("转换出错");
		}
     	return  null;
	}
	
}
