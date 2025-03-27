package ExampleforQualifierAnnotationUsingConstrutor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class Main {
	public static void main(String[]args) {
		ApplicationContext con=SpringApplication.run(Main.class, args);
		Client client=con.getBean(Client.class);
		client.display();
		
	}

}
