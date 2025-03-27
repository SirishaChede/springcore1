package BeanLifeCycleMethodExample2;

public class BasketBallCoach implements Coach {
	BasketBallCoach()
	{
		System.out.println("In Constructor :" +getClass().getSimpleName());
	}
	@Override
	public String getDailyWorkout()
	{
		return "practice 15min everyday";
	}


}
