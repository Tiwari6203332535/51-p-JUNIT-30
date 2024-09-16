package com.demo.demo;

public interface UserDao {
	public String FindNameById(Integer Id);
	public Boolean finfByEmailAndPassword(String email,String pwd);

}
