package prob3;

public class CheckString {
	String humpty;
	void reverse() {
		StringBuilder dumpty =new StringBuilder();
		dumpty.append(humpty);
		dumpty.reverse();
		System.out.println(dumpty);
		
	}
	public CheckString(String humpty) {
		super();
		this.humpty = humpty;
		
	}
	public CheckString() {
		super();
		// TODO Auto-generated constructor stub
	}
}
