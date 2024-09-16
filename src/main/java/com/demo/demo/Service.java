package com.demo.demo;

public class Service {
	private UserDao userdao;
	
	
	 public Service (UserDao userdao ) {
		 this.userdao = userdao;
	 }
	 public String getName(Integer Id) {
		String name =userdao.FindNameById(Id);
		return name;
		
	 }
	 public String login(String email,String pwd) {
		 Boolean status = userdao.finfByEmailAndPassword(email,pwd);
		 if(status) {
			 return "sucess";
		 }else {
			 return "fail";
		 }
	 }

}
