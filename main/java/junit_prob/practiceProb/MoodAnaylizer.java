package junit_prob.practiceProb;

import java.util.*;

import junit_prob.practiceProb.MoodAnalyserException.Code;

public class MoodAnaylizer {
	
	 private String message;

	    //Parameterized Constructor
	    public MoodAnaylizer(String message) {
	        this.message = message;
	    }

	    public String analyseMood(String message) throws MoodAnalyserException {
	        this.message = message;
	        return analyseMood();
	    }

	    public String analyseMood() throws MoodAnalyserException {
	        try {
	            if (message.contains("SAD"))
	                return "SAD";
	            else
	                return "HAPPY";
	        } catch (NullPointerException e) {
	            throw new MoodAnalyserException(Code.INVALID,"Please Enter a Proper Message");
	        }
	    }
	}
	

