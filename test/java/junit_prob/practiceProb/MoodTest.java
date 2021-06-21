package junit_prob.practiceProb;

import org.junit.Assert;
import org.junit.Test;



public class MoodTest {
	@Test
	public void getmoodByConstructor() {
		String mood = MoodAnaylizer.MoodAnaylizer();
		System.out.println(mood);
		Assert.assertNotEquals("SAD", mood);
		
		
	}

}