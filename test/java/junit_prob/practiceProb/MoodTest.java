package junit_prob.practiceProb;

import org.junit.Assert;
import org.junit.Test;



public class MoodTest {
	@Test
	public void getmoodByPassingMsg() {
		MoodAnaylizer mood = new MoodAnaylizer();
		Assert.assertEquals("SAD", mood.getMood("I am in sad mood"));
		
		
	}

}
