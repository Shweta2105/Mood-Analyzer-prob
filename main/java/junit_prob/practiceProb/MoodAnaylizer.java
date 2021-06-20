package junit_prob.practiceProb;

public class MoodAnaylizer {

	public String getMood(String matter) {
		if(matter.contains("sad")) {
			return "SAD";
		}else {
			return "HAPPY";
		}
	}

	

}
