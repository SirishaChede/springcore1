package BeanLifeCycleMethodExample2;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
@Component
public class CricketCoach implements Coach {
	CricketCoach()
	{
		System.out.println("In Constructor :" +getClass().getSimpleName());
	}
	@PostConstruct
	public void doMyStartupStuff()
	{
		System.out.println("doMyStartupStuff : " +getClass().getSimpleName());
	}
	@PreDestroy
	public void doMyCleanupStuff()
	{
		System.out.println("doMyCleanupStuff : " +getClass().getSimpleName());
	}
	@Override
	public String getDailyWorkout()
	{
		return "practice bowling 15mi9n everyday";
	}

}
