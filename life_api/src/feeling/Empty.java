package feeling;

public class Empty {
	
	String[] feeling_mood_statements = {};
	
	public Empty() {
		
	}
	
	public String get_feeling_mood_statements(int index) {
		return this.feeling_mood_statements[index];
	}
}
