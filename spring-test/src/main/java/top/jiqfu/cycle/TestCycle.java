package top.jiqfu.cycle;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCycle {
	@Test
	public void testCycle() {
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("cycle.xml");
		A a = applicationContext.getBean(A.class);
		System.out.println(a.getB());
		B b = applicationContext.getBean(B.class);
		System.out.println(b.getA());
	}
}
