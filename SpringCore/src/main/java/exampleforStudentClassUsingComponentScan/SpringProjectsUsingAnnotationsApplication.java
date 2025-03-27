package exampleforStudentClassUsingComponentScan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//in this method we can't create the bean and values also can,t give in the bean class we can give through 
//the @value annotation.but we can create bean class and write the @Configuration and @ComponentScan Annotations
//can be write.and put it on empty then it can directly create the object it on them in the inside.
public class SpringProjectsUsingAnnotationsApplication {

	public static void main(String[] args) {
		
		ApplicationContext con=new AnnotationConfigApplicationContext(bean.class);
		Student std=con.getBean(Student.class);
		std.display();
	}

}
