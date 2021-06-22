package junit_prob.practiceProb;


import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import junit_prob.practiceProb.MoodAnalyserException;
import junit_prob.practiceProb.MoodAnaylizer;


public class MoodTest {
	@Test
	public void getmoodByConstructorShouldReturn_SAD() {
		 MoodAnaylizer moodAnalyser = new MoodAnaylizer(null);
	        try {
	            moodAnalyser.analyseMood();
	        }catch (MoodAnalyserException e) {
	            Assert.assertNotEquals(MoodAnalyserException.Code.NULL, e.code);
	        }
		
	}
	
	
		
}