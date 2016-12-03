package mood;

public class Sad {
	
	private String[] sad_mood_statements = {
		"When one door closes, another opens; but we often look so long and so regretfully upon the closed door that we do not see the one which has opened for us.",
		"Everybody has gone through something that has changed them in a way that they could never go back to the person they once were.",
		"You were never created to live depressed, defeated, guilty, condemned, ashamed or unworthy. You were created to be victorious.",
		"Be happy with what you have. Be excited about what you want.",
		"The happiest people don’t necessarily have the best of everything, they just make the best out of everything that comes their way"
	};
	
	public Sad() {
	}
	
	public String get_sad_mood_statement(int index) {
		return this.sad_mood_statements[index];
	}
}
