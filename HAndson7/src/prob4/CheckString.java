package prob4;

public class CheckString {
	String humpty,replace,synom;
	public void check() {
	String replaceString=humpty.replaceFirst(replace,synom);
	System.out.println(replaceString);
	}
	public CheckString(String humpty, String replace,String synom) {
		super();
		this.humpty = humpty;
		this.replace = replace;
		this. synom= synom;
	}

	public CheckString() {
		super();
		// TODO Auto-generated constructor stub
	}

}
