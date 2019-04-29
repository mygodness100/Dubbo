package com.wy.consumer;

import com.wy.interfaces.ITest;

/**
 * @description reference若不能使用,则可以在配置文件中配置
 * @author ParadiseWY
 * @date 2019年4月28日 下午3:45:00
 * @git {@link https://github.com/mygodness100}
 */
public class Test {

	private ITest itest;

	public void test(String name) {
		System.out.println(itest);
		itest.test1(name);
	}
}