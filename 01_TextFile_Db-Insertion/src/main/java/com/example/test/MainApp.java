package com.example.test;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.service.BookDaoService;

public class MainApp {

	public static void main(String[] args) throws IOException {


		ApplicationContext ctxt = new ClassPathXmlApplicationContext("Beans.xml");
		
		BookDaoService bean = ctxt.getBean(BookDaoService.class);
		bean.storeBookData();

	}

}
