package com.apress.prospring2.ch12.timer;

import java.io.IOException;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TimerFactoryBeanExample {

	public static void main(String[] args) throws IOException {
		new FileSystemXmlApplicationContext("src/conf/timer-context.xml");
		System.in.read();

	}
}
