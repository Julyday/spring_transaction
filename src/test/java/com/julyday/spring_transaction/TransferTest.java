package com.julyday.spring_transaction;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.julyday.spring_transaction.service.AccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TransferTest {
	
	@Resource(name="accountService")
	private AccountService accountService;
	
	@Resource(name="accountService1")
	private AccountService accountService1;
	
	@Test
	public void testService(){
		System.out.println("testService begin");
		accountService.transfer("julyday", "zhangsan", 20000);
		System.out.println("testService finish:");
	}
	
	@Test
	public void testService1(){
		System.out.println("testService1 begin");
		accountService1.transfer("julyday", "zhangsan", 20000);
		System.out.println("testService1 finish");
	}
}
