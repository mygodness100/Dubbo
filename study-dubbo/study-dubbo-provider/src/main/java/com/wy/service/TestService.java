package com.wy.service;

import com.wy.interfaces.ITest;

/**
 * @description dubbo接口的实现类
 * @instruction dubbo由阿里贡献给了apache,以前alibaba的包都改成apache的包
 * @instruction 此处的service注解是apache的,而不是spring的
 * @question 当使用@Service注解时,低版本的dubbo会跟spring的aop的有冲突,此时只能用配置文件
 * @author ParadiseWY
 * @date 2019年4月28日 下午3:16:09
 * @git {@link https://github.com/mygodness100}
 */
public class TestService implements ITest {

	@Override
	public String test1(String name) {
		return "传过来的name是:" + name;
	}
}