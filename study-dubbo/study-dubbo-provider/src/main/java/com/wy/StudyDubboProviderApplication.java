package com.wy;

import org.apache.dubbo.container.Main;

/**
 * @description 使用这种方式启动dubbo的时候,配置文件必须放在资源文件的META-INF下,且后缀必须是xml,名字随意
 * @instruction 使用dubbo-admin,需要修改解压后的war包里的dubbo.properties的zk地址
 * @author ParadiseWy
 * @date 2019年4月28日 下午4:45:00
 * @git {@link https://github.com/mygodness100}
 */
public class StudyDubboProviderApplication {

	public static void main(String[] args) {
		Main.main(args);
	}
}