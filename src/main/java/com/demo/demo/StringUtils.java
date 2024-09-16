package com.demo.demo;

public class StringUtils {
	
	public Integer StringToInt(String Str) {
		
		if(Str==null || Str.trim().length()==0) {
			throw new IllegalArgumentException("Input is Null or Empty");
		}
		return Integer.parseInt(Str);
	}

}
