package ExampleforLazyAnnotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=SpringApplication.run(main.class, args);
		Customer cus=con.getBean(Customer.class);
		cus.setName("siri");
		cus.setAddress("kottipalli");
		System.out.println(cus.toString());
		Order ord=con.getBean(Order.class);
		ord.setOrdername("pen");
		 ord.displayOrderInfo(); 
		
		

	}

}
