package com.julyday.spring_transaction.dao;

public interface AccountDao {
	
	public void outMoney(String out,int money);
	
	public void inMoney(String in,int money);
	
}
