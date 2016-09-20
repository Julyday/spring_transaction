package com.julyday.spring_transaction.service;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.julyday.spring_transaction.dao.AccountDao;

public class AccountServiceImpl1 implements AccountService {
	private AccountDao accountDao;
	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	private TransactionTemplate transactionTemplate;
	
	
	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}


	@Override
	public void transfer(final String in,final String out,final int money) {
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
				accountDao.outMoney(out, money);
				int i = 1/0;
				accountDao.inMoney(in, money);
			}
		});
	}
	
//	public boolean transfer(final String in,final String out,final int money){
//		return transactionTemplate.execute(new TransactionCallback<Boolean>() {
//			@Override
//			public Boolean doInTransaction(TransactionStatus transactionStatus) {
//				accountDao.outMoney(out, money);
//				//int i = 1/0;
//				accountDao.inMoney(in, money);
//				return true;
//			}
//		});
//	}

}
