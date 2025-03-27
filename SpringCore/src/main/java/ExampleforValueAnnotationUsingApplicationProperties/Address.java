package ExampleforValueAnnotationUsingApplicationProperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class Address {
	@Value("${address.street}")  // Injecting value from properties file
    private String street;

    @Value("${address.city}")  // Injecting value from properties file
    private String city;

    // Getter methods
    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Address{street='" + street + "', city='" + city + "'}";
    }
}


