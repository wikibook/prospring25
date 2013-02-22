package com.apress.prospring2.ch12.timer.bday;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class BirthdayReminderExample {

	public static void main(String[] args) throws IOException {
		ApplicationContext ctx = new FileSystemXmlApplicationContext(
	        "src/conf/birthday-reminder-context.xml");
	    System.in.read();
	}
}
