package SingletoneScopeExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new AnnotationConfigApplicationContext(BeanConfig.class);
		Student s=con.getBean(Student.class);
		
		s.Display();
		s.setQualification("b.tech");
		System.out.println(s);
		Student s1=con.getBean(Student.class);
		System.out.println(s1);

	}

}
