package ExampleForInterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new AnnotationConfigApplicationContext(BeanConfig.class);
		Staff s=con.getBean(Doctor.class);
		s.assist();
		Staff s1=con.getBean(Nurse.class);
		s1.assist();

	}

}
