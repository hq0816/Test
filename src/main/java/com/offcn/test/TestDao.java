package com.offcn.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.offcn.dao.MobileDao;
import com.offcn.service.MobileService;

public class TestDao {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-dao.xml","spring/spring-service.xml");
		MobileService mobileService = (MobileService) context.getBean("mobileService");
		System.out.println(mobileService.getByNum("18701319046"));
	}

}
