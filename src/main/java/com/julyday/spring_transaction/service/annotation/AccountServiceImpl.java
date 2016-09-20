package com.julyday.spring_transaction.service.annotation;

import org.springframework.transaction.annotation.Transactional;

import com.julyday.spring_transaction.dao.AccountDao;
import com.julyday.spring_transaction.service.AccountService;

@Transactional()
public class AccountServiceImpl implements AccountService {
	private AccountDao accountDao;
	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	public void transfer(final String in,final String out,final int money) {
		accountDao.outMoney(out, money);
		//int i = 1 / 0;
		accountDao.inMoney(in, money);
	}

}
