package AutowiredAnnotationExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new AnnotationConfigApplicationContext(bean.class);
		Student std=(Student)con.getBean(Student.class);
		
		Address add=(Address)con.getBean(Address.class);
		
		std.display();
		
		

	}

}
