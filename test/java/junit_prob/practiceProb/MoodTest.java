package junit_prob.practiceProb;

import org.junit.Assert;
import org.junit.Test;



public class MoodTest {
	@Test
	public void getmoodByPassingMsg() {
		MoodAnaylizer mood = new MoodAnaylizer();
		
		Assert.assertNotEquals("SAD", mood.getMood("I am in any mood"));
		System.out.println(mood.getMood("I am in any mood"));
		
	}

}
