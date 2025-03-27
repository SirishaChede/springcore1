package ExampleForInterface;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="ExampleForInterface")
public class BeanConfig {
	
	@Bean
	public Doctor doctor() {// this can be used we can't create the @component annotation then this type can be written 
		return new Doctor();
	}

}
