package mood;

public class Happy {
	
	private String[] happy_mood_statements = {
		"The happiness of your life depends upon the quality of your thoughts.",
		"The worst part of success is trying to find someone who is happy for you.",
		"Let your smile change the world. Don’t let the world change your smile.",
		"Be the reason someone smiles today.",
		"Be happy for this moment. This moment is your life"
	};
	
	public Happy() {
	}
	
	public String get_happy_mood_statement(int index) {
		return this.happy_mood_statements[index];
	}
}
