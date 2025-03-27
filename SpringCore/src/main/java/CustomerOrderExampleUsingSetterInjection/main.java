package CustomerOrderExampleUsingSetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
	
		public static void main(String[] args) {
	ApplicationContext con=new AnnotationConfigApplicationContext(bean.class);
	Customer cus=con.getBean(Customer.class);
			Order ord=con.getBean(Order.class);
          
          System.out.println(ord);
          System.out.println(cus);
      
		}
}
