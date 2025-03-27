package ExampleforValueAnnotationUsingApplicationProperties;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {

        // Initialize Spring context using AppConfig class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the User and Address beans from the Spring context
        User user = context.getBean(User.class);
        Address address = context.getBean(Address.class);

        // Print the user and address details
        System.out.println(user);
        System.out.println(address);

        // Close the Spring context
        context.close();
    }
}
