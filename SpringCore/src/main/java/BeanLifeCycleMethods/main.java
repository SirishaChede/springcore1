package BeanLifeCycleMethods;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
	

	

	    public static void main(String[] args) {
	        // Create the Spring context and load configuration
	        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

	        // Retrieve Customer bean (which also depends on Order bean)
	        Customer customer = context.getBean(Customer.class);
	        
	        // Using the Customer bean
	        customer.placeOrder();
	        
	        // Close the context (this triggers destruction of beans)
	        context.close();
	    }
	}



