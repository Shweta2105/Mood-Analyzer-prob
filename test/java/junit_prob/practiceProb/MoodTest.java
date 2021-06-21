package junit_prob.practiceProb;

import org.junit.Assert;
import org.junit.Test;



public class MoodTest {
	@Test
	public void getmoodByConstructor() {
		String mood = MoodAnaylizer.MoodAnaylizer(null);
		System.out.println(mood);
		mood= MoodAnaylizer.MoodAnaylizer();
		System.out.println(mood);
		Assert.assertEquals("HAPPY", mood);
		
		
	}

}