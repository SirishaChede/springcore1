package ExampleforValueAnnotationUsingApplicationProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
//@PropertySource("classpath:application.properties")
public class User {
	 @Value("${user.username}")  // Injecting value from properties file
	    private String username;

	    @Value("${user.age}")  // Injecting value from properties file
	    private String age;
	    @Autowired
	    private Address address;

	    // Getter methods
	    public String getUsername() {
	        return username;
	    }

	    public String getAge() {
	        return age;
	    }

	    @Override
	    public String toString() {
	        return "User{username='" + username + "', age=" + age + "',address="+address+"}";
	    }
	}

