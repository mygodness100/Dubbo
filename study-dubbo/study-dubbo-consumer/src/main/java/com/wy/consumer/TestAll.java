package com.wy.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description
 * @author ParadiseWY
 * @date 2019年4月28日 下午4:57:11
 * @git {@link https://github.com/mygodness100}
 */
public class TestAll {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "spring-dubboConsumer.xml" });
		context.start();
		Test bean = context.getBean("test", Test.class);
		System.out.println(bean);
		bean.test("那是谁");
		context.close();
	}
}