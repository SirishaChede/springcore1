package FieldInjectionExample;
//field injection means it contain value and component annotations

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class User {
	@Value("${User.id}")
	private int id;
	@Value("${User.name}")
	private String name;
	@Value("${User.age}")
	private int age;
	
	@Override
	public String toString() {
		return "id:"+id+",name:"+name+",age:"+age;
		
	}
	

}
