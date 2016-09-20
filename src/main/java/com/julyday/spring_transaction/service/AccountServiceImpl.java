package com.julyday.spring_transaction.service;

import com.julyday.spring_transaction.dao.AccountDao;

public class AccountServiceImpl implements AccountService {
	private AccountDao accountDao;
	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	public void transfer(String in, String out, int money) {
		accountDao.outMoney(out, money);
		//int i = 1/0;
		accountDao.inMoney(in, money);
	}

}
