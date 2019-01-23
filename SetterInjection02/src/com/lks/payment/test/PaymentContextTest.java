package com.lks.payment.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.lks.payment.beans.PaymentContext;

public class PaymentContextTest {

	public static void main(String[] args) {
		try {
			Resource res=new ClassPathResource("com/lks/payment/cfg/applicationContext.xml");
			BeanFactory factory=new XmlBeanFactory(res);
			PaymentContext ctx=factory.getBean("paymentCtx",PaymentContext.class);
			ctx.payBill(1000.00, 7878);
		}catch (Exception e) {
			e.printStackTrace();
		}
			
		}

	}


