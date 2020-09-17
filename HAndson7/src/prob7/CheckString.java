package prob7;

public class CheckString {
	String humpty,dumpty;
public void check() {
	if(humpty.length()==dumpty.length()) {
		System.out.println("both are  same length");
	}
	else {
		System.out.println("both are not same length");
	}
}
	public CheckString(String humpty, String dumpty) {
		super();
		this.humpty = humpty;
		this.dumpty = dumpty;
	}

	public CheckString() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
