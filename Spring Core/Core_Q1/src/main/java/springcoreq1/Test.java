package springcoreq1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("springq1.xml");
		context.registerShutdownHook();
		Customer cust=(Customer) context.getBean("customer");
		cust.customerDetail();
		context.close();
	}
}