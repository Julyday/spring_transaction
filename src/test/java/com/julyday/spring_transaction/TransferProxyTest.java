package com.julyday.spring_transaction;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.julyday.spring_transaction.service.AccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring_proxy.xml")
public class TransferProxyTest {
	
	@Resource(name="accountServiceProxy")
	private AccountService accountService;
	
	@Test
	public void testService(){
		System.out.println("testService begin");
		accountService.transfer("julyday", "zhangsan", 20000);
		System.out.println("testService finish:");
	}
	
}
