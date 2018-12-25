package com.lks.test;


import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.lks.beans.User;

public class Test {

	public static void main(String[] args) {
		FileSystemResource res=new FileSystemResource("src/com/lks/cfgs/applicationContext.xml");
		XmlBeanFactory factory=new XmlBeanFactory(res);
		User bean=factory.getBean("user",User.class);
		String result=bean.toString();
		System.out.println(result);
	}

}
