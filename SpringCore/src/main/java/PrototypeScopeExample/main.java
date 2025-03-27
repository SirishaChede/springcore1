package PrototypeScopeExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
	public static void main(String[]Args) {
		ApplicationContext con=new AnnotationConfigApplicationContext(BeanConfig.class);
		Student s=con.getBean(Student.class);
		s.display();
		s.setQualification("Degree");
		System.out.println(s);
		System.out.println(s);
		Student s1=con.getBean(Student.class);
		System.out.println(s1);
		
	}

}
