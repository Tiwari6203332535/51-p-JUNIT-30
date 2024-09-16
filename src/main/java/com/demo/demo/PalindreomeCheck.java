package com.demo.demo;

public class PalindreomeCheck {
	public boolean isPallindrome(String str) {
		String reverse ="";
		int length = str.length();
		
		for(int i=length-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
	
	if(str.equals(reverse)) {
		return true;
	}else {
		return false;
	}

}
}