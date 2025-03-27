package AutowiredAnnotationExample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class bean {
	@Bean
	public Address address() {
		Address add=new Address();
		add.setDoorno(20);
		add.setVillagename("kottipalli");
		add.setPincode(521227);
		return add;
		
	}
	/*@Bean
	public Address address1() {
		Address add2=new Address();
		add2.setDoorno(6-9);
		add2.setVillagename("putrela");
		add2.setPincode(521215);
		return add2;*/
	
	
	
	@Bean
	public Student student() {
		Student std=new Student();
		std.setName("siri");
		std.setRollno(10);
		//std.setAddress();
		return std;
	}
	
	}
			
		
	


