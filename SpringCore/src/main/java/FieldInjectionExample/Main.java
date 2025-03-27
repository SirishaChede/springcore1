package FieldInjectionExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ApplicationContext con=new AnnotationConfigApplicationContext(User.class);
		User user=con.getBean(User.class);
				System.out.println(user);

	}

}
