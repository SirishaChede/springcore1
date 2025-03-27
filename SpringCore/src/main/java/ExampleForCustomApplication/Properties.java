package ExampleForCustomApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
@Configuration
@PropertySource("applications.properties")
@SpringBootApplication
public class Properties {
	@Value("${info.gretting}")
	private String gretting;
	@Value("${info.name}")
	private String name;
	@Value("${info.id}")
	private String id;
	@Value("${info.address}")
	private String address;
	@Autowired
	public void display() {
		System.out.println("info gretting:"+gretting);
		System.out.println("info name:"+name);
		System.out.println("info id:"+id);
		System.out.println("info address:"+address);
		
	}
	public static void main(String[]args) {
		SpringApplication.run(Properties.class, args);
	}

}
