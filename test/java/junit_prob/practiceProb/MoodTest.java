package junit_prob.practiceProb;


import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import junit_prob.practiceProb.MoodAnalyserException;
import junit_prob.practiceProb.MoodAnaylizer;


public class MoodTest {
	@Test
	public void getmoodByConstructorShouldReturn_SAD() throws Exception {
		MoodAnaylizer anaylseMood = new MoodAnaylizer("I am in Sad mood");
		String mood;
		try {
			mood = anaylseMood.analyseMood();
			assertEquals("SAD",mood);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
	
	@Test
	public void getmoodByConstructorShouldReturn_HAPPY() throws MoodAnalyserException {
		MoodAnaylizer anaylseMood = new MoodAnaylizer("I am in Happy mood");
		String mood;
		try {
			mood = anaylseMood.analyseMood();
			assertEquals("HAPPY",mood);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
		
		@Test
		public void getmoodByConstructorShouldReturn_Empty() throws MoodAnalyserException {
			MoodAnaylizer anaylseMood = new MoodAnaylizer("");
			String mood;
			try {
				mood = anaylseMood.analyseMood();
				assertEquals("Empty",mood);
			}catch(Exception e) {
				System.out.println(e);
			}
			
	}
		@Test
		public void getmoodByConstructorShouldReturn_NULL() throws MoodAnalyserException {
			MoodAnaylizer anaylseMood = new MoodAnaylizer(null);
			String mood;
			try {
				mood = anaylseMood.analyseMood();
				assertEquals("null",mood);
			}catch(Exception e) {
				System.out.println(e);
			}
			
		}

}