package CustomerOrderUsingConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con= new AnnotationConfigApplicationContext(bean.class);
		Customer Cust=con.getBean(Customer.class);
		Order order=con.getBean(Order.class);
		System.out.println(order);
		System.out.println(Cust);

	}

}
