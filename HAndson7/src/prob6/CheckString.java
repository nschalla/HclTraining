package prob6;

public class CheckString {
	String humpty,word;
	int position;
public void check() {
	System.out.println(humpty.substring(0,position)+word+humpty.substring(position));
	
}
	public CheckString(String humpty, String word, int position) {
		super();
		this.humpty = humpty;
		this.word = word;
		this.position = position;
	}

	public CheckString() {
		super();
	}
}
