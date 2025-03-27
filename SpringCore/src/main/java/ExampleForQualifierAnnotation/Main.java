package ExampleForQualifierAnnotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new AnnotationConfigApplicationContext(Bean.class);
				//SpringApplication.run(Main.class,args);
		Client client=con.getBean(Client.class);
		client.displayInfo();
		
		

	}

}
