package junit_prob.practiceProb;

import junit_prob.practiceProb.MoodAnalyserException.Code;

public class MoodAnaylizer {
	public static String msg;
	
	public MoodAnaylizer() {
	
	}

	public MoodAnaylizer(String msg) throws MoodAnalyserException {
		super();
		this.msg = msg;
		
	}
	
	public String analyseMood() throws Exception {
		try {
			if(msg == null)
				throw new MoodAnalyserException(Code.NULL, "Null Mood");
			else if(msg.trim().isEmpty())
				throw new MoodAnalyserException(Code.EMPTY, "Empty Mood");
			else if(msg.toLowerCase().contains("sad")) {
				System.out.println("SAD");
				return "SAD";
			}
			else if(msg.toLowerCase().contains("happy")) {
				System.out.println("HAPPY");
				return "HAPPY";
			}
			
		}catch(NullPointerException e) {
			throw new MoodAnalyserException(Code.INVALID, "Empty mood		Please enter a mood");
		}
		
		return null;
		
	}

	

}